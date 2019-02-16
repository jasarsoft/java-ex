
package jasarsoft;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClientProcessor implements Runnable{
    private final Server server;
    private final Socket client;
    
    private Map<String, Class> commandMap = new HashMap<>();

    public ClientProcessor(Server server, Socket client) {
        this.server = server;
        this.client = client;
        
        commandMap.put("EXIT", ExitCommand.class);
        commandMap.put("AVERAGE", AverageCommand.class);
        commandMap.put("INSERT", InsertCommand.class);
    }

    @Override
    public void run() {
        try {
            PrintWriter printWriter = new PrintWriter(client.getOutputStream());
            Scanner scanner = new Scanner(client.getInputStream());
            process(printWriter, scanner);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void process(PrintWriter out, Scanner in) throws IOException {
        out.println("Welcome");
        out.flush();
        
        while (true) {
            String command = getCommand(out, in);
            
            Class klasa = getClassForCommand(command);
            
            try {
            Command cmd = (Command) klasa
                    .getDeclaredConstructor(
                        new Class[] {
                            Server.class, 
                            Socket.class
                        })
                    .newInstance(new Object[] { server, client });
            
            cmd.execute(command);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            
            
            
        }
    }
    
    private Class getClassForCommand(String command){
        Scanner s = new Scanner(command);
        String commandName = s.next().trim().toUpperCase();
        
        if (commandMap.containsKey(commandName)) {
            return commandMap.get(commandName);
        }
        
        return NoCommand.class;
    }
    
    private String getCommand(PrintWriter out, Scanner in){
        String command = "";
        
        while (command.equals("")) {
            out.print("? ");
            out.flush();
            try {
                command = in.nextLine().trim().toUpperCase();
            } catch (Exception e) {
                command = "EXIT";
            }
            
        }
        
        return command;
    }
}

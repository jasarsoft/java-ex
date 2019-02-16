
package jasarsoft;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class InsertCommand extends Command {

    public InsertCommand(Server server, Socket client) {
        super(server, client);
    }

    @Override
    public void execute(String command) {
        try{
            PrintWriter out = new PrintWriter(getClient().getOutputStream());

            Scanner commandScanner = new Scanner(command);
            commandScanner.next(); //skip insert
            long timestamp = commandScanner.nextLong();
            double value = commandScanner.nextDouble();
            getServer().getDatabase().add(new TemperatureMeasurement(timestamp, value));
            out.println("Added " + timestamp + " = " + value);
            out.flush();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}

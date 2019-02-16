
package jasarsoft;

import java.io.PrintWriter;
import java.net.Socket;

public class NoCommand extends Command {

    public NoCommand(Server server, Socket client) {
        super(server, client);
    }

    @Override
    public void execute(String command) {
         try{
            PrintWriter out = new PrintWriter(getClient().getOutputStream());
            out.println("Unknown command...");
            out.flush();
         } catch (Exception e) {
             System.err.println(e.getMessage());
         }
    }
    
    
}

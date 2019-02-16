
package jasarsoft;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class AverageCommand extends Command {

    public AverageCommand(Server server, Socket client) {
        super(server, client);
    }
    
    @Override
    public void execute(String command) {
        try{
            PrintWriter out = new PrintWriter(getClient().getOutputStream());
 
            double avarage = getServer().getDatabase().getAvaregeTemperature();
            out.println(avarage);
            out.flush();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}

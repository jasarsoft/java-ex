
package jasarsoft;

import java.net.Socket;


public class ExitCommand extends Command{

    public ExitCommand(Server server, Socket client) {
        super(server, client);
    }
    
    @Override
    public void execute(String command) {
        try {
            getClient().close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
    
}

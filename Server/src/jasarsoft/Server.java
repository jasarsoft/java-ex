
package jasarsoft;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final TemperatureMeasurementDatabase database;
    private ServerSocket serverSocket;

    public Server(TemperatureMeasurementDatabase database) throws IOException{
        this.database = database;
        serverSocket = new ServerSocket(7633, 100);
    }

    
    public TemperatureMeasurementDatabase getDatabase() {
        return database;
    }

    
    private void serverLoop() throws IOException{
        while (serverSocket.isBound() && !serverSocket.isClosed()){
            Socket client = serverSocket.accept();
            ClientProcessor clientProcessor = new ClientProcessor(this, client);
            new Thread(clientProcessor).start();
        }
    }
}

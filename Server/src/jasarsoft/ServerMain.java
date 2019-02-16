
package jasarsoft;

public class ServerMain {

    public static void main(String[] args) {
        
        try {
            TemperatureMeasurementDatabase database = new TemperatureMeasurementDatabase();
            Server server = new Server(database);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

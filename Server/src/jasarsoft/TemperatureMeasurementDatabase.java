
package jasarsoft;

import java.util.ArrayList;
import java.util.List;

public class TemperatureMeasurementDatabase {
    private final List<TemperatureMeasurement> values = new ArrayList<>();
    
    public TemperatureMeasurementDatabase(){}
    
    synchronized public void add(TemperatureMeasurement measurement){
        values.add(measurement);
    }
    
    synchronized  public double getAvaregeTemperature(){
        return values.stream().mapToDouble(m -> m.getValue()).average().orElse(0.0);
    }
    
    synchronized public int getMeasurementCount(){
        return values.size();
    }
}

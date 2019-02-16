
package jasarsoft;

public class TemperatureMeasurement {
    public final long timestamp;
    public final double value;

    public TemperatureMeasurement(long timestamp, double value) {
        this.timestamp = timestamp;
        this.value = value;
    }
    
    public long getTimestamp(){
        return timestamp;
    }
    
    public double getValue(){
        return value;
    }
}

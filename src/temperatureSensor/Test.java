package temperatureSensor;

public class Test {
	
	public static void main(String [] args) {

	Observer thermometer = new thermometer tm ();
	Observer display = new Display();
	
	TemperaturSensor ts = new TemperaturSensor ();
	
	ts.addObserver(thermometer));
	ts.addObserver(Display));
	
}

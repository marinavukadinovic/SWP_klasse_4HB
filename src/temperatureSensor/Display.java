package temperatureSensor;

public class Display implements Observer{

	private double temperature;

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void update (double temperature) {
		setTemperature (temperature);
	}
	
	
}
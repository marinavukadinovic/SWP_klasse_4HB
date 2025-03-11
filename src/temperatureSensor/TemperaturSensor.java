package temperatureSensor;

import java.util.ArrayList;
import java.util.List;

public class TemperaturSensor extends Subject{

	private double temperature;
	
	private List <Observer> observer;
	
	public TemperaturSensor() {
		this.observer = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer OS) {
		this.observer.add(OS);
	}
	
	public void removeObserver(Observer OS) {
		this.observer.remove(OS);
	}
	
	public double getTemperature() {
		return this.temperature;
	} 
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
		for (Observer OS : observer) {
			OS.update(temperature);
		}
	}
}

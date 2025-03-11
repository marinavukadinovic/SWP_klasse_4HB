package stockMonitoring;

import java.util.ArrayList;
import java.util.List;
import temperatureSensor.Observer;

public class StockPrice {

	private double StockPrice;

	private List <Observer> Observer;
	
	public StockPrice() {
		this.Observer = new ArrayList<Observer>();
		
	}
	
	public void addObserver(Observer os) {
		this.Observer.add(os);
	}
	
	public void removeObserver(Observer os) {
		this.Observer.add(os);
	}
	
	public void notifyObserver(Observer os) {
		 for (Observer os : Observer) {
	            Observer.update(StockPrice);
	        
	}
	}}

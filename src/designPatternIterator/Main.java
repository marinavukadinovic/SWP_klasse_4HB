package designPatternIterator;

public class Main {
	
	public static void main(String[]args) {
		NotificationCollection nc = new NotificationCollection(nc);
		NotificationBar nb = new NotificationBar (nc);
		nb.addItem("N1");
		nb.addItem("N2");
		nb.addItem("N3");
		nb.addItem("N4");
		nb.printNotifications();
		
		
	}
}


/* 
Single Responsibility Prinzip - Aufteilen und mehrere Klassen machen
*/
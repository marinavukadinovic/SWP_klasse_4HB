package designPatternComposite;

public class ShapeTest {

	public static void main(String[] args) {
		// atomare Elemente erstellen
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		Shape s3 = new Triangle();
		
		// zusammengesetztes Element erstellen
		Shape cs1 = new ComposedShape();
		cs1.add(s1);
		cs1.add(s2);

		// geschachtelte zusammengesetzte Elemente
		Shape cs2 = new ComposedShape();
		cs2.add(s3);
		cs2.add(cs1);
		
		// einfachen Einstiegspunkt über Screen
		Screen screen1 = new Screen (cs1);
		screen1.display();
		Screen screen2 = new Screen (cs2);
		screen2.display();
	}

}

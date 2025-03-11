package designPatternComposite;

import java.util.ArrayList;
import java.util.List;

public class ComposedShape extends Shape{
	
	private List<Shape> shapes;
	
	public ComposedShape() {
		shapes = new ArrayList<Shape> ();
		
	}
	
	public void display() {
		System.out.print("[");
		for (Shape s : shapes) {
			s.display();
		}
		System.out.print ("]");
	}

	public void add(Shape s) {
		this.shapes.add(s);
		
		
	}

	
}

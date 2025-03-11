package designPatternComposite;

public class Screen {

	private Shape composedShape;
	
	public Screen(Shape s) {
		this.composedShape = s;
	}
	
	public void display() {
		this.composedShape.display();
		System.out.print("\n");
		
		
	}

	public Shape getComposedShape() {
		return composedShape;
	}

	public void setComposedShape(Shape composedShape) {
		this.composedShape = composedShape;
	}
}

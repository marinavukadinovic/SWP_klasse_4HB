package designPatternComposite;

public class Rectangle extends Shape {

	public void display() {
		System.out.print("Rectangle");
	}

	public void add(Shape s) {
			// 1) Leermethode - kein Feedback
			// 2) Konsolenausgabe - nicht für GUI
			// 3) Exception - wer behandelt diese?
	}
}

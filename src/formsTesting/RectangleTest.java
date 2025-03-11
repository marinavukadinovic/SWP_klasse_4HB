package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class RectangleTest {
	@Test
	  public void testCalculateArea() {
		  Rectangle r = new Rectangle(4, 3, 2, 1);
		  double area = r.calculateArea();
		  Assert.assertEquals(area, 5*4);
	  }

		
@Test
public void testCalculateCircumference() {
	  Rectangle r = new Rectangle(7, 9, 2, 6);
	  double circumference = r.calculateCircumference();
	  Assert.assertEquals(circumference, 2 + 6);
}


@Test
public void testToString() {
	  Rectangle r = new Rectangle(1, 2, 3, 4);
	  String text = r.toString();
	  Assert.assertEquals(text, "Rectangle (" + r.getX() + "|" + r.getY() + ") with width = " + r.getWidth() + " and length = " + r.getLength());
}



}
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
}

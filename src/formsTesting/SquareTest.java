package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

      @Test
      public void testCalculateArea() {
    	  Square ss = new Square (1, 2, 3);
    	  double area = ss.calculateArea();
    	  Assert.assertEquals(area, 3*1);
      }
    
    

      @Test
      public void testCalculateCircumference() {
    	  Square ss = new Square(3, 2, 1);
    	  double circumference = ss.calculateCircumference();
    	  Assert.assertEquals(circumference, (1+1)*2);
      }
      
      
      @Test
      public void testToString() {
    	  Square ss = new Square (3,3,3);
    	  String text = ss.toString();
    	  Assert.assertEquals(text, "Square (" + ss.getX() + "|" + ss.getY() + ") with width = " + 3.0);
      }
      
}
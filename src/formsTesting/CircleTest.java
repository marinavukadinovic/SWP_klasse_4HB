package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTest {
	
	
	
  @Test
  
  public void TestCalculateArea() {
	  Circle cc = new Circle(3,2,4);
	  double area = cc.calculateArea();
	  Assert.assertEquals(area, 4*4*Math.PI);
	
  }
  
  @Test
  
  public void TestCalculateArea1() {
	  Circle cc = new Circle(1,2,3);
	  double area = cc.calculateArea();
	  Assert.assertEquals(area, 3*3*Math.PI);
  }
  

  @Test
  
  public void calculateCircumference() {
	  Circle cc = new Circle(3,2, 4);
	  double result = cc.calculateCircumference();
	  Assert.assertEquals(result,2*4*Math.PI);
  }
  
  
  @Test
  
  public void calculateCircumference1() {
	  Circle cc = new Circle(1,2, 3);
	  double result = cc.calculateCircumference();
	  Assert.assertEquals(result,2*3*Math.PI);
  }
  }




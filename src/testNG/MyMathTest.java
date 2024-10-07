package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyMathTest {
	
  @Test
  public void testAddition() {
	  MyMath mm = new MyMath();
	  int result = mm.add(4, 2);
	  Assert.assertEquals(result, 6);
  }
  
  @Test
   public void testSubtraction() {
	  MyMath mm = new MyMath();
	  int result = mm.add(4, 2);
	  Assert.assertEquals(result, 2);
  }
  
  @Test
  public void testMultiplication() {
	  MyMath mm = new MyMath();
	  int result = mm.add(4, 2);
	  Assert.assertEquals(result, 8);

  }
  
  
  @Test
  public void testDevision() {
	  MyMath mm = new MyMath();
	  int result = mm.add(4, 2);
	  Assert.assertEquals(result, 4.5);
}
}
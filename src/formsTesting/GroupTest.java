package formsTesting;
import org.testng.Assert;
import org.testng.annotations.Test;
public class GroupTest {

  
  @Test
  public void testAddForm() {
	  Group gg = new Group();
	  Rectangle rr = new Rectangle (2, 4, 6, 8);
	  Square ss = new Square (8, 8, 8);
	  Circle cc = new Circle (0, 8, 2);
	  gg.addForm(cc);
	  gg.addForm(ss);
	  gg.addForm(rr);
	  Assert.assertEquals(gg.getForms().size(), 3);
  }
  
  

  @ Test
  
  public void testCalculateArea() {
	  Group gg = new Group();
	  Rectangle rr = new Rectangle (2, 4, 5, 7);
	  Square ss = new Square (7, 7, 9);
	  gg.addForm(ss);
	  gg.addForm(rr);
	  double res = gg.calculateArea();
	  Assert.assertEquals(res, 22);
  }
  
  
 
  @Test
  public void testCircumference() {
	  Group gg = new Group();
	  Rectangle rr = new Rectangle (2, 9, 8, 9);
	  Square ss = new Square(3, 3, 2);
	  gg.addForm(ss);
	  gg.addForm(rr);
	  double res = gg.calculateCircumference();
	  Assert.assertEquals(res, 21);
	  
  }
  
  
 
  @Test
  public void testFindBiggestForm() {
	  Group gg = new Group();
	  Rectangle rr = new Rectangle (2, 3, 4, 2);
	  Square ss = new Square (8, 7, 6);
	  gg.addForm(ss);
	  gg.addForm(rr);
	  Form ff = gg.findBiggestForm();
	  Assert.assertEquals(f, ss);
	  
  }
  
  
}

 
public class testcylinder
 {
   public static void main(String[] args) {
      cylinder cy1 = new cylinder();
      System.out.println("Radius is " + cy1.getRadius()
         + " Height is " + cy1.getHeight()
         + " Color is " + cy1.getColor()
         + " Base area is " + cy1.getArea()
         + " Volume is " + cy1.getVolume());
   
      cylinder cy2 = new cylinder(5.0, 2.0);
      System.out.println("Radius is " + cy2.getRadius()
         + " Height is " + cy2.getHeight()
         + " Color is " + cy2.getColor()
         + " Base area is " + cy2.getArea()
         + " Volume is " + cy2.getVolume());
   }
}
public class cylinder extends circle3 
{
   
   private double height;
   
   
   public cylinder() {
      super();  
      this.height = 1.0;
   }
   public cylinder(double height) {
      super();  
      this.height = height;
   }
   public cylinder(double height, double radius) {
      super(radius); 
      this.height = height;
   }
   public cylinder(double height, double radius, String color) {
      super(radius, color);  
      this.height = height;
   }
   
   public double getHeight() {
      return this.height;
   }
   public void setHeight(double height) {
      this.height = height;
   }

   public double getVolume() {
      return getArea()*height;   
   }

   
   public String toString() {
      return "This is a cylinder";  
         }
}
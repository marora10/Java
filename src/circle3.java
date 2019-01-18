public class circle3
{
      private double radius;
   private String color;


   public circle3() {
      this.radius = 1.0;
      this.color = "red";
   }
   public circle3(double radius) {
      this.radius = radius;
      this.color = "red";
   }
   public circle3(double radius, String color) {
      this.radius = radius;
      this.color = color;
   }

   public double getRadius() {
      return this.radius;
   }
   public String getColor() {
      return this.color;
   }
   public void setRadius(double radius) {
      this.radius = radius;
   }
   public void setColor(String color) {
      this.color = color;
   }


   public String toString() {
      return "circle3[radius=" + radius + ",color=" + color + "]";
   }


   public double getArea() {
      return radius * radius * Math.PI;
   }
}
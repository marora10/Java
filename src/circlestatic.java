class circlestatic
{
	 private double radius; 
	 private static int numberofobjjects=0;
	double area;
	public void setRadius()
	{
		radius=5;
	}
	public void getRadius()
	{
		System.out.print(radius);
	}
	void findarea()
	{
	area=3.14*radius*radius;
	}
	void displayarea()
	{
	System.out.print("The area is:" +area);
	}
}
public class circlestatictest 
{
	public static void main(String args[])
	{
		circlestatic circle1=new circlestatic();
		System.out.print("circle information");
		circle1.setradius(5);
		System.out.print("circle1 radius:"+circle1.getradius());
		System.out.println("The number of circle objects:"+circlestatic.getnumberofobjects());
		circlestatic circle2=new circlestatic();
		circle1.findarea();
		circle2.setradius(5);
		System.out.print("circle1 radius:"+circle2.getradius());
		System.out.println("The number of circle objects:"+circlestatic.getnumberofobjects());
		circle2.findarea();
	}          
}
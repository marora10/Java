class circle2
{
	 private double radius; 
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
class circledemo2
{
	public static void main(String args[])
	{
		circle c=new circle();
		c.radius=2;
		c.findarea();
		c.displayarea();
	}
}
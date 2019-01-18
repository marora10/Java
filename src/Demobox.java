class Demobox
{
	public static void main(String args[])
	{
	box mybox1=new box(10.0,20.0,30.0);
	box mybox2=new box();
	double area,perimeter;
	area=mybox1.getarea();
	System.out.print("the area is:" +area);
	perimeter=mybox2.getperimeter();
	System.out.print("the perimeter is:" +perimeter);
    mybox2.print();
	}
}
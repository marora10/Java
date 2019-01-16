class Box2
{
	double width;
	double height;
	double depth;
	Box2()
	{
		System.out.println("Constructing Box");
	width=1;
	height=1;
	depth=1;
	}
	Box2(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
Box2(double len)
{
	width=height=depth=len;
}
double volume()
{
	return width*height*depth;
}
}
class boxdemo4
{
	public static void main(String args[])
	{
		Box2 mybox1=new Box2();
		Box2 mybox2=new Box2(3,6,9);
	double vol;
	vol=mybox1.volume();
	System.out.print("Volume is:"+vol);
		vol=mybox2.volume();
	System.out.print("Volume is:"+vol);
	Box2 mycube= new Box2(7);
	vol=mycube.volume();
	System.out.println("Volume of my cube is"+vol); 
		}
}
class Shape
{
	public void display()
	{System.out.println("This is shape class");}
	}
	class Rectangle extends Shape
	{
	public void display()
	{System.out.println("This is rectangle class");
	}
	public void increaselength()
	{
	System.out.println("Length is increased");
}

	}
	class Rectangledemo 
	{
	public static void main(String args[])
		{
	Rectangle c=new Rectangle();
	Shape s=new Shape();
	Rectangle c2=(Rectangle) s;
	c2.display();

	
	c2.increaselength();

	}
	}
import java.util.*;
class ExceptionTest
{
	 public static void main(String[] args) {
	 	String s=null;
	 	Scanner scan= new Scanner(System.in);
	 	s=scan.next();
	 	try
	 	{
	 		if(s==null)
	 		{
	 			throw new Exception("you entered a null string");
	 		}
	 		else
	 		{
	 			System.out.println("The entered string is"+s);
	 		}
	 	}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("The program is executed successfully");
		}
	}
}
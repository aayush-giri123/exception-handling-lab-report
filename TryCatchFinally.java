package aayush;

public class TryCatchFinally {

	public static void main(String[] args) {
		int a[]= {5,10};
		int b=5;
		try
		{
			int x=a[2]/(b-a[1]);
		}
		catch(ArithmeticException e)
		{
			 System.out.println(e.getLocalizedMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			 System.out.println(e.getLocalizedMessage());
		}
		finally
		{
			int y=a[1]/a[0];
			System.out.println("y="+y);
		}
		
		

	}

}

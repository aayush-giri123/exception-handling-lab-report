package aayush;

public class Throwexample {
	public static void main(String[] args)
	{
		
		        try {
		            
		            validateAge(15);
		        } catch (IllegalArgumentException e) {
		           
		            System.out.println("Caught an exception: " + e.getMessage());
		        }
		    }

		    
		    static void validateAge(int age) {
		        if (age < 18) {
		            
		            throw new IllegalArgumentException("Age must be 18 or older");
		        } else {
		            System.out.println("Age is valid: " + age);
		        }
		    }
}
		

	






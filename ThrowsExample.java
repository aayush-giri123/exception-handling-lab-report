package aayush;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExample {
	

	
	    public static void main(String[] args) {
	        try {
	             readFile("example.txt");
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + e.getMessage());
	        } catch (IOException e) {
	            System.out.println("IOException: " + e.getMessage());
	        }
	    }

	   
	    static void readFile(String filename) throws FileNotFoundException, IOException {
	        
	        
	        throw new IOException("Simulated IOException while reading file: " + filename);
	    }
	}




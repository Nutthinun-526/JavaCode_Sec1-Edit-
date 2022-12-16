import java.text.*;
import java.util.*;

public class SalespersonSalary {

	public static void main(String[] args) {
		
		NumberFormat a = NumberFormat.getCurrencyInstance();
		// Declare constants
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1; // Terminating value for input
		// Declare variables
		int sales = 0; // Input gross sales
		double salary; // Salary to be computed
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
			
			while(sales != SENTINEL){
				System.out.println("Enter sales in dollars (or -1 to end): ");
		        sales = scan.nextInt();
		       
		        if(sales == SENTINEL) {
			    System.out.println("bye");
			    }
		        
		        else if (sales != SENTINEL)  {
		        	salary =(1000+(sales*COMMISSION_RATE));
				    System.out.println("Salasy is: "+a.format(salary));
				    System.out.println();
		        }
			}

	}

}

import java.text.*;
import java.util.*;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		
		// Declare constants first (variables may use these constants)
				final double TAX_RATE_ABOVE_20K = 0.1;
				final double TAX_RATE_ABOVE_40K = 0.2;
				final double TAX_RATE_ABOVE_60K = 0.3;
				// Declare variables
				int taxableIncome = 0;
				double taxPayable;
		        int a = 0;
				// Compute tax payable in "double" using a nested-if to handle 4 cases
				//if (taxableIncome <= 20000) { // [0, 20000]
				//taxPayable = ......;
				//} else if (taxableIncome <= 40000) { // [20001, 40000]
				//taxPayable = ......;
				//} else if (taxableIncome <= 60000) { // [40001, 60000]
				//taxPayable = ......;
				//} else { // [60001, ]
				//taxPayable = ......;
				//}
				//......
				
				NumberFormat b = NumberFormat.getCurrencyInstance();
				Scanner scan = new Scanner(System.in);
						
				
		        while(taxableIncome != a) {
		        	
		        System.out.println("Enter the taxable income: $");
		        taxableIncome = scan.nextInt();
		        
				if (taxableIncome <= 20000) { // [0, 20000]
				taxPayable = taxableIncome*0/100;
				System.out.println("The income tax payable is: "+b.format(taxPayable));
				} 
				else if (taxableIncome <= 40000) { // [20001, 40000]
				taxPayable = (taxableIncome*0/100)+(taxableIncome*10/100);
				System.out.println("The income tax payable is: "+b.format(taxPayable));
				} 
				else if (taxableIncome <= 60000) { // [40001, 60000]
				taxPayable = (taxableIncome*0/100)+(taxableIncome*10/100)+(taxableIncome*20/100);
				System.out.println("The income tax payable is: "+b.format(taxPayable));
				} 
				else { // [60001, ]
				taxPayable = (taxableIncome*0/100)+(taxableIncome*10/100)+(taxableIncome*20/100)+(taxableIncome*30/100);
				System.out.println("The income tax payable is: "+b.format(taxPayable));
				}
		     }

	}

}

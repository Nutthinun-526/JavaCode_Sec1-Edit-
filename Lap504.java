import java.text.*;
import java.util.Scanner;

public class Lap504 {
	
	static 	int countoofSpace=0;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space."
				+ "\n:");
		String fullName = scan.nextLine();
		int space = fullName.indexOf(' ');
		String name = fullName.substring(0,space);

		
		System.out.println(abbreviatName(fullName)+name.substring(0,1).toUpperCase()+name.substring(1));
		

		 
	}
	
	public static String abbreviatName(String fullName) {
		String initialLetter="";		
		for(int i =0;i<fullName.length();i++) {
			if (fullName.charAt(i)==' ') {
				initialLetter = (initialLetter+fullName.charAt(i+1)).toUpperCase();				
				initialLetter = initialLetter+".";
			}			
		
		}
		return initialLetter;

	}

}

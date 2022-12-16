import java.util.*;

public class Lap401 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
	int countoofSpace=0;
	int check=0;			

		for(int i =0;i<fullName.length();i++) {
			if (fullName.charAt(i)==' ') {
				countoofSpace++;
			}
		}
		if(countoofSpace==0) {
			System.out.print("Incorrect Name");
		}
		else {
			check = fullName.indexOf(' ');
			String firstName = fullName.substring(0,check);
			String lastName = fullName.substring(check,fullName.length());
			
			System.out.print("Firt Name: "+firstName.toUpperCase());
			System.out.print("\nLast Name:"+lastName.toLowerCase());
		}

	}

}

import java.util.*;

public class Lap402 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();

		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();
		}
		System.out.println();

		int j=0;
		for(int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i) == ' ') {
               System.out.println(sentence.substring(j,i));
               		j=i+1;
			}

		}
		System.out.println(sentence.substring(j));

	}

}

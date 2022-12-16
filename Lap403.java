import java.util.Scanner;

public class Lap403 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Messsage : ");
		String message = scan.nextLine();
        
		if(message.indexOf("nichi")>=0||message.indexOf("Nichi")>=0) {
			System.out.print("Nichi is a sentence");			
		}
		else {
            System.out.print(message);
		}

	}

}

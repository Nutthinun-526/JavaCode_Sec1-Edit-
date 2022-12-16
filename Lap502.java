import javax.swing.*;

public class Lap502 {

	static String email;
	
	public static void main(String[] args) {
		
		inputEmail();//call inputEmailmethod ,method is not return value

	}
	
	public static void inputEmail() {
		String ans = "";
		do {
		email = JOptionPane.showInputDialog("Input your e-mail:");
		checkEmailError(email);
		ans = JOptionPane.showInputDialog("Continue[y||Y to continue] : ");
		}while(ans.equalsIgnoreCase("y"));
	}

	public static void checkEmailError(String checkEmail) {
		while (checkEmail.startsWith("@")||checkEmail.contains(" ")) {
			checkEmail = JOptionPane.showInputDialog("Input your e-mail, again:");
		}
		checkEmail = checkEmail.toLowerCase();
		boolean chckEmail = checkEmail.endsWith("@gmail.com")||checkEmail.endsWith("@hotmail.com");
		JOptionPane.showConfirmDialog
		(null, (chckEmail)?"Your e-mail is "+checkEmail : "Your e-mail is not @gmail.com or @hotmail.com");

	}

}

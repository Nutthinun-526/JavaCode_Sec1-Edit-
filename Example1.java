import javax.swing.*;

public class Example1 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Input Full name: ");
		int birtYear = Integer.parseInt(JOptionPane.showInputDialog("Input Birt Year: "));
        while(birtYear < 1980 || birtYear >2018) {
                birtYear = Integer.parseInt(JOptionPane.showInputDialog("Input Birt Year: "));
        }
        int gender = JOptionPane.showConfirmDialog(null,
        		"Are You Female?",
        		"Gender",
        		JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null,
        		"Full name: "+name+
        		"\nBirt year: "+birtYear+
        		"\nYour're "+((gender==0)?"Female":"Male"));

	}

}

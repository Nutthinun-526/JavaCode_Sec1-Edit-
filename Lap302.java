import java.text.*;
import javax.swing.JOptionPane;

public class Lap302 {

	public static void main(String[] args) {
		
DecimalFormat frm = new DecimalFormat("##.0");
		
		double weight = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weight"));
		
		double height = Double.parseDouble(
				JOptionPane.showInputDialog("Input Height"));
		
		double num = height/100; 
		//double a = weight/num;
		
		double b = 2;
		
		double bmi = weight/(Math.pow(num,b));
		
		
		
        if(bmi < 18.5) {
        	JOptionPane.showMessageDialog(null,
					"BMI = "+frm.format(bmi)+"\nYour're Underweight.","BMI",JOptionPane.WARNING_MESSAGE);
        }
        
        else if(bmi >=18.5||bmi <= 24.9) {
        	JOptionPane.showMessageDialog(null,
					"BMI = "+frm.format(bmi)+"\nYour're Normal-weight.","BMI",JOptionPane.WARNING_MESSAGE);	
        }
        else if(bmi >=25.0||bmi<=29.9) {
        	JOptionPane.showMessageDialog(null,
					"BMI = "+frm.format(bmi)+"\nYour're Overweight.","BMI",JOptionPane.WARNING_MESSAGE);
        }
        else if(bmi>=30.0) {
        	JOptionPane.showMessageDialog(null,
					"BMI = "+frm.format(bmi)+"\nYour're Obesity.","BMI",JOptionPane.WARNING_MESSAGE);
        }

	}

}

import javax.swing.*;

public class Lap104 {

	public static void main(String[] args) {
		
		String productName = JOptionPane.showInputDialog("Input product name: ");
		String productUnitstr=JOptionPane.showInputDialog("Input product unit: ");
		int productUnit = Integer.parseInt(productUnitstr);
		
		float productPriceperUnit = Float.parseFloat(
				JOptionPane.showInputDialog("Input price per unit: "));
		
		float totalPrice = productUnit*productPriceperUnit;
		float totalwithVat = totalPrice+(totalPrice*7/100);
		
		JOptionPane.showMessageDialog(null, 
				"Total Price is "+totalPrice+" baht."+
				"\nAdd VAT 7% is "+totalwithVat+" baht.");

	}

}

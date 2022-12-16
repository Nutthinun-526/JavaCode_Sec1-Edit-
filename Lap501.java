
public class Lap501 {

	public static void main(String[] args) {
		
		System.out.println(formatNumber(500));//call formatNumber method
		System.out.println(formatNumber('a'));
		System.out.println(formatNumber(89.9934));
		System.out.println(formatNumber("500")); //String strNum = formatNumber("500");
		System.out.println();

	}
	
	private static String formatNumber (int value) {
		return String.format("%d", value);
	}
	//Overloading method
	private static String formatNumber(double value) {
		return String.format("%.3f", value);
	}

	private static String formatNumber(String value) {
		return String.format("%.2f", Double.parseDouble(value));

	}

}


import javax.swing.JOptionPane;
public class Lap606 {

	public static void main(String[] args) {
    int nums[] = { 25, 78, 41, 22, 36, 85, 37 };
     
    int input = Integer.parseInt(JOptionPane.showInputDialog(null,"Input index of array"));

    while(input < 0|| input >(nums.length -1)) {
    	input = Integer.parseInt(JOptionPane.showInputDialog(null,"Input index of array"));
	
    }
		checkIndex(nums, input);
	
		JOptionPane.showMessageDialog("Current data, nums"+currentData(nums,input)""
				+ "\n"+prevData(nums,input)+"\n"+nextData(nums,input));
			
		
		
		

	}
	
	public static boolean checkIndex(int[] nums,int index) {
		while(index < 1 ||index >(nums.length)? true:false);
		return false;
	}
	
	
	public static int currentData(int[] nums,int index) {
		
		return nums[index];
	}
	
	public static int prevData(int[] nums,int index) {
	
		return nums[index-1];
	
	}
	
	public static int nextData(int[] nums,int index) {
		
		
		
	}

}


public class Q2_D {

	public static void main(String[] args) {
		int x[] = { 7,  9, -1, 4, 12, 9, 3, 2, -7, 2, 1, 9, -15, 24, 11, 13 };
		int even = 0; 
		int odd  = 0;
		for(int i = 0;i< x.length;i++) {
			if((x[i] % 2) == 0){
				even++;
			}
			else {
				odd++;
			}				
		}
                System.out.println("Even : "+even);
				System.out.println("Odd  : "+odd);
	}

}

/* output is Even : 5
             Odd  : 11
*/
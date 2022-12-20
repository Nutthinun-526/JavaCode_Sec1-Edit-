
public class Q1 {

	public static void main(String[] args) {
		int i = 3;
		int a[] = { 0, 2, 4, 6, 8, 1, 3, 5, 7, 9};
		System.out.println(a[0] + a[6]);                  // output is 3
		System.out.println(a[1] * --a[4]);                // output is 14
		System.out.println(a[9]++);                       // output is 9    " a[9] = plus +1 after "
		System.out.println(a[10] + a[4]);                 // output is Error
		System.out.println(a[1] + a[0]);                  // output is 2
		System.out.println(a[5 + 3]);                     // output is 7
		System.out.println(--a[2 * i] + a[1]++);          // output is 4 
		System.out.println(a[1] + a[4] +a[9]);            // output is 20   " a[1] = 2 , a[4] = 8 , a[9] = 9+1"

	}

}

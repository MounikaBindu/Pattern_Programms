package star_patterns;

public class Hollow_reverse_pattern {
	public static void main(String[] args) {
		int n=5;
//		int t=6;
		int num=1;
		for(int i=1;i<=n;i++) {
//			t--;
			for(int j=1;j<=n;j++) {
				if(i==1) {
					System.out.print("*");
				}
				else if(i==j || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}


//o/p:
//	*****
//	 *  *
//	  * *
//	   **
//	    *	
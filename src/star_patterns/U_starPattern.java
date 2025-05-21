package star_patterns;

public class U_starPattern {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((j==1 && i>=1 && i<=6) || (j==7 && i>=1 && i<=6)) {
					System.out.print("*");
				}else if(i==7 && j>=2 && j<=6) {
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
//	*     *
//	*     *
//	*     *
//	*     *
//	*     *
//	*     *
//	 ***** 
//	
package star_patterns;

public class D_starPattern {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==1 && j<=5) || (i==7 && j<=5) || j==1) {
					System.out.print("*");
				}
				else if((i==2 && j==6) || (i==6 && j==6) || (j==7 && i>=3 && i<=5)) {
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
//
//*****  
//*    * 
//*     *
//*     *
//*     *
//*    * 
//*****  

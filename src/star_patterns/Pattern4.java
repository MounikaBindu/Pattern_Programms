package star_patterns;

public class Pattern4 {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 && (j>=2 && j<=4)) {
					System.out.print("*");
				}
				else if(j==1 && (i>=2 && i<=7) || i==4 || j==5 && (i>=2 && i<=7)){
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
//	 *** 
//	*   *
//	*   *
//	*****
//	*   *
//	*   *
//	*   *

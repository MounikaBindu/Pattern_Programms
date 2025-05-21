package star_patterns;

public class Butterful_pattern {
	public static void main(String[] args) {
		int n=9;
		int m=10;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(j<=num || j>m-num) {
				System.out.print("*");
			
				}
				else {
					System.out.print(" ");					
					
				}
				
			
			}
			if(i<5) {
				num++;
				
			}else {
				num--;
			}
			System.out.println();
		}
	}

}

//o/p:
//	
//	*        *
//	**      **
//	***    ***
//	****  ****
//	**********
//	****  ****
//	***    ***
//	**      **
//	*        *


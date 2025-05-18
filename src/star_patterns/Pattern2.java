package star_patterns;

public class Pattern2 {
	public static void main(String[] args) {
		int n=11;
		int sp=6;
		int num=-1;
		for(int i=1;i<=n;i++) {
			if(i<=6) {
				sp--;
				num=num+2;
			}
			else {
				sp++;
				num=num-2;
			}
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=num;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}

//o/p:
//	   *
//    ***
//   *****
//  *******
// *********
//***********
// *********
//  *******
//   *****
//    ***
//     *

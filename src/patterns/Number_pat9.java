package patterns;

public class Number_pat9 {
	public static void main(String[] args) {
		int sp=4;
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<sp;j++) {
				System.out.print(" ");
			}
			sp--;
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			
			for(int l=2;l<=i;l++) {
				System.out.print(l);
			}
			
			
			System.out.println();
			
		}
		
	}

}

//o/p:
//	   1
//	  212
//	 32123
//	4321234
//	
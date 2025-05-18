package patterns;

public class Number_pat7 {
	public static void main(String[] args) {
		int sp=0;
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			sp++;
			for(int k=i;k<=n;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}

//o/p:
//	1 2 3 4 
//	 2 3 4 
//	  3 4 
//	   4 
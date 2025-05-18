package patterns;

public class Number_pat6 {
	public static void main(String[] args) {
		int sp=3;
		for(int i=1;i<=4;i++) {
			for(int j=0;j<sp;j++) {
				System.out.print(" ");
			}
			sp--;
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	}

}

//o/p:
//	   1 
//	  2 2 
//	 3 3 3 
//	4 4 4 4 

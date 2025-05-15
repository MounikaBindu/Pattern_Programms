package patterns;

public class Number_pat5 {
	public static void main(String[] args) {
		int sp=4;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			sp--;
			int x=1;
			for(int k=1;k<=i;k++) {
				System.out.print(x+" ");
				x=x*(i-k)/k;
				
			}
			System.out.println();
			
		}
	}

}

//o/p:
//	    1 
//	   1 1 
//	  1 2 1 
//	 1 3 3 1 
//	1 4 6 4 1  	
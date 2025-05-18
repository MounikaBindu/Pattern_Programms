package patterns;

public class Number_pat8 {
	public static void main(String[] args) {
		int sp=0;
		int n=1;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
				
			}
			for(int k=n;k<=4;k++) {
				System.out.print(k+" ");
			}
			
			if(i>=4) {
				sp--;
				n--;
			}
			else {
				sp++;
				n++;
			}
			System.out.println();
			
		}
	}

}


//o/p:
//	
//	1 2 3 4 
//	 2 3 4 
//	  3 4 
//	   4 
//	  3 4 
//	 2 3 4 
//	1 2 3 4 
//	

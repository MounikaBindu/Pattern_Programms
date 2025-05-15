package patterns;

public class Number_pat1 {
//	public static void main(String[] args) {
//		for(int i=5;i>0;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//	}
//
//}

//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1
	
public static void main(String[] args) {
	int sp=0;
	for(int i=5;i>0;i--) {
		for(int j=0;j<sp;j++) {
			System.out.print(" ");
		}
		sp++;
		for(int k=1;k<=i;k++) {
			System.out.print(k);
		}
		System.out.println();
		
	}
 }
}


//o/p:
//	
//	12345
//	 1234
//	  123
//	   12
//	    1	


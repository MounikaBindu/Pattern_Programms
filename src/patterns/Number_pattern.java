package patterns;

public class Number_pattern {
//	public static void main(String[] args) {
//		int sp=3;
//		for(int i=1;i<=4;i++) {
//			for(int j=0;j<sp;j++) {
//				System.out.print(" ");
//			}
//			sp--;
//			for(int k=1;k<=i;k++) {
//				System.out.print(k);
//			}
//			System.out.println();
//		}
//	}

//}
//o/p:
//	
//	   1
//	  12
//	 123
//	1234	
	

public static void main(String[] args) {
	int sp=3;
	int num=0;
	for(int i=0;i<4;i++) {
		for(int j=0;j<sp;j++) {
			System.out.print(" ");
		}
		sp--;
		for(int k=0;k<=i;k++) {
			System.out.print(num);
			num++;
		}
		System.out.println();
	}
}
}	

//o/p:
//	
//	   0
//	  12
//	 345
//	6789
	

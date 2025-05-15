package patterns;

public class Number_pat3 {
	public static void main(String[] args) {
		int sp=0;
		int num=9;
		for(int i=0;i<5;i++) {
			for(int j=0;j<sp;j++) {
				System.out.print(" ");
			}
			sp++;
			for(int k=1;k<=num;k++) {
				System.out.print(k);
			}
			num=num-2;
			System.out.println();
		}
	}

}

//o/p:
//	123456789
//	 1234567
//	  12345
//	   123
//	    1
	
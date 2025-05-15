package patterns;

public class Number_pat2 {
	public static void main(String[] args) {
		int sp=4;
		int num=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<sp;j++) {
				System.out.print(" ");
			}
			sp--;
			for(int k=1;k<=num;k++) {
				System.out.print(k);
			}
			num=num+2;
			System.out.println();
		}
	}

}

//o/p:
//
//	    1
//	   123
//	  12345
//	 1234567
//	123456789
//	
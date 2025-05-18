package patterns;

public class Number_pat4 {
	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num);
				num++;

			}
			
			System.out.println();
		}
				
	}

}


//o/p:
//	0
//	12
//	345
//	6789

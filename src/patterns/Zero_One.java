package patterns;

public class Zero_One {
	public static void main(String[] args) {
		int x=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if(((i+j) & 1)==0) {
					System.out.print("1 ");
					
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}

//o/p:
//	1 
//	0 1 
//	1 0 1 
//	0 1 0 1 

package star_patterns;

public class Pattern3 {
	public static void main(String[] args) {
		int n=11;
		int num=7;
		for(int i=1;i<=n;i++) {
			if(i<=6) {
				num--;
			}
			else {
				num++;
			}
			for(int j=1;j<=num;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	
	}

}
//o/p:
//	******
//	*****
//	****
//	***
//	**
//	*
//	**
//	***
//	****
//	*****
//	******


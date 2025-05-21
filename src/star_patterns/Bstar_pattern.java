package star_patterns;

public class Bstar_pattern {
	public static void main(String[] args) {
		int n=7;
		int m=6;
		for(int i=1;i<=n;i++) {
		   for(int j=1;j<=m;j++) {
			   if((i==1 && j<=5) || (i==4 && j<=5) || (i==7 && j<=5)) {
				   System.out.print("*");
				   
			   }else if(j==1 || (j==6 && i==2)|| (j==6 && i==3) || (j==6 && i==5) || (j==6 && i==6)) {
				   System.out.print("*");
			   }
			   else {
				   System.out.print(" ");
			   }
		   }
		   System.out.println();
			
		}
	}

}

//o/p:
//	***** 
//	*    *
//	*    *
//	***** 
//	*    *
//	*    *
//	***** 

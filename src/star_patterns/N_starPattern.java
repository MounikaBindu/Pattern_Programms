package star_patterns;



public class N_starPattern {
	 public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==7) {
					System.out.print("*");
				}else if(j==i) {
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
//	*     *
//	**    *
//	* *   *
//	*  *  *
//	*   * *
//	*    **
//	*     *

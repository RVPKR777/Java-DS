import java.util.Scanner;

public class Zero_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mat[][] = new int[n][n];
		for(int i = 0; i<n ; i++) {
			for(int j = 0; j <n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j<n; j++) {
				if(mat[i][j] == 0) {
					for(int k = 0; k<n; k++) {
						int p = i;
						//int l = 0;
						mat[p][k] = 0;
						//l++;
					}
					for(int m = 0; m<n ; m++) {
						int p = j;
						//int l = 0;
						mat[m][p] = 0;
						//l++;
					}
					for(int q = 0; q<n; q++) {
						for(int w = 0; w<n ; w++) {
							System.out.print(mat[q][w] + " ");
						}
						System.out.println("");
					}
					System.exit(0);
				}
			}
		}
		
	}

}

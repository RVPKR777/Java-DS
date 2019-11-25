import java.util.ArrayList;
import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] a1 = a.split(" ");
		int[] ab = new int[a1.length];
		for(int i = 0; i<a1.length; i++) {
			ab[i] = Integer.parseInt(a1[i]);
		}
		System.out.println("hello");
		int key = sc.nextInt();
		search(ab,key,0,ab.length-1);
		
	}
	
	public static void search(int[] x, int key , int li, int ui) {
		int n = (li + ui)/2;
		System.out.println(n);
		if(x[n] == key) {
			System.out.println("found at" + n);
			System.exit(0);
		}
		if(key > x[n]) {
			System.out.println("1");
			search(x,key,n+1,x.length);
		}
		else if(key < x[n]) {
			System.out.println("-1");
			search(x,key,0,n-1);
		}
		
		}

}

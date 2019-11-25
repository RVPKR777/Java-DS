import java.util.Scanner;
import java.util.Stack;

public class Optimal_division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String e = "";
		String c = a.replaceAll("\\[|\\]", "");
		//System.out.println(c);
		String[] b = c.split(",");
		//System.out.println(b[0]);
		Stack<String> d = new Stack<String>();
		d.push(b[0]);
		d.push("/");
		d.push("(");
		for(int i = 1; i<b.length; i++) {
			d.push(b[i]);
			if(i == b.length-1) {
				d.push(")");
				break;
			}
			d.push("/");
		}
		for(int i = 0; i < d.size(); i++) {
			e = e + d.get(i);
			//if(i == 0) {
				//break;
			//}
		}
		System.out.println('"' + e + '"');
	}

}

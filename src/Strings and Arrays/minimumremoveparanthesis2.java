import java.util.Stack;

public class minimumremoveparanthesis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(a(b(c)d)";
		String t = "";
		int x1 = 0;
		int y1 = 0;
		Stack<Character> a = new Stack<Character>();
		for(int i = 0; i<s.length();i++) {
			
			if(s.charAt(i) == '(') {
				a.push(s.charAt(i));
				x1++;
			}
			else if(s.charAt(i) == ')') {
				if(y1<x1) {
					a.push(s.charAt(i));
					y1++;
				}
				else {
					continue;
				}
			}
			else {
				a.push(s.charAt(i));
				continue;
			}
		}
		for(int i = 0; i<a.size();i++) {
			//System.out.println(x1);
			if(a.get(i) == '(' && x1>y1) {
			x1--;
			continue;
			}
			else {
				System.out.print(a.get(i));
			}
		}
		//System.out.println(t);
	}

}

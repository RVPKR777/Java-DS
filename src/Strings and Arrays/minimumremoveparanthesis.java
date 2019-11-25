import java.util.ArrayList;

public class minimumremoveparanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "lee(t(c)od)e)";
		//String a = "leetc(od)e(";
		String fnl = "";
		int k = 0;
		ArrayList<Character> b = new ArrayList<Character>();
		
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i) == '(' || a.charAt(i) == ')') {
				b.add(a.charAt(i));
			}
		}
		ArrayList<Character> c = new ArrayList<Character>();
		for(int i = 0; i<a.length(); i++) {
			c.add(a.charAt(i));
		}
		for(int i = 0; i<b.size(); i++) {
			if(b.get(k) == '(' ) {
				//System.out.println(b.get(k));
				b.remove(k);
				if(b.contains(')')){
					for(int j = 0; j < b.size(); j++) {
						if(b.get(j) == ')') {
							b.remove(j);
							break;
						}
						else {
							continue;
						}
					}
				}
			}
			else {
				//b.remove(i);
				k = k + 1;
				continue;
				
			}
			
		}
		//System.out.println(b);
		for(int i = 0; i<b.size(); i++) {
			if(c.contains(b.get(i))) {
				c.remove(b.get(i));
			}
		}
		for(int i = 0; i<c.size();i++) {
			fnl = fnl + c.get(i);
		}
		System.out.println(fnl);
		
	}

}

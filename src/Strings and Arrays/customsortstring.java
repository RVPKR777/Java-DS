import java.util.ArrayList;

public class customsortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		String b = "dbca";
		ArrayList<String> pattern_values = new ArrayList<String>();
		ArrayList<String> string_values = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
		String[] x = a.split("");
		String[] y = b.split("");
		for(int i = 0; i<x.length; i++) {
			pattern_values.add(x[i]);
		}
		for(int i = 0; i<y.length; i++) {
			string_values.add(y[i]);
		}
		for(int i = 0; i < pattern_values.size(); i++) {
			if(pattern_values.contains(string_values.get(i))) {
				continue;
			}
			else {
				temp.add(string_values.get(i));
			}
		}
		for(int i = 0; i < temp.size(); i++) {
			a = a + temp.get(i);
		}
		System.out.println(a);
	}

}

import java.util.ArrayList;
import java.util.regex.Pattern;

public class One_way_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "paaaaajkl";
		String b = "pl";
		String c = ".*";
		String k = " ";
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		ArrayList<String> ab = new ArrayList<String>();
		ArrayList<Character> ac = new ArrayList<Character>();
		for(int i =0; i<b.length(); i++) {
			String s = b.substring(0,i) + c + b.substring(i+1);
			ab.add(s);
		}
		for(int i = 0; i<ab.size(); i++) {
			if(Pattern.compile(ab.get(i)).matcher(a).matches()) {
				 b = a;
			}
		}
		System.out.println(b);
	}
}

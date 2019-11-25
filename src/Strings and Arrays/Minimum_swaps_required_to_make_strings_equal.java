import java.util.ArrayList;
import java.util.Collections;

public class Minimum_swaps_required_to_make_strings_equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "xy";
		String b = "yx";
		int x_count = 0;
		int y_count = 0;
		int count = 0;
		ArrayList<Character> c = new ArrayList<Character>();
		ArrayList<Character> d = new ArrayList<Character>();
		for(int i = 0; i<a.length(); i++) {
			c.add(a.charAt(i));
			d.add(b.charAt(i));
		}
		x_count = Collections.frequency(c, 'x') + Collections.frequency(d, 'x');
		y_count = Collections.frequency(c, 'y') + Collections.frequency(d, 'y');
		if(x_count%2 != 0 || y_count%2 != 0) {
			System.out.println("-1");
			System.exit(0);
		}
		else if(x_count%2 == 0 || y_count%2 == 0) {
			for(int i =0; i<c.size();i++) {
				if(c.get(i) == d.get(i)) {
					continue;
				}
				else if(c.get(i) != d.get(i)) {
					count = count + 1;
				}
			}
		}
		if((count/2)%2 == 0) {
			count = count/2;
		}
		else if((count/2)%2 == 1) {
			count = count/2 + 1;
			}
		 if(count == 2) {
			 if(a.charAt(0) == a.charAt(1)) {
			count = count - 1;
			 }
		 }
		System.out.println(count);
	}

}


public class stringduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ssss";
		int count = 0;
		
		for(int i = 0; i < s.length();i++) {
			char a = s.charAt(i);
			for(int j = 0; j<s.length();j++) {
				if(s.charAt(j) == a && j!=i) {
					System.out.println("Invalid");
					System.exit(0);
				}
			}
			count = count + 1;
		}
		if(count == s.length()) {
			System.out.println("Valid");
		}
	}

}

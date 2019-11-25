
public class palindromepermutations {

	 static void permutation(String str, String ans){
		  if (str.length() == 0) { 
			  String a = "";
			  int n = ans.length()-1;
	            for(int i = 0; i<ans.length(); i++) {
	            	a = a + ans.charAt(n);
	            	n--;
	            }
	            if(a.contentEquals(ans)) {
	            	System.out.println(a);
	            }
	        } 
	  
	        for (int i = 0; i < str.length(); i++) { 
	            char ch = str.charAt(i);  
	            String ros = str.substring(0, i) +  str.substring(i + 1); 
	            permutation(ros, ans + ch); 
	        }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "kekey";
		permutation(a, "");
		
	}
}

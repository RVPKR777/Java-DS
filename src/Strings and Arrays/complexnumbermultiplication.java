
public class complexnumbermultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1+-1i";
		String b = "1+-1i";
		
		String[] x = a.split("\\+|i");
		String[] y = b.split("\\+|i");
		
		int x_1 = Integer.parseInt(x[0]);
		int x_2 = Integer.parseInt(x[1]);
		
		int y_1 = Integer.parseInt(y[0]);
		int y_2 = Integer.parseInt(y[1]);
		
		System.out.println((x_1 * y_1) - (x_2 * y_2) + "+" + ((x_1 * y_2) + (x_2 * y_1)) + "i");

	}

}

package o3;
import javax.swing.JOptionPane;

public class Factorial {
	
	public static void main(String[] args) {
		/**
		 * Lag et program som leser inn et heltall n > 0, 
		 * beregner verdien n! (n fakultet) og skriver verdien til n! ut på skjermen, der n! = 1*2*3* … *(n-1)*n.
		 */
		String input = "";			
		boolean isValid = false;
		long result = 1;
		
		do {
			input = JOptionPane.showInputDialog("Gi et positivt tall");
			isValid = isValidNumber(input);
			
		} while(!isValid);
		
		long n = Integer.parseInt(input);
		for(long i = n; i>1; i--) {
			result *=i;
		}

		JOptionPane.showMessageDialog(null," "+result);
	}
	
	private static boolean isValidNumber(String input) {
		/**
	    * Check the value provided by the user 
	    *
	    * @param  input	string to check
	    * @return boolean whether the input is parsable string and is a valid positive number 
	    */
		
		boolean isParsable = false;
		boolean isValid = false;
		try {
			int n = Integer.parseInt(input);
			isParsable = true;
			isValid = n > 0;
			
		} catch(final NumberFormatException e) {
			System.out.print(e);
		}	
		
		return isParsable && isValid;
	}

}
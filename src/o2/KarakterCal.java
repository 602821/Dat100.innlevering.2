package o2;
import javax.swing.JOptionPane;

public class KarakterCal {

	public static void main(String[] args) {		
		int numberOfStudents = 10;

		for (int i = 0; i< numberOfStudents; i++) {
			String input = JOptionPane.showInputDialog("Skriv inn peongsum");
			int grade = 0;
			boolean isValid = false;
			
			while(!isValid) {
				isValid = isValidNumber(input);	
				if(!isValid) input = JOptionPane.showInputDialog("Skriv inn en gyldig poengsum mellom 0 og 100");
			};
			
			grade = Integer.parseInt(input);
			
			String message = "Student "+ i+1 + ": Karakteren er " + toLetterGrade(grade);
			
			JOptionPane.showMessageDialog(null, message);
			
		}
	}
	
	private static String toLetterGrade(int grade) {
		/**
		 * Takes a numeral grade and turns it into a letter grade 
		 * 
		 * @param grade an integer between 0 and 100
		 * @return string value of corresponding grade
		 */
		String letterGrade = "";
		
		if(grade >=0 && grade <= 39) {
			letterGrade = "F";	
		} else if(grade >=40 && grade <= 49) {
			letterGrade = "E";
		} else if(grade >=50 && grade <= 59) {
			letterGrade = "D";
		} else if(grade >=60 && grade <= 79) {
			letterGrade = "C";
		} else if(grade >=80 && grade <= 89) {
			letterGrade = "B";
		} else if(grade >=90 && grade <= 100) {
			letterGrade = "A";
		}
		
		return letterGrade;
	}
	
	private static boolean isValidNumber(String input) {
		/**
	    * Check the value provided by the user 
	    *
	    * @param  input	string to check
	    * @return boolean whether the input is parsable string and is a valid number between 0 and 100
	    */
		
		boolean isParsable = false;
		boolean isValid = false;
		try {
			int n = Integer.parseInt(input);
			isParsable = true;
			isValid = n >= 0 && n <= 100;
			
		} catch(final NumberFormatException e) {
			System.out.print(e);
		}	
		
		return isParsable && isValid;
	}

}

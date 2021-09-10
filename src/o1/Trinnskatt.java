package o1;
import javax.swing.JOptionPane;

public class Trinnskatt {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Skriv inn lønnen..");
		int income = 0;
		
		boolean isParsable = false;
		
		while(!isParsable) {
			try {
				income = Integer.parseInt(input);
				isParsable = true;
			} catch(final NumberFormatException e) {
				input = JOptionPane.showInputDialog("Skriv inn et gyldig tall!");
			}
		}
				
		if(income <= 164100) {
			JOptionPane.showMessageDialog(null,"Ingen trinnskatt");
		} else if(income > 164100 && income <= 230950) {
			JOptionPane.showMessageDialog(null,"trinnskatten er 0,93%");
		} else if(income > 230950 && income <= 580650) {
			JOptionPane.showMessageDialog(null,"trinnskatten er 2,41%");
		} else if(income > 580650 && income <= 934050){
			JOptionPane.showMessageDialog(null,"trinnskatten er 11,52%");
		} else {
			JOptionPane.showMessageDialog(null,"trinnskatten er 14,52%");
		}

	}

}

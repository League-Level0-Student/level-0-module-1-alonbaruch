package _02_unbirthday;

import javax.swing.JOptionPane;

public class a {
	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog(null, "When's your birthday");
		if (a.equals("7/30")) {
			JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY");
		} else {JOptionPane.showMessageDialog(null,"have an unpleasant birthday");

			
		}
	}

}

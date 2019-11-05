package _15_voting_booth;

import javax.swing.JOptionPane;

public class politics {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("what is you're age in years?");
		int num = Integer.parseInt(age);

		if (num > 18) {
			JOptionPane.showInputDialog( "who do you think the next president should be?");
		} else {
JOptionPane.showMessageDialog(null,"sorry but you're a kid so, no one really cares what you think.");
		}
	}
}

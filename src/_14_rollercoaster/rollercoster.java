package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("hello there! how tall are you in inches my boyo?");
	int num = Integer.parseInt(height);
	if (num > 48) {
	JOptionPane.showMessageDialog(null,"you are tall enough to go enjoy the ride!");
	}else {
	JOptionPane.showMessageDialog(null,"sorry me kiddo, but you will have to wait a little longer before you can go on this ride");
	}
}
}
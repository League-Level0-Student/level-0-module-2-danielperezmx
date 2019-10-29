package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotterynumber {
	public static void main(String[] args) {
	Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(99999);
		
		int cheese = randomMaker.nextInt(10);
		
		int ham = randomMaker.nextInt(29);
		
		int bread = randomMaker.nextInt(8);
		
		int pizza = randomMaker.nextInt(11);
		
	JOptionPane.showMessageDialog(null,cheese+", "+ham+","+bread+","+pizza+"."+randomNumber);
	}

}

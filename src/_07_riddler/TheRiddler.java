package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
score++;
// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String a = JOptionPane.showInputDialog(null,"what has a head and a tail but no body");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (a.equals("a coin")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
} else {JOptionPane.showMessageDialog(null,"Wrong it is a cion");
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,score++);
	}
	}}


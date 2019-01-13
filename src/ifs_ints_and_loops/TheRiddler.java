package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer1 = JOptionPane.showInputDialog(null, "What gets full without eating?");
if (answer1.equals("the Moon")) {
	score = score + 1;
	JOptionPane.showMessageDialog(null, "Correct!  Your score is " + score + ".");
}else {
	JOptionPane.showMessageDialog(null, "Wrong.  The correct answer is 'the Moon'");
}
String answer2 = JOptionPane.showInputDialog(null, "What comes up but never comes down?");
if (answer2.equals("your age")) {
	score = score + 1;
	JOptionPane.showMessageDialog(null, "Correct!  Your score is " + score + ".");
}else {
	JOptionPane.showMessageDialog(null, "Wrong.  The correct answer is 'your age'");
}
String answer3 = JOptionPane.showInputDialog(null, "A man throws a ball into the air.  It turns around and comes right back to him without touching anything.  It is not attached to anything.  How does this happen?");
if (answer3.equals("He throws it upwards.")) {
	score = score + 1;
	JOptionPane.showMessageDialog(null, "Correct!  Your score is " + score + ".");
}else {
	JOptionPane.showMessageDialog(null, "Wrong.  The correct answer is 'He throws it upwards.'");
}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}


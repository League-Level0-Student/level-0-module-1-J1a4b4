import javax.swing.JOptionPane;

public class MyAges {

	public static void main(String[] args) {
		int age = 0;
		int year = 2006;
		for (int i = 0; i < 13; i++) {
			JOptionPane.showMessageDialog(null, "I was " + age + " year(s) old in " + year + ".");
			age = age + 1;
			year = year + 1;
		}

	}

}

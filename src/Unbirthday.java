import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String bday = JOptionPane.showInputDialog(null, "When is your birthday? (Please type it as month/day)");
if (bday.equals("1/12")) {
	JOptionPane.showMessageDialog(null, "Happy birthday!");
}
	else {
		JOptionPane.showMessageDialog(null, "A very merry unbirthday to you!");
	}

}
}

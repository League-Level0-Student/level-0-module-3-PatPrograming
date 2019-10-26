package _04_are_you_happy;
import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
String happy=JOptionPane.showInputDialog("Are you happy?");	
if (happy.equals("Yes.")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
}
else {
	String happyhm=JOptionPane.showInputDialog("Do you want to be happy?");
	if(happyhm.equals("Yes.")) {
		JOptionPane.showMessageDialog(null, "Change something.");
	}
	else{
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
}
}
}

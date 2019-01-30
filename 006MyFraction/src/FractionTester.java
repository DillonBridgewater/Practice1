import javax.swing.JOptionPane;

public class FractionTester {
	public static void main(String[] args) {
		String Fraction1 = JOptionPane.showInputDialog("Input a fraction seperated by /");
		String Fraction2 = JOptionPane.showInputDialog("Input a second Fraction seperated by /");
		Fraction myFraction = new Fraction(Fraction1, Fraction2);
		

		if (myFraction.getOperation().equals("Add")) {
			JOptionPane.showMessageDialog(null, Fraction1 + " " + "+" + " " +  Fraction2 + "=" + myFraction.getNumerator3() + "/" + myFraction.getDenominator3());
		}
		if (myFraction.getOperation().equals("Subtract")) {
			JOptionPane.showMessageDialog(null, Fraction1 + " " + "-" + " " + Fraction2 + "=" + myFraction.getNumerator3() + "/" + myFraction.getDenominator3());
		}
		if (myFraction.getOperation().equals("Multiply")) {
			JOptionPane.showMessageDialog(null, Fraction1 + " " + "*" + " " + Fraction2 + "=" + myFraction.getNumerator3() + "/" + myFraction.getDenominator3());
		}
		if (myFraction.getOperation().equals("Divide")) {
			JOptionPane.showMessageDialog(null, Fraction1 + " " + "/" + " " + Fraction2 + "=" + myFraction.getNumerator3() + "/" + myFraction.getDenominator3());
		}
	}
}

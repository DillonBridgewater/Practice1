import javax.swing.JOptionPane;

public class Rectangle {
	// Class Variables
	private double sideA;
	private double sideB;
	private double perimeter;
	private double area; 
	private double diagonal;
	
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		perimeter = 0.0;
		area = 0.0;
		diagonal = 0.0;
	}
	public void setSides() {
		sideA = Double.parseDouble(JOptionPane.showInputDialog("What is the value of side A: "));
		sideB = Double.parseDouble(JOptionPane.showInputDialog("What is the value of side B: "));
	}
	public void calcPerimeter() {
		perimeter = (2*sideA) + (2*sideB);
	}
	public void calcArea () {
		area = sideA*sideB;
	}
	public void calcDiagonal () {
		diagonal = Math.sqrt(Math.pow(sideA, 2)+Math.pow(sideB, 2));
	}
	public void showVars () {
		JOptionPane.showMessageDialog(null, "Side A, Side B =" + sideA + " " + sideB);
		JOptionPane.showMessageDialog(null, "Perimeter =" + perimeter);
		JOptionPane.showMessageDialog(null, "Area = " + area);
		JOptionPane.showMessageDialog(null, "Diagonal = " + diagonal);
	}
}

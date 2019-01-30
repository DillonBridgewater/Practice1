import javax.swing.JOptionPane;

public class Circle {
	// Class Variables
	private double radius;
	private double circumference;
	private double area;
	
	public void setVarsToZero() {
		radius = 0.0;
		circumference = 0.0;
		area = 0.0;
	}
	public void setRadius() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("What would you like the Radius to be"));
	}
	
	public void calcCircumference() {
		circumference = (radius*2) * Math.PI;
	}
	public void calcArea() {
		area = (Math.pow(radius, 2)) * Math.PI;
	}
	public void showVars() {
		JOptionPane.showMessageDialog(null, "Radius = " + radius);
		JOptionPane.showMessageDialog(null, "Circumference = " + circumference);
		JOptionPane.showMessageDialog(null, "Area = " + area);	
	}
	
}

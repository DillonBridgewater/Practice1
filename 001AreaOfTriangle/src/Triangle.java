
import javax.swing.JOptionPane;

public class Triangle {
	// Class variables go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;;
	// Constructor goes here
	public Triangle() {

	}
	// Methods go here
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		theArea = 0.0;
	}// end of setVarsToZero
	public void showVars() {
		String msg = 
				"Side A, B, C, = " + sideA + ", " + sideB + ", " + sideC + 
				"; Perimeter: " + perimeter + ";"
				+ " Area = " + theArea;
		JOptionPane.showMessageDialog(null, msg);
	} // end of showVars
	public void setSides() {
		boolean b = true;
		while (b) {
			try {
				sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side A: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number");
			}
		}
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side B: "));
		sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side C: "));
	}// end of setSides
	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;
	}// end of calcPerimeter
	public void calcArea() {
		double p = 0.0;
		p = (sideA + sideB + sideC)/2.0;
		theArea = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
	}// end of calcArea
	public void calcAngles() {
		double cosA = 0;
		cosA = (Math.pow(sideB, 2.0) + Math.pow(sideC, 2.0) - Math.pow(sideA, 2.0))/
				(2.0*sideC*sideB);
		double ACosA = Math.acos(cosA);
		double AngleA = Math.toDegrees(ACosA);
		double cosB = 0;
		cosB = (Math.pow(sideC, 2.0) + Math.pow(sideA, 2.0) - Math.pow(sideB, 2.0))/
				(2.0*sideC*sideA);
		double ACosB = Math.acos(cosB);
		double AngleB = Math.toDegrees(ACosB);
		double cosC = 0;
		cosC = (Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0) - Math.pow(sideC, 2.0))/
				(2.0*sideA*sideB);
		double ACosC = Math.acos(cosC);
		double AngleC = Math.toDegrees(ACosC);
		String msg = "AngleA, AngleB, AngleC: " + AngleA + ", " + AngleB + ", " + AngleC;
		JOptionPane.showMessageDialog(null, msg);
	}
	

	public void showVarsAngles() {
	}
} // end of class

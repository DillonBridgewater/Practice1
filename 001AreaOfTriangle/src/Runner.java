import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] arge) {
		
		
		
		// Instantiate each class
		Triangle myTriangle = new Triangle();
		Rectangle myRectangle = new Rectangle();
		Circle myCircle = new Circle();
		Cuboid myCuboid = new Cuboid();
		Sphere mySphere = new Sphere();
		JOptionPane.showMessageDialog(null, "Welcome to my program, by Dillon Bridgewater 9/14/18 3A");
		int goAgain = 1;
		while (goAgain == 1) {
		
		String msg = "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, or Sphere";
		String answer = JOptionPane.showInputDialog(msg);
		// When comparing strings == is unreliable
		// instead, use String class methods .equals
		if (answer.equals("Triangle") ) {
			JOptionPane.showMessageDialog(null, "In Triangle");
			myTriangle.setVarsToZero();
			myTriangle.setSides();
			myTriangle.calcPerimeter();
			myTriangle.calcArea();
			myTriangle.showVars();
			myTriangle.calcAngles();
			myTriangle.showVarsAngles();
		}
		else if (answer.equals("Circle")) {
			JOptionPane.showMessageDialog(null, "In Circle");
			myCircle.setVarsToZero();
			myCircle.setRadius();
			myCircle.calcCircumference();
			myCircle.calcArea();
			myCircle.showVars();
		}
		else if (answer.equals("Rectangle")) {
			JOptionPane.showMessageDialog(null, "In Rectangle");
			myRectangle.setVarsToZero();
			myRectangle.setSides();
			myRectangle.calcPerimeter();
			myRectangle.calcArea();
			myRectangle.calcDiagonal();
			myRectangle.showVars();
		}
		else if (answer.equals("Cuboid")) {
			JOptionPane.showMessageDialog(null, "In Cuboid");
			myCuboid.setVarsToZero();
			myCuboid.setSides();
			myCuboid.calcVolume();
			myCuboid.calcSurfaceArea();
			myCuboid.showVars();
		}
		else if (answer.equals("Sphere")) {
			JOptionPane.showMessageDialog(null, "In Sphere");
			mySphere.setVarsToZero();
			mySphere.setRadius();
			mySphere.calcVolume();
			mySphere.calcSurfaceArea();
			mySphere.showVars();
		}
		else {
			JOptionPane.showMessageDialog(null, "That answer was not recognized");
		}
		msg = "Would you like to go again. Yes or No";
		answer = JOptionPane.showInputDialog(msg);
		if (answer.equals("Yes") || answer.equals("Y") || answer.equals("yes") || answer.equals("y")) {
			goAgain = 1;
		}
		else if (answer.equals("No") || answer.equals("no") || answer.equals("N") || answer.equals("n")) {
			goAgain = 0;
			JOptionPane.showMessageDialog(null, "Thank you!");
		}
		else {
			JOptionPane.showMessageDialog(null, "That Answer was not reconized");
			
		}
		}
	}
}
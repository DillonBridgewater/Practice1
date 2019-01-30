import javax.swing.JOptionPane;

public class Cuboid {
	private double sideA;
	private double sideB;
	private double sideC;
	private double volume;
	private double surfaceArea;
	
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		volume = 0.0;
		surfaceArea = 0.0;
	}
	public void setSides () {
		sideA = Double.parseDouble(JOptionPane.showInputDialog("What is the value of Side A: "));
		sideB = Double.parseDouble(JOptionPane.showInputDialog("What is the value of Side B: "));
		sideC = Double.parseDouble(JOptionPane.showInputDialog("What is the value of Side C: "));
	}
	public void calcVolume () {
		volume = (sideA * sideB * sideC);
	}
	public void calcSurfaceArea () {
		surfaceArea = (2*(sideA*sideB + sideB*sideC + sideC*sideA));
	}
	public void showVars () {
		JOptionPane.showMessageDialog(null, "sideA, sideB, sideC = " + sideA + " " + sideB + " " + sideC);
		JOptionPane.showMessageDialog(null, "Volume = " + volume + " Surface Area= " + surfaceArea);
	}
}

import javax.swing.JOptionPane;

public class Sphere {
	private double radius;
	private double volume;
	private double surfaceArea;
	
	public void setVarsToZero() {
		radius = 0.0;
		volume = 0.0;
		surfaceArea = 0.0;
	}
	public void setRadius() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("What is the value of the radius"));
	}
	public void calcVolume() {
		volume = ((4.0/3.0)*Math.PI*(Math.pow(radius, 3)));
	}
	public void calcSurfaceArea() {
		surfaceArea = (4*Math.PI*Math.pow(radius, 2));
	}
	public void showVars() {
		JOptionPane.showMessageDialog(null, "Radius = " + radius);
		JOptionPane.showMessageDialog(null, "Volume = " + volume);
		JOptionPane.showMessageDialog(null, "Surface Area = " + surfaceArea);
		
	}
}

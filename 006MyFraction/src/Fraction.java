import javax.swing.JOptionPane;

/**
 * Add two fractions. Learn Javadocs. Enter two fractions as Strings 
 * then use String methods to pull out numerator and denominator
 * use common denominator to add, then reduce to lowest common denominator
 * (first part of grading)
 * (Second part of grading): Add, subtract, multiply, divide)
 * @author compsci
 *
 */
public class Fraction {
	/**
	 * 
	 */
	private int numerator1;
	/**
	 * 
	 * 
	 */
	private int denominator1;
	/**
	 * 
	 */
	private int numerator2;
	/**
	 * 
	 */
	private int denominator2;
	/**
	 * 
	 */
	private int numeratorFinal;
	/**
	 * 
	 */
	private int denominatorFinal;
	public String answer;
	
	public  Fraction (String fractionString1, String fractionString2 ) {
		int separatorLocation = fractionString1.indexOf("/");
		String strNumerator = fractionString1.substring(0,separatorLocation);
		String strDenominator = fractionString1.substring(separatorLocation + 1);
		
		this.numerator1 = Integer.parseInt(strNumerator);
		this.denominator1 = Integer.parseInt(strDenominator);
		
		int separatorLocation2 = fractionString2.indexOf("/");
		String strNumerator2 = fractionString2.substring(0,separatorLocation2);
		String strDenominator2 = fractionString2.substring(separatorLocation2 + 1);
		
		this.numerator2= Integer.parseInt(strNumerator2);
		this.denominator2 = Integer.parseInt(strDenominator2);
		
		answer = JOptionPane.showInputDialog("Would you like to Add, Subtract, Multiply, or Divide");
		if (answer.equals("Add")) {
		this.numeratorFinal = (numerator1 * denominator2) + (numerator2*denominator1);
		this.denominatorFinal = (denominator1*denominator2);
		reduceFraction(numeratorFinal, denominatorFinal);
		}
		if (answer.equals("Subtract")) {
			this.numeratorFinal = (numerator1 * denominator2) - (numerator2*denominator1);
			this.denominatorFinal = (denominator1*denominator2);
			reduceFraction(numeratorFinal, denominatorFinal);
		}
		if (answer.equals("Multiply")) {
			this.numeratorFinal = (numerator1*numerator2);
			this.denominatorFinal = (denominator1*denominator2);
			reduceFraction(numeratorFinal, denominatorFinal);
		}
		if (answer.equals("Divide")) {
			this.numeratorFinal = (numerator1*denominator2);
			this.denominatorFinal = (denominator1*numerator2);
			reduceFraction(numeratorFinal, denominatorFinal);
		}
		reduceFraction(numeratorFinal, denominatorFinal);
		
	}
	
	public void reduceFraction(int numerator, int denominator) {
		boolean Reduced = false;
		while (Reduced == false) {
		
			for (int i=2; i<=(numeratorFinal/2); i++) {
				if (numeratorFinal == denominatorFinal) {
					numeratorFinal = 1;
					denominatorFinal = 1;
				}
			
				else if (numeratorFinal%i == 0 && denominatorFinal%i ==0) {
					numeratorFinal = numeratorFinal/i;
					denominatorFinal = denominatorFinal/i;
				
				}
			}
			Reduced = true;
		}

	}
	
	public int getNumerator1() {
		return numerator1;
	}
	public void setNumerator11(int numerator) {
		this.numerator1 = numerator;
	}
	public int getDenominator1() {
		return denominator1;
	}
	public void setDenominator1(int denominator) {
		this.denominator1 = denominator;
	}
	public int getNumerator2() {
		return numerator2;
	}
	public void setNumerator2(int numerator) {
		this.numerator2 = numerator;
	}
	public int getDenominator2() {
		return denominator2;
	}
	public void setDenominator2(int denominator) {
		this.denominator2 = denominator;
	}
	public int getNumerator3() {
		return numeratorFinal;
	}
	public void setNumerator3(int numerator) {
		this.numeratorFinal = numerator;
	}
	public int getDenominator3() {
		return denominatorFinal;
	}
	public void setDenominator3(int denominator) {
		this.denominatorFinal = denominator;
	}
	public void setOperation(String answer) {
		this.answer = answer;
	}
	public String getOperation() {
		return answer;
	}
	
}

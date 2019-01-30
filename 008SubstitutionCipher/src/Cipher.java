import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cipher {
	private String alpha = "zebracdfghijklmnopqstuvwxy0123456789.:;?,[]-\"'";
	private String plainText = "";
	private String encodedText = "";
	private int key = 0;
	private String answer = "";
	Scanner kbd = new Scanner(System.in);

	// End field
	public Cipher() {
	

	}

	public void getPlainText() {
		plainText = JOptionPane.showInputDialog("Enter plain text");

	}

	public void getKey() {
	key = Integer.parseInt((JOptionPane.showInputDialog("What is your key?")));
	}

	public void encryptText() {
		for (int i = 0; i < plainText.length(); i++) {
			if (alpha.indexOf(plainText.charAt(i)) == -1) {
				encodedText += " ";
				
			}
			else {
				encodedText += alpha.charAt((alpha.indexOf(String.valueOf(plainText.charAt(i)).toLowerCase()) + key) % alpha.length());
			}
		}
		JOptionPane.showMessageDialog(null, encodedText);
	}

	public String encryptDecrypt() {

		while (answer != "E" && answer != "D") {
			answer = JOptionPane.showInputDialog("Would you like to encrypt or decrypt");
			JOptionPane.showMessageDialog(null, "You have chosen to " + answer);
			if (answer.equalsIgnoreCase("ENCRYPT")) {
				answer = "E";

			} else if (answer.equalsIgnoreCase("DECRYPT")) {
				answer = "D";

			} else {
				JOptionPane.showMessageDialog(null, "That is not answer is not acceptable");
			}
		}
		return (answer);

	}
	public void decryptText() {
		for (int i = 0; i < plainText.length(); i++) {
			if (alpha.indexOf(plainText.charAt(i)) == -1) {
				encodedText += " ";
			}
				encodedText += alpha.charAt((alpha.indexOf(plainText.charAt(i))-key) % alpha.length());
			
		}
		JOptionPane.showMessageDialog(null, encodedText);
	}
}

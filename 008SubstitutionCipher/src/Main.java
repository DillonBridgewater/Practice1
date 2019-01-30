
public class Main {
	public static void main(String[] args) {
		Cipher openCaesar = new Cipher();
		// ask if encrypt or decrypt 
		String answer = openCaesar.encryptDecrypt();
		openCaesar.getPlainText();
		openCaesar.getKey();
		if (answer.equals("E")) {
		openCaesar.encryptText();
		}
		if (answer.equals("D")) {
		openCaesar.decryptText();
		}
	}
}
// ask if they want to go again
// for dev, syso scanner are fine
// for ops, change JOPS -- graded!

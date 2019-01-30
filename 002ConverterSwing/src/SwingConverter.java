import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingConverter implements ActionListener {

	private JPanel inputPanel = initInputPanel();
	private JTextField inputText;
	private JTextArea resultArea;
	private JButton enterButton;
	private JButton sphereEnter;
	private JTextField inputTextSphere;
	public SwingConverter() {
		JFrame myWindow = new JFrame("Base Converter - created by Dillon Bridgewater");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.add(inputPanel);
		myWindow.setSize(600, 500);
		myWindow.setVisible(true);
		;
	}

	private JPanel initInputPanel() {
		JPanel panel = new JPanel();

		panel.setPreferredSize(new java.awt.Dimension(600, 500));
		panel.setLayout(null);

		JLabel label = new JLabel("Enter a base-10 number: ");
		label.setBounds(50, 50, 220, 30);
		panel.add(label);
	
		JLabel spherelabel = new JLabel("Enter a Radius: ");
		spherelabel.setBounds(50, 430, 220, 30);
		panel.add(spherelabel);
		
		JTextField text;
		text = inputText = new JTextField();
		text.setBounds(230, 50, 100, 30);
		panel.add(text);
		
		JTextField sphereText;
		sphereText = inputTextSphere = new JTextField();
		sphereText.setBounds(230, 430, 100, 30);
		panel.add(sphereText);
		
		JButton button = new JButton("Enter");
		button.setActionCommand("Enter");
		button.setBounds(320, 50, 80, 30);
		button.addActionListener(this);
		panel.add(button);
		enterButton = button; // assign it to a class var to be used in other methods
		
		JButton sphereEnter = new JButton("Enter");
		sphereEnter.setActionCommand("EnterSphere");
		sphereEnter.setBounds(320, 430, 80, 30);
		sphereEnter.addActionListener(this);
		panel.add(sphereEnter);
		this.sphereEnter = sphereEnter; // assign it to a class var to be used in other met

		button = new JButton("Reset");
		button.setActionCommand("Reset");
		button.setBounds(430, 50, 80, 30);
		button.addActionListener(this);
		panel.add(button);
		
		JButton sphereReset = new JButton("Reset");
		sphereReset.setActionCommand("SphereReset");
		sphereReset.setBounds(430, 430, 80, 30);
		sphereReset.addActionListener(this);
		panel.add(sphereReset);

		resultArea = new JTextArea();
		resultArea.setBounds(50, 180, 500, 200);
		resultArea.setEditable(false);
		resultArea.setBackground(java.awt.Color.RED);
		panel.add(resultArea);

		return panel;
	}

	public static void main(String[] args) throws Exception {
		// SwingConverter baseConverter = new SwingConverter();
		new SwingConverter();
	}

	public void actionPerformed(ActionEvent ev) {
		String command = ev.getActionCommand();
		if (command.equals("Enter")) {
			showResult();
		} else if (command.equals("EnterSphere")) {
			showSphere();
		} else if (command.equals("Reset")) {
			Reset();
		} else if (command.equals("SphereReset")) {
			sphereReset();
		} else {
			return;
		}

	}

	private void sphereReset() {
		inputTextSphere.setText("");
		inputTextSphere.setEnabled(true);
		sphereEnter.setEnabled(true);
		inputText.setEnabled(true);
		enterButton.setEnabled(true);
		inputTextSphere.requestFocus();
		resultArea.setText("");
		
	}

	private void showSphere() {
		inputText.setEnabled(false);
		enterButton.setEnabled(false);
		inputTextSphere.setEnabled(false);
		sphereEnter.setEnabled(false);
		
		Double r = getInputRadius();
		if (r == null) {
			resultArea.append("Invalid Radius!");
			return;
		}
		resultArea.append("Radius = " + r + "\n");
		resultArea.append("Volume = " + Double.toString((4.0/3.0)*Math.PI*(Math.pow(r, 3))) + "\n");
		resultArea.append("Surface Area = " + Double.toString((4*Math.PI*Math.pow(r, 2))) + "\n");
	}

	private void Reset() {
		// System.out.println("Reset Entered");
		inputText.setText("");
		resultArea.setText("");
		inputText.setEnabled(true);
		enterButton.setEnabled(true);
		inputTextSphere.setEnabled(true);
		sphereEnter.setEnabled(true);
		inputText.requestFocus();
	}

	private void showResult() {
		// System.out.println("showResult Entered");

		String hexUpperCase;
		inputText.setEnabled(false);
		enterButton.setEnabled(false);
		inputTextSphere.setEnabled(false);
		sphereEnter.setEnabled(false);

		Integer n = getInputNumber();
		if (n == null) {
			resultArea.append("Invalid number !");
			return;
		}
		int baseTenNumber = n.intValue();
		resultArea.append("decimal = " + baseTenNumber + "\n");
		resultArea.append("binary = " + Integer.toString(baseTenNumber, 2) + "\n");
		resultArea.append("octal = " + Integer.toString(baseTenNumber, 8) + "\n");
		resultArea.append("hexadecimal = " + Integer.toString(baseTenNumber, 16) + "\n");

		hexUpperCase = Integer.toString(baseTenNumber, 16).toUpperCase();
		resultArea.append("hexadecimal = " + hexUpperCase + "\n");
	}

	private Integer getInputNumber() {
	
		try {
			Integer n = Integer.parseInt(inputText.getText());
			return n;
		} catch (Exception e) {
			/*
			oops problem with number entry
			this traps that error, now tell use the error
			and let them try an entry again
			return null is to prevent a total crash, but
		 	it really is not fixing the problem
			*/
			return null;
		}
	}
	private Double getInputRadius() {
		try {
			Double n = Double.parseDouble(inputTextSphere.getText());
			return n;
		} catch (Exception e) {
			return null;
		}
	}
}

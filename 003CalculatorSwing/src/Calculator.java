import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculator implements ActionListener {

		// class variables aka instance variables aka field variables
		JFrame frame;
		JTextField textField;
		// Buttons 0 through 9, add, subtract, multiply, divide,
		// equals, clear, backspace.
		JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdec, badd, 
		bsub, bmul, bdiv, beq, bclr, bksp, bsqr, bcbe, bsqt, blog;
		
		Double firstNumber;
		Double secondNumber;
		Double result;
		int operator;

		// constructor

		public Calculator() {
			frame = new JFrame("Calculator, Created by Dillon Bridgewater");
            frame.getContentPane().setBackground(Color.RED);
			textField = new JTextField();
            
            b1 = new JButton("1");
            b2 = new JButton("2");
            b3 = new JButton("3");
            b4 = new JButton("4");
            b5 = new JButton("5");
            b6 = new JButton("6");
            b7 = new JButton("7");
            b8 = new JButton("8");
            b9 = new JButton("9");
            b0 = new JButton("0");
            bdec = new JButton(".");
            badd = new JButton("+");
            bsub = new JButton("-");
            bmul = new JButton("*");
            bdiv = new JButton("/");
            beq = new JButton("=");
            bclr = new JButton("Clear");
            bksp = new JButton("Backspace");
            
            bsqr = new JButton("Square");
            bcbe = new JButton("Cube");
            bsqt = new JButton("Sq. Root");
            blog = new JButton("Log(10)");
            
            
            textField.setBounds(30,40,410,30);
            b7.setBounds(40,100,50,40);
            b8.setBounds(110,100,50,40);
            b9.setBounds(180,100,50,40);
            bdiv.setBounds(250,100,50,40);
            bsqr.setBounds(320,100,100,40);
            
            b4.setBounds(40,170,50,40);
            b5.setBounds(110,170,50,40);
            b6.setBounds(180,170,50,40);
            bmul.setBounds(250,170,50,40);
            bcbe.setBounds(320,170,100,40);
            
            b1.setBounds(40,240,50,40);
            b2.setBounds(110,240,50,40);
            b3.setBounds(180,240,50,40);
            bsub.setBounds(250,240,50,40);
            bsqt.setBounds(320,240,100,40);
            
            bdec.setBounds(40,310,50,40);
            b0.setBounds(110,310,50,40);
            beq.setBounds(180,310,50,40);
            badd.setBounds(250,310,50,40);
            blog.setBounds(320,310,100,40);
            
            bclr.setBounds(40,380,190,40);
            bksp.setBounds(270,380,120,40);
            
            b7.setBackground(Color.GREEN);
            b8.setBackground(Color.GREEN);
            b9.setBackground(Color.GREEN);
            bdiv.setBackground(Color.GREEN);
            bsqr.setBackground(Color.GREEN);
            
            b4.setBackground(Color.GREEN);
            b5.setBackground(Color.GREEN);
            b6.setBackground(Color.GREEN);
            bmul.setBackground(Color.GREEN);
            bcbe.setBackground(Color.GREEN);
            
            b1.setBackground(Color.GREEN);
            b2.setBackground(Color.GREEN);
            b3.setBackground(Color.GREEN);
            bsub.setBackground(Color.GREEN);
            bsqt.setBackground(Color.GREEN);

            bdec.setBackground(Color.GREEN);
            b0.setBackground(Color.GREEN);
            beq.setBackground(Color.GREEN);
            badd.setBackground(Color.GREEN);
            blog.setBackground(Color.GREEN);
            
            bclr.setBackground(Color.GREEN);
            bksp.setBackground(Color.GREEN);
            
            
            
            frame.add(textField);
            frame.add(b1);
            frame.add(b2);
            frame.add(b3);
            frame.add(b4);
            frame.add(b5);
            frame.add(b6);
            frame.add(b7);
            frame.add(b8);
            frame.add(b9);
            frame.add(b0);
            frame.add(bdec);
            frame.add(badd);
            frame.add(bsub);
            frame.add(bmul);
            frame.add(bdiv);
            frame.add(beq);
            frame.add(bclr);
            frame.add(bksp);
            
            frame.add(bsqr);
            frame.add(bcbe);
            frame.add(bsqt);
            frame.add(blog);
            
            frame.setSize(470, 500);
            frame.setLayout(null);
            frame.setVisible(true);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setSize(470, 500);
            

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            b0.addActionListener(this);
            bdec.addActionListener(this);
            badd.addActionListener(this);
            bsub.addActionListener(this);
            bmul.addActionListener(this);
            bdiv.addActionListener(this);
            beq.addActionListener(this);
            bclr.addActionListener(this);
            bksp.addActionListener(this);
            bsqr.addActionListener(this);
            bcbe.addActionListener(this);
            bsqt.addActionListener(this);
            blog.addActionListener(this);
		}
		
		// Listener -- waiting for an event, mouse click, mouse over ...
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1)
                textField.setText(textField.getText().concat("1"));
            if(e.getSource() == b2)
                textField.setText(textField.getText().concat("2"));
            if(e.getSource() == b3)
                textField.setText(textField.getText().concat("3"));
            if(e.getSource() == b4)
                textField.setText(textField.getText().concat("4"));
            if(e.getSource() == b5)
                textField.setText(textField.getText().concat("5"));
            if(e.getSource() == b6)
                textField.setText(textField.getText().concat("6"));
            if(e.getSource() == b7)
                textField.setText(textField.getText().concat("7"));
            if(e.getSource() == b8)
                textField.setText(textField.getText().concat("8"));
            if(e.getSource() == b9)
                textField.setText(textField.getText().concat("9"));
            if(e.getSource() == b0)
                textField.setText(textField.getText().concat("0"));
            if(e.getSource() == bdec)
                textField.setText(textField.getText().concat("."));
            if(e.getSource() == bclr) {
                textField.setText("");                
            }
            
            if(e.getSource() == badd) {
                firstNumber = Double.parseDouble(textField.getText());
                operator = 1;
                textField.setText("");
            }
            
            if(e.getSource() == bsub) {
                firstNumber = Double.parseDouble(textField.getText());
                operator = 2;
                textField.setText("");
            }
            
            if(e.getSource() == bmul) {
                firstNumber = Double.parseDouble(textField.getText());
                operator = 3;
                textField.setText("");
            }
            
            if(e.getSource() == bdiv) {
                firstNumber = Double.parseDouble(textField.getText());
                operator = 4;
                textField.setText("");
            }
            
            if(e.getSource() == bksp) {
            	//s is what was in the text field
                String s=textField.getText();
              //clear text field
                textField.setText(""); 
              //for every character in s minus one,
                for(int i=0;i<s.length()-1;i++) 
                	//add that character from s into the text field.
                    textField.setText(textField.getText()+s.charAt(i)); 
                
            }
            
            
            if(e.getSource() == beq) {
                secondNumber = Double.parseDouble(textField.getText());
                
                switch(operator) {
                    case 1:
                        result = firstNumber + secondNumber;
                        break;
                    case 2:
                        result = firstNumber - secondNumber;
                        break;
                    case 3:
                        result = firstNumber * secondNumber;
                        break;
                    case 4:
                        result = firstNumber / secondNumber;
                        break;
                    default: result = 0.0;
                }
                
                textField.setText(""+result);
            }
            if(e.getSource() == bsqr) {
            	firstNumber = Double.parseDouble(textField.getText());
            	result = Math.pow(firstNumber, 2);
            	textField.setText("" + result);
            }
            if(e.getSource() == bcbe) { 
            	firstNumber = Double.parseDouble(textField.getText());
            	result = Math.pow(firstNumber, 3);
            	textField.setText("" + result);
            }
            if(e.getSource() == bsqt) {
            	firstNumber = Double.parseDouble(textField.getText());
            	result = Math.sqrt(firstNumber);
            	textField.setText("" + result);
            }
            if(e.getSource() == blog) {
            	firstNumber = Double.parseDouble(textField.getText());
            	result = Math.log10(firstNumber);
            	textField.setText("" + result);
            }
            
		} // end of actionPerformed

		// Handler methods

	} // end of Calculator class
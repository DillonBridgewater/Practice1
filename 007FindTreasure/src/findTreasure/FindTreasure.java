
package findTreasure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FindTreasure extends JFrame {
	ImageIcon cat = new ImageIcon("findTreasure1.gif");
	ImageIcon bomb = new ImageIcon("destructo.gif");
	JButton newButton = new JButton();
	int catLocation;
	int bombLocation = 1;
	Random myRandom = new Random();
	int rowCount = 5;
	int columnCount = 5;
	JLabel countLabel = new JLabel();
	int clicks = 0;
	JLabel[] choiceLabel = new JLabel[(rowCount*columnCount)];
	

	public static void main(String args[]) {
		// create frame
		new FindTreasure().setVisible(true);
	}

	public FindTreasure() {
		for (int i = 0; i < (rowCount*columnCount); i++) {
			choiceLabel[i] = new JLabel();
		}
		
		// frame constructor
		setTitle("Find the Cat. Dillon Bridgewater November 2018");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				exitForm(evt);
			}
		});
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints;
		
		
		for (int j=0; j < columnCount*rowCount; j+=rowCount) {
			for (int i = 0; i < rowCount; i++) {
				gridConstraints = new GridBagConstraints();
				choiceLabel[i+j].setPreferredSize(new Dimension(cat.getIconWidth(), cat.getIconHeight()));
				choiceLabel[i+j].setOpaque(true);
				choiceLabel[i+j].setBackground(Color.RED);
				gridConstraints.gridx = i;
				gridConstraints.gridy = j/5;
				gridConstraints.insets = new Insets(10, 10, 10, 10);
				getContentPane().add(choiceLabel[i+j], gridConstraints);
				choiceLabel[i+j].addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
;
						labelMouseClicked(e);
						
					}
				});
			}
		}
		newButton.setText("Play Again");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 1+(rowCount);
		gridConstraints.insets = new Insets(10, 10, 10, 10);
		getContentPane().add(newButton, gridConstraints);
		newButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newButtonActionPerformed(e);
			}
		});
		countLabel.setText("Clicks:" + clicks);
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = rowCount;
		gridConstraints.gridy = 0;
		getContentPane().add(countLabel, gridConstraints);
		getContentPane().setBackground(Color.YELLOW);
		pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height - getHeight())),
				getWidth(), getHeight());
		// start first game
		clicks = 0;
		newButton.doClick();
		
	}

	private void labelMouseClicked(MouseEvent e) {
		Component clickedComponent = e.getComponent();
		int choice;
		for (choice = 0; choice < (columnCount*rowCount); choice++) {
			if (clickedComponent == choiceLabel[choice]) {
				break;
			}
		}
		if (choiceLabel[choice].getBackground() != Color.WHITE) {
			clicks += 1;
			countLabel.setText("Clicks:" + clicks);
		}
		choiceLabel[choice].setBackground(Color.WHITE);
		if (choice == catLocation) {
			choiceLabel[choice].setIcon(cat);
			newButton.setEnabled(true);
		}
		else if (choice == bombLocation) {
			choiceLabel[choice].setIcon(bomb);
			JOptionPane.showMessageDialog(clickedComponent, "Game Over!");
			int savedClicks = clicks;
			newButton.setEnabled(true);
			newButton.doClick();
			clicks = savedClicks;
			countLabel.setText("Clicks: " + clicks);
			
		}
	}

	private void newButtonActionPerformed(ActionEvent e) {
		// clear boxes and hide cat
		for (int i = 0; i < (columnCount*rowCount); i++) {
			choiceLabel[i].setIcon(null);
			choiceLabel[i].setBackground(Color.RED);
		}
		catLocation = myRandom.nextInt(columnCount*rowCount);
		bombLocation = myRandom.nextInt(columnCount*rowCount);
		clicks = 0;
		newButton.setEnabled(false);
		countLabel.setText("Clicks: " + clicks);
	}

	private void exitForm(WindowEvent evt) {
		System.exit(0);
	}
}

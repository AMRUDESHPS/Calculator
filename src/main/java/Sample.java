import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Sample implements ActionListener {

	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton, eightButton, nineButton, fiveButton, sixButton, fourButton, threeButton, twoButton, oneButton,
			zeroButton, pointButton, substrationButton, sumButton, productButton, divisionButton, equalButton,
			clearButton;
	String oldValue;
	boolean isOperaterClicked = false;

	public Sample() {

		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300, 150);

		displayLabel = new JLabel("");
		displayLabel.setBounds(30, 30, 540, 70);
		displayLabel.setBackground(Color.gray);
		displayLabel.setForeground(Color.white);
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);

		sevenButton = new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		jf.add(sevenButton);
		sevenButton.addActionListener(this);

		eightButton = new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		jf.add(eightButton);
		eightButton.addActionListener(this);

		nineButton = new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		jf.add(nineButton);
		nineButton.addActionListener(this);

		sixButton = new JButton("6");
		sixButton.setBounds(30, 230, 80, 80);
		jf.add(sixButton);
		sixButton.addActionListener(this);

		fiveButton = new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		jf.add(fiveButton);
		fiveButton.addActionListener(this);

		fourButton = new JButton("4");
		fourButton.setBounds(230, 230, 80, 80);
		jf.add(fourButton);
		fourButton.addActionListener(this);

		threeButton = new JButton("3");
		threeButton.setBounds(30, 330, 80, 80);
		jf.add(threeButton);
		threeButton.addActionListener(this);

		twoButton = new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		jf.add(twoButton);
		twoButton.addActionListener(this);

		oneButton = new JButton("1");
		oneButton.setBounds(230, 330, 80, 80);
		jf.add(oneButton);
		oneButton.addActionListener(this);

		pointButton = new JButton(".");
		pointButton.setBounds(30, 430, 80, 80);
		jf.add(pointButton);
		pointButton.addActionListener(this);

		zeroButton = new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		jf.add(zeroButton);
		zeroButton.addActionListener(this);

		equalButton = new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		jf.add(equalButton);
		equalButton.addActionListener(this);

		divisionButton = new JButton("/");
		divisionButton.setBounds(330, 130, 80, 80);
		jf.add(divisionButton);
		divisionButton.addActionListener(this);

		productButton = new JButton("*");
		productButton.setBounds(330, 230, 80, 80);
		jf.add(productButton);
		productButton.addActionListener(this);

		sumButton = new JButton("+");
		sumButton.setBounds(330, 330, 80, 80);
		jf.add(sumButton);
		sumButton.addActionListener(this);

		substrationButton = new JButton("-");
		substrationButton.setBounds(330, 430, 80, 80);
		jf.add(substrationButton);
		substrationButton.addActionListener(this);

		clearButton = new JButton("clear all");
		clearButton.setBounds(430, 430, 80, 80);
		jf.add(clearButton);
		clearButton.addActionListener(this);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String args[]) {
		new Sample();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sevenButton) {
			if (isOperaterClicked) {
				displayLabel.setText("7");
				isOperaterClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText() + "7");
			}

		} else if (e.getSource() == eightButton) {
			if (isOperaterClicked) {
				displayLabel.setText("8");
				isOperaterClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText() + "8");
			}

		} else if (e.getSource() == nineButton) {
			if (isOperaterClicked) {
				displayLabel.setText("9");
				isOperaterClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText() + "9");
			}
		} else if (e.getSource() == sixButton) {
			if (isOperaterClicked) {
				displayLabel.setText("6");
				isOperaterClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText() + "6");
			}
		} else if (e.getSource() == fiveButton) {
			if (isOperaterClicked) {
				displayLabel.setText("5");
				isOperaterClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText() + "5");
			}
		} else if (e.getSource() == fourButton) {
			if (isOperaterClicked) {
				displayLabel.setText("4");
				isOperaterClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText() + "4");
			}
		} else if (e.getSource() == threeButton) {
			if (isOperaterClicked) {
				displayLabel.setText("3");
				isOperaterClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText() + "3");
			}
		} else if (e.getSource() == twoButton) {
			if (isOperaterClicked) {
				displayLabel.setText("2");
				isOperaterClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText() + "2");
			}
		} else if (e.getSource() == oneButton) {
			if (isOperaterClicked) {
				displayLabel.setText("1");
				isOperaterClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText() + "1");
			}
		} else if (e.getSource() == zeroButton) {
			if (isOperaterClicked) {
				displayLabel.setText("0");
				isOperaterClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText() + "0");
			}
		} else if (e.getSource() == pointButton) {
			if (isOperaterClicked) {
				displayLabel.setText(".");
				isOperaterClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText() + ".");
			}
		} else if (e.getSource() == sumButton) {
			isOperaterClicked = true;
			oldValue = displayLabel.getText();

		} else if (e.getSource() == substrationButton) {
			isOperaterClicked = true;
			oldValue = displayLabel.getText();
		} else if (e.getSource() == productButton) {
			isOperaterClicked = true;
			oldValue = displayLabel.getText();
		} else if (e.getSource() == divisionButton) {
			isOperaterClicked = true;
			oldValue = displayLabel.getText();
		} else if (e.getSource() == equalButton) {
			if (oldValue == null) {
				displayLabel.setText(displayLabel.getText());

			} else {
				String newValue = displayLabel.getText();
				float oldValueF = Float.parseFloat(oldValue);
				float newValueF = Float.parseFloat(newValue);
				float result = oldValueF + newValueF;
				displayLabel.setText(result + "");
			}

		} else if (e.getSource() == clearButton) {
			displayLabel.setText("");

		}

	}
}
package scientific_calculator;




/*
 scientific calculator program using java swing 
 
  */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Window.Type;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 499, 636);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setBounds(10, 10, 465, 50);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 80, 465, 50);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("e^x");
		btnNewButton_7.setBounds(123, 167, 69, 50);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_7.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("sin");
		btnNewButton_8.setBounds(202, 167, 69, 50);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_8.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("cos");
		btnNewButton_9.setBounds(281, 167, 69, 50);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_9.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("tan");
		btnNewButton_10.setBounds(360, 167, 69, 50);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_10.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_1_4 = new JButton("tanh");
		btnNewButton_1_4.setBounds(360, 220, 69, 50);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_4.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 17));
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_3 = new JButton("cosh");
		btnNewButton_1_3.setBounds(281, 220, 69, 50);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 17));
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_2 = new JButton("sinh");
		btnNewButton_1_2.setBounds(202, 220, 69, 50);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 17));
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.setBounds(123, 220, 69, 50);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("%");
		btnNewButton_2_1.setBounds(123, 271, 69, 50);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="%";
			}
		});
		btnNewButton_2_1.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 30));
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("C");
		btnNewButton_2_2.setBounds(202, 271, 69, 50);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_2_2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 30));
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("\uF0E7");
		btnNewButton_2_3.setBounds(281, 271, 69, 50);
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					b=str.toString();
					textField.setText(b);
							
							
				}
			}
		});
		btnNewButton_2_3.setFont(new Font("Wingdings", Font.PLAIN, 25));
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("-");
		btnNewButton_2_4.setBounds(360, 271, 69, 50);
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="-";
			}
		});
		btnNewButton_2_4.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(btnNewButton_2_4);
		
		JButton btnNewButton_3_4 = new JButton("+");
		btnNewButton_3_4.setBounds(360, 322, 69, 50);
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="+";
			}
		});
		btnNewButton_3_4.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(btnNewButton_3_4);
		
		JButton BTN7 = new JButton("7");
		BTN7.setBounds(281, 322, 69, 50);
		BTN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+BTN7.getText();
				textField.setText(number);
			}
		});
		BTN7.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(BTN7);
		
		JButton BTN8 = new JButton("8");
		BTN8.setBounds(202, 322, 69, 50);
		BTN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+BTN8.getText();
				textField.setText(number);
			}
		});
		BTN8.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(BTN8);
		
		JButton BTN9 = new JButton("9");
		BTN9.setBounds(123, 322, 69, 50);
		BTN9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+BTN9.getText();
				textField.setText(number);
			}
		});
		BTN9.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(BTN9);
		
		JButton BTN4 = new JButton("4");
		BTN4.setBounds(123, 375, 69, 50);
		BTN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+BTN4.getText();
				textField.setText(number);
			}
		});
		BTN4.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(BTN4);
		
		JButton BTN5 = new JButton("5");
		BTN5.setBounds(202, 375, 69, 50);
		BTN5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+BTN5.getText();
				textField.setText(number);
			}
		});
		BTN5.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(BTN5);
		
		JButton btnNewButton_4_3 = new JButton("6");
		btnNewButton_4_3.setBounds(281, 375, 69, 50);
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_4_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4_3.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(btnNewButton_4_3);
		
		JButton btnNewButton_4_4 = new JButton("*");
		btnNewButton_4_4.setBounds(360, 375, 69, 50);
		btnNewButton_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="*";
			}
		});
		btnNewButton_4_4.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(btnNewButton_4_4);
		
		JButton btnNewButton_5_4 = new JButton("/");
		btnNewButton_5_4.setBounds(360, 427, 69, 50);
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation="/";
			}
		});
		btnNewButton_5_4.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(btnNewButton_5_4);
		
		JButton btnNewButton_6_4 = new JButton("=");
		btnNewButton_6_4.setBounds(360, 478, 69, 50);
		btnNewButton_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%2f", result);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%2f", result);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%2f", result);
				}
				else if(operation=="/") {
					result=first-second;
					answer=String.format("%2f", result);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%2f", result);
				}
				
				textField.setText(answer);
				
			}
		});
		btnNewButton_6_4.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(btnNewButton_6_4);
		
		JButton BTN_DOT = new JButton(".");
		BTN_DOT.setBounds(281, 478, 69, 50);
		BTN_DOT.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(BTN_DOT);
		
		JButton btnNewButton_6_2 = new JButton("0");
		btnNewButton_6_2.setBounds(123, 478, 148, 50);
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_6_2.getText();
				textField.setText(number);
			}
			
		});
		btnNewButton_6_2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(btnNewButton_6_2);
		
		JButton BTN2 = new JButton("2");
		BTN2.setBounds(202, 427, 69, 50);
		BTN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+BTN2.getText();
				textField.setText(number);
			}
		});
		BTN2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(BTN2);
		
		JButton BTN3 = new JButton("3");
		BTN3.setBounds(281, 427, 69, 50);
		BTN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+BTN3.getText();
				textField.setText(number);
			}
		});
		BTN3.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(BTN3);
		
		JButton btnNewButton_5_1 = new JButton("1");
		btnNewButton_5_1.setBounds(123, 427, 69, 50);
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_5_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_5_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 30));
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5 = new JButton("n!");
		btnNewButton_5.setBounds(44, 427, 69, 50);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				textField.setText(String.valueOf(fact));
			}
		});
		btnNewButton_5.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 30));
		frame.getContentPane().add(btnNewButton_5);
	
		JButton btnNewButton_6 = new JButton("+/-");
		btnNewButton_6.setBounds(44, 478, 69, 50);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnNewButton_6.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_5_2 = new JButton("x^2");
		btnNewButton_5_2.setBounds(44, 375, 69, 50);
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.pow(Double.parseDouble(textField.getText()),2);
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_5_2.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("x^3");
		btnNewButton_5_3.setBounds(44, 322, 69, 50);
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.pow(Double.parseDouble(textField.getText()),3);
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_5_3.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton_5_3);
		
		JButton btnNewButton_5_5 = new JButton("x^y");
		btnNewButton_5_5.setBounds(44, 271, 69, 50);
		btnNewButton_5_5.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("1/x");
		btnNewButton_5_6.setBounds(44, 220, 69, 50);
		btnNewButton_5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_5_6.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("\u221A");
		btnNewButton_5_7.setBounds(44, 167, 69, 50);
		btnNewButton_5_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_5_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton_5_7);
		
		JLabel lblNewLabel_1 = new JLabel("First enter the number and then click on the operation");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 558, 430, 31);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_1);
	}
}

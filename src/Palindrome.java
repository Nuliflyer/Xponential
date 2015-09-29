import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Palindrome extends JFrame {

	private JPanel contentPane;
	private JTextField txtLowerBound;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Palindrome frame = new Palindrome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Palindrome() {
		getContentPane().setLayout(null);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 11, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 11, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 164, 137);
		contentPane.add(textArea);

		txtLowerBound = new JTextField();
		txtLowerBound.setText("Palindrome");
		txtLowerBound.setBounds(10, 190, 152, 20);
		contentPane.add(txtLowerBound);
		txtLowerBound.setColumns(10);

		JButton btnNewButton = new JButton("Palindromes!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = txtLowerBound.getText();
				boolean b = true;
				for(int index = 0; index < s.length()/2; index++){
					if(!s.substring(index, index+1).equals(s.substring(s.length()-1-index, s.length()-index))){
						b = false;
						break;
					}
				}
				textArea.setText(b + "");
			}
		});
		btnNewButton.setBounds(0, 159, 93, 20);
		contentPane.add(btnNewButton);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu mm = new MainMenu();
				mm.setVisible(true);
				dispose();
				
			}
		});
		btnBack.setBounds(102, 159, 72, 20);
		contentPane.add(btnBack);
	}
}

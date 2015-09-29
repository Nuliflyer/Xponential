import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class PrimeGaps extends JFrame {

	private JPanel contentPane;
	private JTextField txtInputNHere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeGaps frame = new PrimeGaps();
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
	public PrimeGaps() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 164, 142);
		contentPane.add(scrollPane);
		
		JTextArea txtrAveragePrimeGap = new JTextArea();
		txtrAveragePrimeGap.setText("Average Prime Gap Here");
		scrollPane.setViewportView(txtrAveragePrimeGap);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mm = new MainMenu();
				mm.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 187, 55, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNGapsAverage = new JButton("n Gaps average");
		btnNGapsAverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtInputNHere.getText());
				ArrayList<Integer> primes = new ArrayList<Integer>(0);
				primes.add(2);
				if(n < 2) n = 2;
				for(int testPrime = 2; primes.size() <= n; testPrime++){
					for(int index = 2; index < testPrime; index++){
						if(testPrime%index == 0){
							break;
						}
						if(testPrime == index+1){
							primes.add(testPrime);
						}
					}
				}
				double a = 0;
				for(int index = 1; index < primes.size(); index++){
					a += primes.get(index) - primes.get(index-1);
				}
				a = a/primes.size();
				txtrAveragePrimeGap.setText(a + "");
				
			}
		});
		btnNGapsAverage.setBounds(65, 187, 109, 23);
		contentPane.add(btnNGapsAverage);
		
		txtInputNHere = new JTextField();
		txtInputNHere.setText("Input n Here");
		txtInputNHere.setBounds(10, 164, 164, 20);
		contentPane.add(txtInputNHere);
		txtInputNHere.setColumns(10);
		
		
	}

}

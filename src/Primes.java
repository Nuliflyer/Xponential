import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class Primes extends JFrame {

	private JPanel contentPane;
	private JTextField txtIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Primes frame = new Primes();
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
	public Primes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 164, 108);
		contentPane.add(scrollPane);
		
		JTextArea txtrPrimesGoHere = new JTextArea();
		txtrPrimesGoHere.setText("Primes Go Here");
		scrollPane.setViewportView(txtrPrimesGoHere);
		
		JButton btnFindNPrimes = new JButton("Find n Primes");
		btnFindNPrimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Integer> primes = new ArrayList<Integer>(0);
				int n = Integer.parseInt(txtIn.getText());
				if(n < 1) n = 1;
				for(int testPrime = 2; primes.size() < n; testPrime++){
					for(int index = 2; index < testPrime; index++){
						if(testPrime%index == 0){
							break;
						}
						if(testPrime == index+1){
							primes.add(testPrime);
						}
					}
				}
				String list = "";
				for(int index = 0; index < primes.size(); index++){
					list += primes.get(index) + ", ";
				}		
				txtrPrimesGoHere.setText(list);
			}
		});
		btnFindNPrimes.setBounds(10, 188, 164, 23);
		contentPane.add(btnFindNPrimes);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu mm = new MainMenu();
				mm.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(10, 160, 164, 23);
		contentPane.add(btnBack);
		
		txtIn = new JTextField();
		txtIn.setText("Input n Here");
		txtIn.setBounds(48, 129, 86, 20);
		contentPane.add(txtIn);
		txtIn.setColumns(10);
		
		
		
		
	}
}

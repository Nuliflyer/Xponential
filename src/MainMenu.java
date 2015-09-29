import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JLabel;


public class MainMenu extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Background");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Xponents");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExpodentialMenu em = new ExpodentialMenu();
				em.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 187, 74, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Palindromes");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Palindrome p = new Palindrome();
				p.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(100, 187, 74, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnPrimes = new JButton("Primes");
		btnPrimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Primes p = new Primes();
				p.setVisible(true);
				dispose();
			}
		});
		btnPrimes.setBounds(100, 153, 74, 23);
		contentPane.add(btnPrimes);
		
		JButton btnPrimeGaps = new JButton("Prime Gaps");
		btnPrimeGaps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrimeGaps pg = new PrimeGaps();
				pg.setVisible(true);
				dispose();
			}
		});
		btnPrimeGaps.setBounds(10, 153, 74, 23);
		contentPane.add(btnPrimeGaps);
		
		JButton button_2 = new JButton("Random");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int x = r.nextInt(5);
				switch(x){
				case 0: ExperimentalPi pi = new ExperimentalPi();  pi.setVisible(true); break;
				case 1: ExpodentialMenu em = new ExpodentialMenu(); em.setVisible(true); break;
				case 2: Palindrome p = new Palindrome(); p.setVisible(true); break;
				case 3: PrimeGaps pg = new PrimeGaps(); pg.setVisible(true); break;
				case 4: Primes pr = new Primes(); pr.setVisible(true); break;
				}
				dispose();
			}
		});
		button_2.setBounds(100, 119, 74, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Pi");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExperimentalPi pi = new ExperimentalPi();
				pi.setVisible(true);
			}
		});
		button_3.setBounds(10, 119, 74, 23);
		contentPane.add(button_3);
		lblNewLabel.setBounds(0, 0, 184, 221);
		contentPane.add(lblNewLabel);
	}

}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;


public class ExperimentalPi extends JFrame {

	private JPanel contentPane;
	private JTextField txtTestValues;
	private JTextField txtRadius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExperimentalPi frame = new ExperimentalPi();
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
	public ExperimentalPi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu mm = new MainMenu();
				mm.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 187, 68, 23);
		contentPane.add(btnNewButton);
		
		txtTestValues = new JTextField();
		txtTestValues.setText("Test Values");
		txtTestValues.setColumns(10);
		txtTestValues.setBounds(10, 82, 86, 20);
		contentPane.add(txtTestValues);
		
		JLabel lblExperimentalValueOf = new JLabel("Experimental Value of Pi");
		lblExperimentalValueOf.setBounds(10, 112, 121, 23);
		contentPane.add(lblExperimentalValueOf);
		
		JLabel lblerror = new JLabel("%Error");
		lblerror.setBounds(10, 153, 121, 23);
		contentPane.add(lblerror);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					  int n = Integer.parseInt(txtTestValues.getText());
					  double radius = Double.parseDouble(txtRadius.getText());
					  Random r = new Random();
					  int circleArea = 0;
					  for(int counter = 0; counter<n; counter++)
					  {
					   double x = r.nextDouble()*radius*2;
					   double y = r.nextDouble()*radius*2;
					   if (Math.sqrt(Math.pow(radius - x, 2) + Math.pow(radius - y, 2)) <= radius)
					   {
					    circleArea++;
					   }
					  }
					  double pi = 1.0*circleArea/n * 4;
					  lblExperimentalValueOf.setText(pi + "");
					  lblerror.setText(Math.abs(pi - 3.14159265258979323846264)/3.14159265258979323846264 * 100 + "%");
					 
			}
		});
		btnStart.setBounds(88, 187, 86, 23);
		contentPane.add(btnStart);
		
		
		
		
		
		txtRadius = new JTextField();
		txtRadius.setText("Radius");
		txtRadius.setColumns(10);
		txtRadius.setBounds(10, 51, 86, 20);
		contentPane.add(txtRadius);
		
		
	}
}

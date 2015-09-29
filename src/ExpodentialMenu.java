import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ExpodentialMenu extends JFrame {

	private JPanel contentPane;
	private static JTextField textBase;
	private static JTextField horizontalStretch;
	private static JTextField verticalStretch;
	private static JTextField horizontalShift;
	private static JTextField verticalShift;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpodentialMenu frame = new ExpodentialMenu();
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
	public ExpodentialMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textBase = new JTextField();
		textBase.setBounds(40, 35, 86, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		textBase.setText("base");
		
		horizontalStretch = new JTextField();
		horizontalStretch.setBounds(40, 66, 86, 20);
		contentPane.add(horizontalStretch);
		horizontalStretch.setColumns(10);
		horizontalStretch.setText("Horizontal Stretch");
		
		verticalStretch = new JTextField();
		verticalStretch.setBounds(40, 97, 86, 20);
		contentPane.add(verticalStretch);
		verticalStretch.setColumns(10);
		verticalStretch.setText("Vertical Stretch");
		
		horizontalShift = new JTextField();
		horizontalShift.setBounds(40, 128, 86, 20);
		contentPane.add(horizontalShift);
		horizontalShift.setColumns(10);
		horizontalShift.setText("Horizontal Shift");
		
		verticalShift = new JTextField();
		verticalShift.setBounds(40, 159, 86, 20);
		contentPane.add(verticalShift);
		verticalShift.setColumns(10);
		verticalShift.setText("Vertical Shift");
		
		
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu mm = new MainMenu();
				mm.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(0, 199, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnGraph = new JButton("Graph");
		btnGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExpodentialGraph Eg = new ExpodentialGraph();
				Eg.setVisible(true);
				dispose();
			}
		});
		btnGraph.setBounds(95, 199, 89, 23);
		contentPane.add(btnGraph);
	}
	public static double base(){
		double b = Double.parseDouble(textBase.getText());
		return b;
				
	}
	public static double horizontalStretch(){
		double hst = Double.parseDouble(horizontalStretch.getText());
		return hst;
	}
	public static double verticalStretch(){
		double vst = Double.parseDouble(verticalStretch.getText());
		return vst;
	}
	public static double horizontalShift(){
		double hsh = Double.parseDouble(horizontalShift.getText());
		return hsh;
	}
	public static double verticalShift(){
		double vsh = Double.parseDouble(verticalShift.getText());
		return vsh;
	}
	
}

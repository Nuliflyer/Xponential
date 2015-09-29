import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TitleScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TitleScreen frame = new TitleScreen();
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
	public TitleScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu menu = new MainMenu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(0, 187, 184, 23);
		contentPane.add(btnNewButton);
		
		
		JLabel lblPicture = new JLabel("Picture");
		Image img = new ImageIcon(this.getClass().getResource("/Shrek_fierce.jpg")).getImage();
		lblPicture.setBounds(0, 0, 184, 221);
		lblPicture.setIcon(new ImageIcon(img));
		contentPane.add(lblPicture);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Hashtable;
import java.util.Random;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.imageio.*;

public class ExpodentialGraph extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpodentialGraph frame = new ExpodentialGraph();
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
	public ExpodentialGraph() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExpodentialMenu Em = new ExpodentialMenu();
				Em.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(0, 199, 89, 23);
		contentPane.add(btnBack);
		
		
		
	}

public void paint(Graphics g){
	

	double a = ExpodentialMenu.verticalStretch();
	double b = ExpodentialMenu.base();
	double c = ExpodentialMenu.horizontalShift();
	double d = ExpodentialMenu.verticalShift();
	double k = ExpodentialMenu.horizontalStretch();
	
	
	System.out.println(d);
	
	
	g.setColor(Color.black);
	g.drawLine(0, 150, 300, 150);
	g.drawLine(75, 0, 75, 300);
	for(int counter1 = 0; counter1<250; counter1++){
		
		g.drawLine(counter1,-(int)(10.0* a*Math.pow(b,( k*(counter1 - 75)/25-c)) + d*10) + 150, counter1+1,-(int)(10.0*a*Math.pow(b,( k*(counter1 -74)/25-c)) + d*10)+ 150);
	
	}
		
	
	
}
}



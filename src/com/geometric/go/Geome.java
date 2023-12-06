package com.geometric.go;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Geome extends JFrame {

	private JPanel contentPane;

	public Geome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 915);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6_1_3_3 = new JLabel("");
		lblNewLabel_6_1_3_3.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6_1_3_3.setBounds(422, 391, 31, 50);
		contentPane.add(lblNewLabel_6_1_3_3);
		
		JLabel lblNewLabel_5_5_1_2 = new JLabel("V = \u222B[a,b] \u03C0(r(y))^2 dy");
		lblNewLabel_5_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_5_1_2.setBounds(451, 391, 223, 50);
		contentPane.add(lblNewLabel_5_5_1_2);
		
		JLabel lblNewLabel_10 = new JLabel("Donde a y b son los l\u00EDmites de integraci\u00F3n en y, y r(y) es el radio de cada disco en funci\u00F3n de y.");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(10, 472, 664, 58);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel = new JLabel("VOLUMEN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 74));
		lblNewLabel.setBounds(0, 0, 684, 77);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hallar el volumen del solido generado  al girar la region acotada por ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(20, 88, 645, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("y=2x, y=x/2 y x=1 alrededor del eje y ?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(20, 124, 594, 40);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\Geometria.jpeg"));
		lblNewLabel_3.setBounds(-217, 168, 509, 332);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("l. Determinar limites de integracion");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(314, 178, 360, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("y=2x ---> y=x/2");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(343, 214, 166, 50);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6.setBounds(302, 214, 31, 50);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6_1.setBounds(302, 255, 31, 50);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("2x = x/2\r\n");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_1.setBounds(343, 255, 87, 50);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("4x=x");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_2.setBounds(343, 300, 166, 50);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("4x - x=0\r\n");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_3.setBounds(343, 346, 166, 50);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("3x=0\r\n");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_4.setBounds(343, 391, 166, 50);
		contentPane.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("");
		lblNewLabel_6_1_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6_1_1.setBounds(302, 300, 31, 50);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("");
		lblNewLabel_6_1_2.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6_1_2.setBounds(302, 346, 31, 50);
		contentPane.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("");
		lblNewLabel_6_1_3.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6_1_3.setBounds(302, 391, 31, 50);
		contentPane.add(lblNewLabel_6_1_3);
		
		JLabel lblNewLabel_7 = new JLabel("Por lo tanto:\r\n");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(513, 262, 123, 43);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Curva interseccion (0,0)");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setBounds(461, 304, 223, 43);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Restriccion x=1");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8_1.setBounds(461, 337, 223, 43);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\icons8-gira-a-la-derecha-100.png"));
		lblNewLabel_6_2.setBounds(422, 255, 87, 50);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_5_5 = new JLabel("r(y)=2x\r\n");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_5.setBounds(554, 511, 87, 50);
		contentPane.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_11 = new JLabel("Como x = y/2, reemplazamos en la expresi\u00F3n anterior:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_11.setBounds(35, 511, 509, 50);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_5_5_1 = new JLabel("r(y)=2(y/2) ---> y\r\n\r\n");
		lblNewLabel_5_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_5_1.setBounds(219, 550, 223, 50);
		contentPane.add(lblNewLabel_5_5_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("Ahora podemos escribir la integral completa:");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_11_1.setBounds(10, 593, 414, 50);
		contentPane.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_12 = new JLabel("V = \u222B[0,1] \u03C0(y)^2 dy");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_12.setBounds(471, 593, 203, 50);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_6_1_3_1 = new JLabel("");
		lblNewLabel_6_1_3_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6_1_3_1.setBounds(430, 593, 31, 50);
		contentPane.add(lblNewLabel_6_1_3_1);
		
		JLabel lblNewLabel_6_1_3_2 = new JLabel("");
		lblNewLabel_6_1_3_2.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6_1_3_2.setBounds(199, 550, 31, 50);
		contentPane.add(lblNewLabel_6_1_3_2);
		
		JLabel lblNewLabel_6_1_3_1_1 = new JLabel("");
		lblNewLabel_6_1_3_1_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6_1_3_1_1.setBounds(199, 627, 31, 50);
		contentPane.add(lblNewLabel_6_1_3_1_1);
		
		JLabel lblNewLabel_5_5_1_1 = new JLabel("V = \u03C0 \u222B[0,1] y^2 dy\r\n\r\n");
		lblNewLabel_5_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_5_1_1.setBounds(219, 627, 223, 50);
		contentPane.add(lblNewLabel_5_5_1_1);
		
		JLabel lblNewLabel_6_1_3_1_1_1 = new JLabel("");
		lblNewLabel_6_1_3_1_1_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6_1_3_1_1_1.setBounds(199, 670, 31, 50);
		contentPane.add(lblNewLabel_6_1_3_1_1_1);
		
		JLabel lblNewLabel_5_5_1_1_1 = new JLabel("V = \u03C0 [y^3/3] [0,1]");
		lblNewLabel_5_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_5_1_1_1.setBounds(219, 670, 223, 50);
		contentPane.add(lblNewLabel_5_5_1_1_1);
		
		JLabel lblNewLabel_6_1_3_1_1_2 = new JLabel("");
		lblNewLabel_6_1_3_1_1_2.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6_1_3_1_1_2.setBounds(199, 717, 31, 50);
		contentPane.add(lblNewLabel_6_1_3_1_1_2);
		
		JLabel lblNewLabel_5_5_1_1_2 = new JLabel("V = \u03C0 [(1^3/3) - (0^3/3)]");
		lblNewLabel_5_5_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_5_1_1_2.setBounds(219, 717, 262, 50);
		contentPane.add(lblNewLabel_5_5_1_1_2);
		
		JLabel lblNewLabel_5_5_1_1_2_1 = new JLabel("V = \u03C0 (1/3)");
		lblNewLabel_5_5_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5_5_1_1_2_1.setBounds(197, 765, 181, 50);
		contentPane.add(lblNewLabel_5_5_1_1_2_1);
		
		JLabel lblNewLabel_6_1_3_1_1_2_1 = new JLabel("");
		lblNewLabel_6_1_3_1_1_2_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\flecha-derecha.png"));
		lblNewLabel_6_1_3_1_1_2_1.setBounds(199, 765, 31, 50);
		contentPane.add(lblNewLabel_6_1_3_1_1_2_1);
		
		JLabel lblNewLabel_13 = new JLabel("\r\n");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\icons8-geometr\u00EDa-98.png"));
		lblNewLabel_13.setBounds(20, 0, 113, 99);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_13_1 = new JLabel("\r\n");
		lblNewLabel_13_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\icons8-geometr\u00EDa-64 (1).png"));
		lblNewLabel_13_1.setBounds(20, 654, 113, 99);
		contentPane.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_13_2 = new JLabel("\r\n");
		lblNewLabel_13_2.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\icons8-geometr\u00EDa-96.png"));
		lblNewLabel_13_2.setBounds(71, 753, 113, 99);
		contentPane.add(lblNewLabel_13_2);
		
		JLabel lblNewLabel_13_3 = new JLabel("\r\n");
		lblNewLabel_13_3.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\icons8-prism-100.png"));
		lblNewLabel_13_3.setBounds(528, 648, 113, 99);
		contentPane.add(lblNewLabel_13_3);
		
		JLabel lblNewLabel_13_4 = new JLabel("\r\n");
		lblNewLabel_13_4.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\icons8-grados-100.png"));
		lblNewLabel_13_4.setBounds(461, 766, 113, 99);
		contentPane.add(lblNewLabel_13_4);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\Geometria\\src\\com\\geometric\\main\\18823.jpg"));
		lblNewLabel_14.setBounds(0, 0, 684, 876);
		contentPane.add(lblNewLabel_14);
	}
}

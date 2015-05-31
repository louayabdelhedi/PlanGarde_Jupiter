package edu.iit.ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.ImageIcon;

import java.awt.Label;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import java.awt.Button;
import java.util.Vector;

public class VacanceInterface extends JFrame {
//som3a
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JScrollPane scrollPane;

	 /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VacanceInterface frame = new VacanceInterface();
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
	public VacanceInterface() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Enregister");
		btnNewButton.setBounds(397, 430, 111, 23);
		contentPane.add(btnNewButton);
		Image img = new ImageIcon(this.getClass().getResource("/VANCENCE.jpg")).getImage();
		
		JLabel lblNomMedecin = new JLabel("Nom Medecin :");
		lblNomMedecin.setForeground(new Color(0, 0, 51));
		lblNomMedecin.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNomMedecin.setBounds(199, 103, 154, 40);
		contentPane.add(lblNomMedecin);
		
		JLabel lblDateDebut = new JLabel("Date Debut :");
		lblDateDebut.setForeground(new Color(0, 0, 51));
		lblDateDebut.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblDateDebut.setBounds(199, 154, 154, 40);
		contentPane.add(lblDateDebut);
		
		JLabel lblDateFin = new JLabel("Date Fin :");
		lblDateFin.setForeground(new Color(0, 0, 51));
		lblDateFin.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblDateFin.setBounds(199, 205, 154, 40);
		contentPane.add(lblDateFin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(367, 111, 217, 29);
		contentPane.add(comboBox);
		
		table = new JTable();
		table.setBounds(328, 351, 1, 1);
		contentPane.add(table);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "New column", "New column", "New column", "New column"
			}
		));
		table_2.setBounds(897, 323, -407, 23);
		contentPane.add(table_2);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"date", "ID"
			}
		));
		table_3.setBounds(51, 494, 86, -19);
		contentPane.add(table_3);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table_4.setBounds(103, 496, 119, -13);
		contentPane.add(table_4);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(240, 286, 565, 125);
		contentPane.add(scrollPane);
		
		table_5 = new JTable();
		scrollPane.setViewportView(table_5);
		//aa
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(534, 430, 111, 23);
		contentPane.add(btnSupprimer);
		
		JLabel label_1 = new JLabel("Mois");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_1.setBounds(481, 154, 65, 40);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("Jour");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_3.setBounds(363, 205, 65, 40);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Mois");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_4.setBounds(481, 205, 65, 40);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Année");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_5.setBounds(594, 205, 91, 40);
		contentPane.add(label_5);
		
		JLabel label_2 = new JLabel("Année");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_2.setBounds(594, 154, 91, 40);
		contentPane.add(label_2);
		
		JLabel label = new JLabel("Jour");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label.setBounds(363, 154, 65, 40);
		contentPane.add(label);
		
		Vector Jour=new Vector(); 
		for(int i=1;i<=31;i++) { Jour.add(""+i+""); };
		
		Vector Mois=new Vector(); 
		for(int i=1;i<=12;i++) { Mois.add(""+i+""); };
		
		Vector Anne=new Vector(); 
		for(int i=2000;i<=2020;i++) { Anne.add(""+i+""); };
		
		JComboBox comboBox_1 = new JComboBox(Jour);
		comboBox_1.setBounds(418, 165, 50, 29);
		contentPane.add(comboBox_1);
		
		JComboBox mois = new JComboBox(Mois);
		mois.setBounds(534, 165, 50, 29);
		contentPane.add(mois);
		
		JComboBox jour = new JComboBox(Jour);
		jour.setBounds(418, 216, 50, 29);
		contentPane.add(jour);
		
		JComboBox mois2 = new JComboBox(Mois);
		mois2.setBounds(534, 216, 50, 29);
		contentPane.add(mois2);
		
		JComboBox ann = new JComboBox(Anne);
		ann.setBounds(679, 165, 98, 29);
		contentPane.add(ann);
		
		JComboBox ann2 = new JComboBox(Anne);
		ann2.setBounds(679, 216, 98, 29);
		contentPane.add(ann2);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(img) );
		lblNewLabel_1.setBounds(0, 0, 974, 530);
		contentPane.add(lblNewLabel_1);
	}
}

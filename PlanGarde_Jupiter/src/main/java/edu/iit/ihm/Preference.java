package edu.iit.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Preference extends JDialog {

	private JLabel icon, MMLabel, JJLabel, AALabel, MMLabel1, JJLabel1,
			AALabel1;
	private JCheckBox lun, mar, mer, jeu, ven, sam, dim;
	private JComboBox JJ;
	private JTextField nom, Prenom;
	private JTable tab;
	private DefaultTableModel model;
	private JButton bQuiter = new JButton(" Quiter ");
	private JButton bAddP = new JButton(" Ajouter ");
	private JButton bConncet = new JButton(" Valider ");

	public Preference() {
		this.setTitle("Preference");
		this.setSize(1000, 450);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.initComponent();

	}

	private void initComponent() {

		class CustomMouseMotionListener implements MouseMotionListener {

			public void mouseDragged(MouseEvent e) {

			}

			public void mouseMoved(MouseEvent e) {

			}
		}

		JPanel panPlants = new JPanel();
		panPlants.setBackground(Color.white);
		panPlants.setPreferredSize(new Dimension(320, 250));

		panPlants.setBorder(BorderFactory
				.createTitledBorder(" Jours de Preferences :"));
		this.bAddP.setVisible(false);

		lun = new JCheckBox("  Lundi", false);
		mar = new JCheckBox("  Mardi", false);
		mer = new JCheckBox("  Mercredi", false);
		jeu = new JCheckBox("  Jeudi", false);
		ven = new JCheckBox("  Vendredi", false);
		sam = new JCheckBox("  Samedi", false);
		dim = new JCheckBox("  Dimanche", false);

		lun.setBackground(Color.white);
		mar.setBackground(Color.white);
		mer.setBackground(Color.white);
		jeu.setBackground(Color.white);
		ven.setBackground(Color.white);
		sam.setBackground(Color.white);
		dim.setBackground(Color.white);

		lun.setPreferredSize(new Dimension(200, 25));
		mar.setPreferredSize(new Dimension(200, 25));
		mer.setPreferredSize(new Dimension(200, 25));
		jeu.setPreferredSize(new Dimension(200, 25));
		ven.setPreferredSize(new Dimension(200, 25));
		sam.setPreferredSize(new Dimension(200, 25));
		dim.setPreferredSize(new Dimension(200, 25));

		panPlants.add(lun);
		panPlants.add(mar);
		panPlants.add(mer);
		panPlants.add(jeu);
		panPlants.add(ven);
		panPlants.add(sam);
		panPlants.add(dim);

		panPlants.addMouseMotionListener(new CustomMouseMotionListener());

		// Date de naisance
		JPanel panDateD = new JPanel();
		panDateD.setBackground(Color.white);
		panDateD.setPreferredSize(new Dimension(320, 70));
		panDateD.setBorder(BorderFactory.createTitledBorder("Nom de Docteur"));

		Vector Jour = new Vector();
		for (int i = 1; i <= 12; i++) {
			Jour.add("Doctor" + i + "");
		}
		;

		JJ = new JComboBox(Jour);
		JJLabel = new JLabel("Nom : ");
		panDateD.add(JJLabel);
		panDateD.add(JJ);

		bQuiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(EXIT_ON_CLOSE);
			}
		});

		bConncet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}

			public String getDoctor() {
				return JJ.getSelectedItem() + "";
			};
		});

		bAddP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(EXIT_ON_CLOSE);
			}
		});

	

		// Table
		tab = new JTable();
		JPanel panT = new JPanel();
		panT.setBackground(Color.white);
		panT.setPreferredSize(new Dimension(300, 350));
		panT.setBorder(BorderFactory.createTitledBorder("Tableau de Docteur "));
		try {


			model = new DefaultTableModel();
			model.addColumn("NomDocteur");
			model.addColumn("lun");
			model.addColumn("mar");
			model.addColumn("mer");
			model.addColumn("Jeu");
			model.addColumn("Ven");
			model.addColumn("Sam");
			model.addColumn("dim");
			
			
			Object[] data = {"Nom ","Lun","Mar","Mer","Jeu","Ven","Sam","Dim"};
			
			model.addRow(data);
			Object[] data1 = {"Mahmoud ","       X","","","       X","       X","","       X"};
			model.addRow(data1);
			
			Object[] data2 = {"Firas ","       X","","","","       X","       X","       X"};
			model.addRow(data2);
			
			Object[] data3 = {"Ismail ","       X","","","","","","       X"};
			model.addRow(data3);
			
			Object[] data4 = {"Wa7il ","       X","       X","       X","","","","       X"};
			model.addRow(data4);
			
			/*while (res.next()) {
				Object[] data = { res.getInt(1), res.getString(2),
						res.getString(3) };
				model.addRow(data);
			}
			*/
			tab.setModel(model);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"select \n ERROR " + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}

		// ajoute une barre de défilement à la table

		JScrollPane scroll = new JScrollPane(tab);
		this.add(scroll);

		panT.add(tab);

		JPanel panIcon = new JPanel();
		panIcon.setBackground(Color.white);
		panIcon.setLayout(new BorderLayout());
		panIcon.add(panT);
		
		
		
		JPanel content = new JPanel();
		content.setBackground(Color.white);
		content.setPreferredSize(new Dimension(380, 80));
		content.add(panDateD);
		content.add(panPlants);

		// content.add()
		JPanel control = new JPanel();
		control.setBackground(Color.white);
		control.add(bConncet);
		control.add(bQuiter);

		this.getContentPane().add(panIcon, BorderLayout.CENTER);
		this.getContentPane().add(content, BorderLayout.WEST);
		this.getContentPane().add(control, BorderLayout.SOUTH);

	}

}

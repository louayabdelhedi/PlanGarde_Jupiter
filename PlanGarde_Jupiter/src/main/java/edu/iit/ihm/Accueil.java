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
import javax.swing.JTextField;

public class Accueil extends JDialog {

	private JLabel icon, MMLabel, JJLabel, AALabel, MMLabel1, JJLabel1,
			AALabel1;
	private JCheckBox vacance, preferance;
	private JComboBox JJ, MM, AA, JJ1, MM1, AA1;
	private JTextField nom, Prenom;
	private JButton bQuiter = new JButton(" Quiter ");
	private JButton bAddV = new JButton(" Ajouter ");
	private JButton bAddP = new JButton(" Ajouter ");
	private JButton bConncet = new JButton(" Générer ");

	public Accueil() {
		this.setTitle("Accueil");
		this.setSize(1080, 450);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.initComponent();

	}

	private void initComponent() {

		class CustomMouseMotionListener implements MouseMotionListener {

			public void mouseDragged(MouseEvent e) {

			}

			public void mouseMoved(MouseEvent e) {
				if (vacance.isSelected()) {
					bAddV.setVisible(true);
					
				} else {
					bAddV.setVisible(false);

				}
				if (preferance.isSelected()) {
					bAddP.setVisible(true);
				} else {
					bAddP.setVisible(false);

				}
			}
		}

		JPanel panPlants = new JPanel();
		panPlants.setBackground(Color.white);
		panPlants.setPreferredSize(new Dimension(320, 100));
		nom = new JTextField();
		nom.setPreferredSize(new Dimension(100, 25));
		Prenom = new JTextField();
		Prenom.setPreferredSize(new Dimension(100, 25));
		panPlants.setBorder(BorderFactory
				.createTitledBorder(" Gérer les Plants Selon :"));
		this.bAddP.setVisible(false);
		
		this.bAddV.setVisible(false);
		vacance = new JCheckBox("  Vacances", true);
		vacance.setBackground(Color.white);
		vacance.setPreferredSize(new Dimension(200, 25));
		preferance = new JCheckBox("  Preferance", false);
		preferance.setBackground(Color.white);
		preferance.setPreferredSize(new Dimension(200, 25));

		panPlants.add(vacance);
		panPlants.add(bAddV);
		panPlants.add(preferance);
		panPlants.add(bAddP);
		panPlants.addMouseMotionListener(new CustomMouseMotionListener());

		// Date de naisance
		JPanel panDateD = new JPanel();
		panDateD.setBackground(Color.white);
		panDateD.setPreferredSize(new Dimension(320, 70));
		panDateD.setBorder(BorderFactory.createTitledBorder("Date Debut"));

		Vector Jour = new Vector();
		for (int i = 1; i <= 31; i++) {
			Jour.add("" + i + "");
		}
		;

		JJ = new JComboBox(Jour);
		JJLabel = new JLabel("JJ : ");
		panDateD.add(JJLabel);
		panDateD.add(JJ);

		Vector Mois = new Vector();
		for (int i = 1; i <= 12; i++) {
			Mois.add("" + i + "");
		}
		;

		MM = new JComboBox(Mois);
		MMLabel = new JLabel("MM : ");
		panDateD.add(MMLabel);
		panDateD.add(MM);

		Vector Anne = new Vector();
		for (int i = 2009; i <= 2015; i++) {
			Anne.add("" + i + "");
		}
		;

		AA = new JComboBox(Anne);
		AALabel = new JLabel("AA: ");
		panDateD.add(AALabel);
		panDateD.add(AA);

		// Date de naisance
		JPanel panDateF = new JPanel();
		panDateF.setBackground(Color.white);
		panDateF.setPreferredSize(new Dimension(320, 70));
		panDateF.setBorder(BorderFactory.createTitledBorder("Date Fin"));

		Vector Jour1 = new Vector();
		for (int i = 1; i <= 31; i++) {
			Jour1.add("" + i + "");
		}
		;

		JJ1 = new JComboBox(Jour1);
		JJLabel1 = new JLabel("JJ : ");
		panDateF.add(JJLabel1);
		panDateF.add(JJ1);

		Vector Mois1 = new Vector();
		for (int i = 1; i <= 12; i++) {
			Mois1.add("" + i + "");
		}
		;

		MM1 = new JComboBox(Mois);
		MMLabel1 = new JLabel("MM : ");
		panDateF.add(MMLabel1);
		panDateF.add(MM1);

		Vector Anne1 = new Vector();
		for (int i = 2009; i <= 2015; i++) {
			Anne1.add("" + i + "");
		}
		;

		AA1 = new JComboBox(Anne1);
		AALabel1 = new JLabel("AA: ");
		panDateF.add(AALabel1);
		panDateF.add(AA1);

		bQuiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(EXIT_ON_CLOSE);
			}
		});

		bConncet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (getAADateD() < getAA1DateD()) {
					System.out.println("-----ok--------");
				} else if (getAADateD() == getAA1DateD()) {
					if (getMMDateD() < getMM1DateD()) {
						System.out.println("-----ok--------");
					} else if (getMMDateD() == getMM1DateD()) {
						if (getJJDateD() <= getJJ1DateD()) {
							System.out.println("-----ok--------");
						}
						else{
							JOptionPane.showMessageDialog(null, "Verifier Les Jours");
						}
					}
					else{
						JOptionPane.showMessageDialog(null, "Verifier Les Mois ");
					}
				}else{
					JOptionPane.showMessageDialog(null, "Verifier Les AnneÃ©s");
				}
			}

			public int getJJDateD() {
				return Integer.parseInt(JJ.getSelectedItem() + "");
			};

			public int getMMDateD() {
				return Integer.parseInt(MM.getSelectedItem() + "");
			};

			public int getAADateD() {
				return Integer.parseInt(AA.getSelectedItem() + "");
			};

			public int getJJ1DateD() {
				return Integer.parseInt(JJ1.getSelectedItem() + "");
			};

			public int getMM1DateD() {
				return Integer.parseInt(MM1.getSelectedItem() + "");
			};

			public int getAA1DateD() {
				return Integer.parseInt(AA1.getSelectedItem() + "");
			};

			public String getDateD() {
				return JJ.getSelectedItem() + "/" + MM.getSelectedItem() + "/"
						+ AA1.getSelectedItem();
			};

			public String getDateF() {
				return JJ1.getSelectedItem() + "/" + MM1.getSelectedItem()
						+ "/" + AA1.getSelectedItem();
			};
		});

		bAddV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		bAddP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(EXIT_ON_CLOSE);
			}
		});

		icon = new JLabel(new ImageIcon("ressources/interface.jpg"));
		JPanel panIcon = new JPanel();
		panIcon.setBackground(Color.white);
		panIcon.setLayout(new BorderLayout());
		panIcon.add(icon);

		JPanel content = new JPanel();
		content.setBackground(Color.white);

		content.add(panPlants);
		content.add(panDateD);
		content.add(panDateF);
		// content.add()
		JPanel control = new JPanel();
		control.setBackground(Color.white);
		control.add(bConncet);
		control.add(bQuiter);

		this.getContentPane().add(panIcon, BorderLayout.WEST);
		this.getContentPane().add(content, BorderLayout.CENTER);
		this.getContentPane().add(control, BorderLayout.SOUTH);

	}

}

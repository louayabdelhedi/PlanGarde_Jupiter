package edu.iit.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JDialog {

	private JLabel nomLabel, pwdLabel,icon;
	static Login fenLogin;
	private JTextField nom, Prenom;
	private JButton bQuiter = new JButton(" Quiter ");
	private JButton bConncet = new JButton(" Connect ");
	public static Accueil accueil;
	public Login() {
		this.setTitle("Login");
		this.setSize(790, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		this.initComponent();

	}

	private void initComponent() {
		JPanel panNom = new JPanel();
		panNom.setBackground(Color.white);
		panNom.setPreferredSize(new Dimension(280, 100));
		nom = new JTextField();
		nom.setPreferredSize(new Dimension(100, 25));
		Prenom = new JPasswordField();
		Prenom.setPreferredSize(new Dimension(100, 25));
		panNom.setBorder(BorderFactory.createTitledBorder(" Login "));
		nomLabel = new JLabel("     Login :            ");
		pwdLabel = new JLabel("Mot de passe :  ");

		panNom.add(nomLabel);
		panNom.add(nom);
		panNom.add(pwdLabel);
		panNom.add(Prenom);

		bQuiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(EXIT_ON_CLOSE);
			}
		});

		bConncet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((nom.getText().equalsIgnoreCase("admin"))&&(Prenom.getText().equalsIgnoreCase("admin"))){
				accueil = new Accueil();
				fenLogin.setVisible(false);
				accueil.setVisible(true);
				
			}}
		});
		
		icon = new JLabel(new ImageIcon("ressources/login.jpg"));
		JPanel panIcon = new JPanel();
		panIcon.setBackground(Color.white);
		panIcon.setLayout(new BorderLayout());
		panIcon.add(icon);
		
		

		JPanel content = new JPanel();
		content.setBackground(Color.white);
		content.add(panNom);

		JPanel control = new JPanel();
		control.setBackground(Color.white);
		control.add(bConncet);
		control.add(bQuiter);

		this.getContentPane().add(panIcon, BorderLayout.WEST);
		this.getContentPane().add(content, BorderLayout.CENTER);
		this.getContentPane().add(control, BorderLayout.SOUTH);

	}

	public static void main(String[] main) {
		fenLogin = new Login();
		
		fenLogin.setVisible(true);

	}

}
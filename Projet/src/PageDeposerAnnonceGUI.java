import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

import javax.swing.*;

public class PageDeposerAnnonceGUI extends JFrame {
	
	protected Club leClub;
	
	private JPanel container = new JPanel();
	
	private JLabel lTitre = new JLabel("Titre :");
	private JLabel lDescription = new JLabel("Description :");
	private JLabel lPrix = new JLabel("Prix :");
	private JLabel lPhoto = new JLabel("Photo :");
	
	protected JTextField tTitre = new JTextField(15);
	protected JTextField tPrix = new JTextField(6);
	
	private JButton b1 = new JButton("Annuler");
	private JButton b2 = new JButton("Déposer");
	
	
	// Constructor

	public PageDeposerAnnonceGUI(Club c) {
		leClub = c;
		this.setSize(250, 200);  //size de la fenetre
		this.setTitle("Connexion"); //titre de la fenetre
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.AjoutElements(); //ajouter les elements qui sont dans la fonction
		this.setContentPane(container);
		this.setVisible(true);
	}
	
	// Getters and Setters
	
	public Club getLeClub() {
		return leClub;
	}

	public void setLeClub(Club leClub) {
		this.leClub = leClub;
	}

	
	// Methods
	
	private void AjoutElements() {
		
		container.setBackground(Color.GRAY);
	    container.setLayout(new GridLayout(4, 2, 5, 5));
	    
		lLogin.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lLogin);
		container.add(tLogin);
		
		lPassword.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lPassword);
		container.add(tPassword);
		
		b1.addActionListener(new b1Listener());
		container.add(b1);  
		
	    b2.addActionListener(new b2Listener());
		container.add(b2);
		
		
		lCreation.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(lCreation);
		b3.addActionListener(new b3Listener());
		container.add(b3);
	}
	
	//Classes ecoutant les Boutons	  
	public class b1Listener implements ActionListener { 		// b1 bouton annuler
		public void actionPerformed(ActionEvent e1) {
			if((JButton)e1.getSource()==b1) {
				setVisible(false);
			}
		}
	}
	  
	public class b2Listener implements ActionListener {			// b2 bouton connexion
		public void actionPerformed(ActionEvent e2) {
			if((JButton)e2.getSource()==b2) {
				
			}
		}  
	}
	
	public class b3Listener implements ActionListener {			// b2 bouton creation
		public void actionPerformed(ActionEvent e3) {
			if((JButton)e3.getSource()==b3) {
				
			}
		}  
	}
	
}



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

<<<<<<< HEAD
public class PageNonConnecterGUI extends JFrame implements ActionListener {
	
=======
public class PageNonConnecterGUI extends JFrame {
>>>>>>> origin/master
	
	private JPanel container = new JPanel();

	private JPanel panBouton = new JPanel();
	private JButton bouton_connexion = new JButton("Connexion");
	private JButton bouton_recherche = new JButton("Recherche");
	
	private JTextField tRecherche = new JTextField(30); //champ de recherche
	
	private JPanel panListeAnnonces = new JPanel();
	private DefaultListModel liste_des_annonces = new DefaultListModel();
	private JList listeAnnonces = new JList(liste_des_annonces);
	
	
	public PageNonConnecterGUI() {
		
		this.setSize(540, 500); 												//size de la fenetre
		this.setTitle("Application de partage sur le campus"); 					//titre de la fenetre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.AjoutElements(); 													//ajouter les elements qui sont dans la fonction
		this.setContentPane(container);
		this.setVisible(true);
	}

	private void AjoutElements() {
		
		// Creation des boutons
		bouton_recherche.setPreferredSize(new Dimension(200, 40)); 							//dimension du bouton1
		bouton_recherche.addActionListener(this);
		bouton_recherche.setActionCommand("Rechercher");
		
		bouton_connexion.setPreferredSize(new Dimension(200, 40)); 							//dimension du bouton2    
		bouton_connexion.addActionListener(this);
		bouton_connexion.setActionCommand("Connexion");
		

		panBouton.setLayout(new GridLayout(1, 2));
		panBouton.setBorder(new LineBorder(new Color(0, 0, 0)));
		panBouton.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panBouton.setPreferredSize(new Dimension(520,50)); 						//size du panneau
		panBouton.setBackground(Color.RED); 									//couleur fond panneau bouton
		panBouton.add(bouton_recherche);
		panBouton.add(tRecherche); //Champ de recherche
		panBouton.add(bouton_connexion);
	    
		
		
		// Affichage des annonces
	    listeAnnonces.setBackground(Color.WHITE);								//couleur du fond de la liste
	    listeAnnonces.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);	//selection que d'une seule ligne possible
	    listeAnnonces.setSize(400, 300); 										//size de la liste
	    listeAnnonces.addListSelectionListener(new listeAnnonceListener());
	    listeAnnonces.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
	    panListeAnnonces.setBorder(new LineBorder(new Color(0, 0, 0)));
	    panListeAnnonces.setPreferredSize(new Dimension(520,410)); 				//size du panneau
	    panListeAnnonces.add(listeAnnonces);
	    
	   		

		//ajout tous les elements dans la fenetre
		//container.setLayout(new GridLayout(2, 1));
		container.add(panBouton);
		container.add(panListeAnnonces);
		
	}
	
	
	// Classes Listener
	public class bouton_rechercheListener implements ActionListener { 						//Bouton recherche
		public void actionPerformed(ActionEvent e1) {

		}
	}
	
	public class bouton_connexionListener implements ActionListener { 						//Bouton connexion
		public void actionPerformed(ActionEvent e2) {

		}
	}

	public class listeAnnonceListener implements ListSelectionListener {		//Liste des annonces
		public void valueChanged(ListSelectionEvent l1) {
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getActionCommand().equals("bouton_connexion")){
			PageConnexionGUI pc = new PageConnexionGUI(); 
		}
		
		if(event.getActionCommand().equals("bouton_recherche")){
			//r�cup�rer les valeurs du champ 
		}
	}

}
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;

public class PageMonCompteGUI extends JFrame {
	public String resultatSeance;
	private JPanel container = new JPanel();
	String[] tab = {"S�lectionner", "V�lo", "Natation", "Course � pied"};
	private JComboBox jDiscipline = new JComboBox(tab);
	private JLabel lDiscipline = new JLabel("Discipline :");
	private JLabel lDate = new JLabel("Date :");
	protected JTextField tDate = new JTextField("ann�e, mois-1, jour",10);
	private JLabel lDuree = new JLabel("Dur�e :");
	protected JTextField tDuree = new JTextField(10);
	private JLabel lDistance = new JLabel("Distance :");
	protected JTextField tDistance = new JTextField(10);
	private JLabel lDenivele = new JLabel("D�nivel� positif :");
	protected JTextField tDenivele = new JTextField(10);
	private JLabel lTypeNage = new JLabel("Type de nage :");
	protected JTextField tTypeNage = new JTextField(10);
	private JLabel lTypeTerrain = new JLabel("Type de terrain :");
	protected JTextField tTypeTerrain = new JTextField(10);
	private JLabel lMeteo = new JLabel("M�t�o :");
	protected JTextField tMeteo = new JTextField(10);
	private JButton b1 = new JButton("Annuler");
	private JButton b2 = new JButton("Ajouter");
	protected Club leClub;
	 
	
	// Constructor
	
	public PageMonCompteGUI(Club c) {
		leClub = c;
		this.setSize(300, 400);  //size de la fenetre
		this.setTitle("Ajouter une s�ance"); //titre de la fenetre
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

	
	private void AjoutElements() {
		
		container.setBackground(Color.LIGHT_GRAY);
	    container.setLayout(new GridLayout(9, 2, 5, 5));     
	    
		container.add(lDiscipline);
		container.add(jDiscipline);
		jDiscipline.addActionListener(new jDisciplineListener()); 
		
		container.add(lDate);
		container.add(tDate);
		tDate.enable(false);
		tDate.setBackground(Color.LIGHT_GRAY);
		tDate.addMouseListener(new Mouse1Listener());
		
		container.add(lDuree);
		container.add(tDuree);
		tDuree.enable(false);
		tDuree.setBackground(Color.LIGHT_GRAY);
		
		container.add(lDistance);
		container.add(tDistance);
		tDistance.enable(false);
		tDistance.setBackground(Color.LIGHT_GRAY);
		
		container.add(lDenivele);
		container.add(tDenivele);
		tDenivele.enable(false);
		tDenivele.setBackground(Color.LIGHT_GRAY);
		
		container.add(lTypeNage);
		container.add(tTypeNage);
		tTypeNage.enable(false);
		tTypeNage.setBackground(Color.LIGHT_GRAY);
		
		container.add(lTypeTerrain);
		container.add(tTypeTerrain);
		tTypeTerrain.enable(false);
		tTypeTerrain.setBackground(Color.LIGHT_GRAY);
		
		container.add(lMeteo);
		container.add(tMeteo);
		tMeteo.enable(false);
		tMeteo.setBackground(Color.LIGHT_GRAY);
		
		container.add(b1);
		container.add(b2);
		b1.addActionListener(new b1Listener());     
	    b2.addActionListener(new b2Listener());
	    
	}

	
	//Classes �coutant la ComboBox et les boutons
	public class jDisciplineListener implements ActionListener {
		public void actionPerformed(ActionEvent e1) {
			String result = (String) jDiscipline.getSelectedItem();
			resultatSeance = result;
			//System.out.println("choix : " + result);
			if(result == "V�lo"){
				tDate.enable(true);
				tDate.setBackground(Color.WHITE);
				tDuree.enable(true);
				tDuree.setBackground(Color.WHITE);
				tDistance.enable(true);
				tDistance.setBackground(Color.WHITE);
				tDenivele.enable(true);
				tDenivele.setBackground(Color.WHITE);
				tTypeNage.enable(false);
				tTypeNage.setBackground(Color.LIGHT_GRAY);
				tTypeTerrain.enable(false);
				tTypeTerrain.setBackground(Color.LIGHT_GRAY);
				tMeteo.enable(false);
				tMeteo.setBackground(Color.LIGHT_GRAY);
			}
			
			else if(result == "Natation"){
				tDate.enable(true);
				tDate.setBackground(Color.WHITE);
				tDuree.enable(true);
				tDuree.setBackground(Color.WHITE);
				tDistance.enable(true);
				tDistance.setBackground(Color.WHITE);
				tDenivele.enable(false);
				tDenivele.setBackground(Color.LIGHT_GRAY);
				tTypeNage.enable(true);
				tTypeNage.setBackground(Color.WHITE);
				tTypeTerrain.enable(false);
				tTypeTerrain.setBackground(Color.LIGHT_GRAY);
				tMeteo.enable(false);
				tMeteo.setBackground(Color.LIGHT_GRAY);
			}
			
			else if(result == "Course � pied"){
				tDate.enable(true);
				tDate.setBackground(Color.WHITE);
				tDuree.enable(true);
				tDuree.setBackground(Color.WHITE);
				tDistance.enable(true);
				tDistance.setBackground(Color.WHITE);
				tDenivele.enable(false);
				tDenivele.setBackground(Color.LIGHT_GRAY);
				tTypeNage.enable(false);
				tTypeNage.setBackground(Color.LIGHT_GRAY);
				tTypeTerrain.enable(true);
				tTypeTerrain.setBackground(Color.WHITE);
				tMeteo.enable(true);
				tMeteo.setBackground(Color.WHITE);
			}
			
			else {
				tDate.enable(false);
				tDate.setBackground(Color.LIGHT_GRAY);
				tDuree.enable(false);
				tDuree.setBackground(Color.LIGHT_GRAY);
				tDistance.enable(false);
				tDistance.setBackground(Color.LIGHT_GRAY);
				tDenivele.enable(false);
				tDenivele.setBackground(Color.LIGHT_GRAY);
				tTypeNage.enable(false);
				tTypeNage.setBackground(Color.LIGHT_GRAY);
				tTypeTerrain.enable(false);
				tTypeTerrain.setBackground(Color.LIGHT_GRAY);
				tMeteo.enable(false);
				tMeteo.setBackground(Color.LIGHT_GRAY);
			}
		}
	}
	
	public class b1Listener implements ActionListener {		//bouton annuler
		public void actionPerformed(ActionEvent e1) {
			if((JButton)e1.getSource()==b1) {
				setVisible(false);
			}
		}
	}
	  
	public class b2Listener implements ActionListener {		//bouton ajouter
		public void actionPerformed(ActionEvent e2) {
			if((JButton)e2.getSource()==b2) {
				
				if(resultatSeance == "V�lo"){

					GregorianCalendar dDateVelo = new GregorianCalendar(2015, 2, 15);
					int iDureeVelo = Integer.parseInt(tDuree.getText());
					int iDistanceVelo = Integer.parseInt(tDistance.getText());
					float fDenivele = Float.parseFloat(tDistance.getText());
					
					Velo v1 = new Velo(dDateVelo, iDureeVelo, iDistanceVelo, fDenivele);
					
					leClub.generateOfficialTrainingEvent(v1);
					leClub.getAgenda().addNewTraining(v1);
					leClub.getGuiClub().liste_des_seances_Prevu.addElement(v1.toString2());
					
					setVisible(false);
				}
				
				
				else if(resultatSeance == "Natation"){
					
					GregorianCalendar dDateNat = new GregorianCalendar(2015, 2, 15);
					int iDureeNat = Integer.parseInt(tDuree.getText());
					int iDistanceNat = Integer.parseInt(tDistance.getText());
					
					Natation n1 = new Natation(dDateNat,iDureeNat,iDistanceNat,tTypeNage.getText()); 
					
					leClub.generateOfficialTrainingEvent(n1);
					leClub.getAgenda().addNewTraining(n1);
					leClub.getGuiClub().liste_des_seances_Prevu.addElement(n1.toString2());
					
					setVisible(false);
				}
				
				
				else if(resultatSeance == "Course � pied"){
					
					GregorianCalendar dDateCap = new GregorianCalendar(2015, 2, 15);
					int iDureeCap = Integer.parseInt(tDuree.getText());
					int iDistanceCap = Integer.parseInt(tDistance.getText());
					
					CourseAPied cap1 = new CourseAPied(dDateCap,iDureeCap,iDistanceCap,tTypeTerrain.getText(),tMeteo.getText());
					
					leClub.generateOfficialTrainingEvent(cap1);
					leClub.getAgenda().addNewTraining(cap1);
					leClub.getGuiClub().liste_des_seances_Prevu.addElement(cap1.toString2());
					
					setVisible(false);
				}
			
			}
		}  
	}
	
	public class Mouse1Listener implements MouseListener {
		public void mouseClicked(MouseEvent m1) {
			tDate.setText("");
		}

		public void mouseEntered(MouseEvent m2) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent m3) {
			// TODO Auto-generated method stub
			
		}

		public void mousePressed(MouseEvent m4) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent m5) {
			// TODO Auto-generated method stub
			
		}  
	}
}

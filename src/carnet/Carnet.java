package carnet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import entree.*;

public class Carnet {
	private List<Entree> entrees;
	private List<Entree> selectionnees;
	
	public List<Entree> getEntrees() {
		return entrees;
	}
	public Carnet() {
		super();
		this.entrees = new ArrayList<Entree>();
		this.selectionnees  = new ArrayList<Entree>();
	}
	public void setEntrees( List<Entree> entrees) {
		this.entrees = entrees;
	}
	public 	List<Entree> getSelectionnees() {
		return selectionnees;
	}
	public void setSelectionnees( List<Entree> selectionnees) {
		this.selectionnees = selectionnees;
	}
	public void lectureFichier(String FILENAME) {
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
			String sCurrentLine ="";
			//FORMAT : ID;TYPE;CHAMP1;CHAMP2;CHAMP3
			while ((sCurrentLine = br.readLine()) != null) {

				//System.out.println(sCurrentLine);
					String[] lines = sCurrentLine.split(";");

					switch (lines[1]) {
					case "SOCIETE":
						entrees.add(Integer.parseInt(lines[0]),new Societe(lines[2]));
						break;

					case "PERSONNE":
						Personne tmpPers ;
						switch (lines[5]) {
						case "":
							 tmpPers =null;
							break;
						default:
							 tmpPers = (Personne) entrees.get(Integer.parseInt(lines[5]));
							break;
						}
						Societe tmpSoc = (Societe) entrees.get(Integer.parseInt(lines[6]));
						String[] prenoms = lines[2].split(",");
						for (String prenom : prenoms) {
						//	System.out.println(prenom);
						}
						Genre genre;
						if (lines[4].equalsIgnoreCase("H")) {
							genre=Genre.HOMME;
						}else{
							genre=Genre.FEMME;

						}
						entrees.add(Integer.parseInt(lines[0]),new Personne(lines[3], prenoms, genre, tmpPers, tmpSoc, lines[7]));
						break;
					}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void affichageCommun(List<Entree> entreesTMP, Ordre ordre, Presentation presentation, Sens sens) {
		System.out.println("Affichage : ");
		List<Entree> Sortedentrees=entreesTMP;

		if (ordre==Ordre.CROISSANT) {
			Collections.sort(Sortedentrees, new Comparator<Entree>(){
		        @Override
		        public int compare(Entree entree1, Entree entree2)
		        {

		            return  getPersonneOUSocieteNom(entree1).compareTo(getPersonneOUSocieteNom(entree2));
		        }

		    });
		}else{
			Collections.sort(Sortedentrees, new Comparator<Entree>(){
		        @Override
		        public int compare(Entree entree2, Entree entree1)
		        {

		            return  getPersonneOUSocieteNom(entree1).compareTo(getPersonneOUSocieteNom(entree2));
		        }

		    });
		}
		for (int i = 0; i < Sortedentrees.size(); i++) {
			Entree entree = Sortedentrees.get(i);
			if (entree instanceof Personne) {
				System.out.println(entree.toString(presentation,sens));
			}else{
				System.out.println("-Societé : "+entree.toString());

			}
		}
	}
	
	public String getPersonneOUSocieteNom(Entree entree) {
		if (entree instanceof Personne) {
			return ((Personne) entree).getNom();
		}
		return ((Societe) entree).toString();
	}
	

	public void affichage(Ordre ordre, Presentation presentation, Sens sens) {
	 affichageCommun(getEntrees(), ordre, presentation, sens);
	}
	public void affichageSelection(Ordre ordre, Presentation presentation, Sens sens) {
		 affichageCommun(getSelectionnees(), ordre, presentation, sens);
		}

		
		
	
	 public void ajouterEntrée(Entree entree){
		 if (!getEntrees().contains(entree)) {
			 getEntrees().add(entree);

		}
	 }
	 /*+ 
+ recherche(String): Entree[]*/
	 
	public Entree recherche(String tofind){
		 Entree tmpEntree;
		for (int i = 0; i < getEntrees().size(); i++) {
			 tmpEntree= compareEntrees(tofind, getEntrees().get(i));

			if (tmpEntree!=null) {
				return tmpEntree;
			}
		}
 		System.out.println(tofind+" Non Trouvée !");
		return null;
	 }
	 
     public Entree compareEntrees(String tofind, Entree entree)
     {
     	if (getPersonneOUSocieteNom(entree).compareTo(tofind)==0) {
     		System.out.println(tofind+" Trouvée !");
				return entree;
			}else{
				return  null;
			}
     }
	 public void selection(Entree toadd){
		 if (!getEntrees().contains(toadd)) {
			 ajouterEntrée(toadd);
			 getSelectionnees().add(toadd);

		}
	 }

	 public void selection(String toadd){
		 Entree toaddentree = recherche(toadd);
		 
		 if (toaddentree != null) {
			 selection(toaddentree);
			 
		 }
	 }
	 
	 public void selection(List<Entree>  toaddArray){
		 for( Entree entree : toaddArray){
			 selection(entree);
		 }
	 
	 }
	 
	 public void deselection(){
		 getSelectionnees().clear();
	 }
	 
		
	
}

	


package test;
import java.util.ArrayList;
import java.util.List;

import carnet.*;
import entree.*;

public class TestLecture {

	public static void main(String[] args) {
		Carnet carnet = new Carnet();
		carnet.lectureFichier("C:\\Users\\user\\Downloads\\filename.txt");
		//Test Ajouter entree
		Societe societe = new Societe("TEST TEST AJOUT SOCIETE");
		String prenoms[]= new String[3];
		prenoms[0]="Jhone";
		prenoms[1]="Deuxieme";
		prenoms[2]="Troisieme";
		Personne personne = new Personne("AJOUT PERS", prenoms, Genre.HOMME, null, societe, "Directeur");
		
		//carnet.selection(personne);
		//carnet.selection(societe);

		//carnet.affichage(Ordre.DECROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);
		//carnet.affichageSelection(Ordre.DECROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);
		
		
		List<Entree>  tmpArray = new ArrayList<Entree>();
			tmpArray.add(personne);
			tmpArray.add(societe);
			carnet.selection(tmpArray);
			carnet.selection(tmpArray);
		//carnet.deselection();
		carnet.selection("Dumbledore");
		
		carnet.affichageSelection(Ordre.DECROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);
		//carnet.affichage(Ordre.DECROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);

	}
	

}

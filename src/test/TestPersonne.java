package test;

import entree.*;

public class TestPersonne {

	public static void main(String[] args) {
		Societe societe = new Societe("Ecole de sorcellerie Poudlard");
		String prenoms[]= new String[3];
		prenoms[0]="Jhone";
		prenoms[1]="Deuxieme";
		prenoms[2]="Troisieme";
		Personne personne = new Personne("Doe", prenoms, Genre.HOMME, null, societe, "Directeur", Sens.PRENOMS_NOM, Presentation.COMPLET);
		
		System.out.println(personne.toString());
	}

}

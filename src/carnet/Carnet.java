package carnet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import entree.*;

public class Carnet {
	private Entree entrees[];
    private Entree selectionnees[];
	public Entree[] getEntrees() {
		return entrees;
	}
	public Carnet() {
		super();
		this.entrees = new Entree[10];
		this.selectionnees = new Entree[10];
	}
	public void setEntrees(Entree[] entrees) {
		this.entrees = entrees;
	}
	public Entree[] getSelectionnees() {
		return selectionnees;
	}
	public void setSelectionnees(Entree[] selectionnees) {
		this.selectionnees = selectionnees;
	}
	public void lectureFichier(String FILENAME) {
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
			String sCurrentLine ="";
			//FORMAT : ID;TYPE;CHAMP1;CHAMP2;CHAMP3

			while ((sCurrentLine = br.readLine()) != null) {
				//	System.out.println(sCurrentLine);
					String[] lines = sCurrentLine.split(";");
					switch (lines[1]) {
					case "SOCIETE":
						entrees[1]= new Societe(lines[2]);
						break;

					case "PERSONNE":
						String[] prenoms = lines[2].split(",");
						for (String prenom : prenoms) {
						//	System.out.println(prenom);
						}
						//Id personnes ??
						//Tableau de type ?
						Genre genre;
						if (lines[4].equalsIgnoreCase("H")) {
							genre=Genre.HOMME;
						}else{
							genre=Genre.FEMME;

						}
						entrees[0] = new Personne(lines[3], prenoms, genre, /*lines[5]*/null, new Societe(lines[6]), lines[7]);
						break;
					}

			}
			
			
			
			


		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public String toString() {
		//return "Carnet [entrees=" + Arrays.toString(entrees) + ", selectionnees=" + Arrays.toString(selectionnees)
		//		+ "]";
		
	return "Carnet [entrees=" + Arrays.toString(entrees)+ "]";
	}
	
}

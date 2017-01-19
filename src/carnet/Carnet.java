package carnet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entree.*;

public class Carnet {
	private Entree entrees[];
    private Entree selectionnees[];
	public Entree[] getEntrees() {
		return entrees;
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
					System.out.println(sCurrentLine);
					String[] lines = sCurrentLine.split(";");
					switch (lines[1]) {
					case "SOCIETE":
						break;

					case "PERSONNE":
						String[] prenoms = lines[2].split(",");
						for (String prenom : prenoms) {
							System.out.println(prenom);
						}
						break;
					}

			}
			


		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}

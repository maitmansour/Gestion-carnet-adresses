package test;
import carnet.*;
import entree.*;

public class TestLecture {

	public static void main(String[] args) {
		Carnet carnet = new Carnet();
		carnet.lectureFichier("C:\\Users\\user\\Downloads\\filename.txt");
		carnet.affichage(Ordre.DECROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);
		//carnet.affichageSelection(Ordre.DECROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);

	}
	

}

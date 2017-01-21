package test;
import carnet.*;
public class TestLecture {

	public static void main(String[] args) {
		Carnet carnet = new Carnet();
		//C:\Users\NUMIDEA\Desktop\filename.txt
		carnet.lectureFichier("C:\\Users\\NUMIDEA\\Desktop\\filename.txt");
		carnet.affichage(Ordre.DECROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);
	}
	

}
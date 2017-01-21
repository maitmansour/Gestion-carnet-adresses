	package test;

	import java.io.IOException;
import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.GOTO;

import carnet.Carnet;
	import carnet.Ordre;
	import entree.Entree;
	import entree.Genre;
	import entree.Personne;
	import entree.Presentation;
	import entree.Sens;
	import entree.Societe;

	public class TestTout {
		
		@SuppressWarnings("resource")
		public static void main(String[] args) {
					select();

		}
		
			
		

		public static void showmenu() throws InterruptedException, IOException{
			for (int i = 0; i < 56; i++) {
				Thread.sleep(20);
				System.out.print("=");
			}
			System.out.println("");
			System.out.println("Menu d'opérations possible pour Gestion Carnet Adresses");
			for (int i = 0; i < 56; i++) {
				Thread.sleep(20);
				System.out.print("=");
			}			
			System.out.println("");
			Thread.sleep(200);
			System.out.println("1.Insertion (MENU)");
			Thread.sleep(200);
			System.out.println("2.Selectionnement (MENU)");
			Thread.sleep(200);
			System.out.println("3.DeSelectionnement - IRREVERSIBLE");
			Thread.sleep(200);
			System.out.println("4.Recherche");
			Thread.sleep(200);
			System.out.println("5.Affichage (MENU)");
			Thread.sleep(200);
			System.out.println("6.Sortir");
			}



		public static void Insertionmenu(){
			System.out.println("=======================================================");
			System.out.println("Menu d'insertions possible pour Gestion Carnet Adresses");
			System.out.println("=======================================================");
			System.out.println("7.Insertion Par fichier");
			System.out.println("8.Insertion par informations (Entree)");
			System.out.println("9.Insertion par Tableau d'informations");
			System.out.println("10.Retour");
			}


		public static void Selectionnementmenu(){
			System.out.println("=============================================================");
			System.out.println("Menu de selectionnement possible pour Gestion Carnet Adresses");
			System.out.println("=============================================================");
			System.out.println("11.Selectionner Par Nom");
			System.out.println("12.Selectionner par informations (Entree)");
			System.out.println("13.Selectionner par Tableau d'informations");
			System.out.println("14.Retour");
		}


		public static void Affichagemenu(){
			System.out.println("=======================================================");
			System.out.println("Menu d'Affichages possible pour Gestion Carnet Adresses");
			System.out.println("=======================================================");
			System.out.println("Veuillez ecrire le nombre correspondant a votre affichage souhaiter (EX : 	SELECTIONNES(2) DECROISSANT(2) SIMPLE(3) NOM_PRENOMS(2) : 2232");
			System.out.println("Affichage    :  -1: Carnet  -2: Selectionnees");
			System.out.println("ORDRE	     :  -1: CROISSANT  -2: DECROISSANT");
			System.out.println("PRESENTATION :  -1: COMPLET  -2: ABREGE -3: SIMPLE");
			System.out.println("SENS 		 :  -1: PRENOMS_NOM  -2: NOM_PRENOMS");
			System.out.println("15.Retour");
	}





		public static void select(){

			Carnet carnet = new Carnet();
			int nb,val, pos, ch,yes=0;
			String tofind;

			Scanner sc=new Scanner(System.in);
			try{
				while(yes==0){
					showmenu();

					System.out.println("\n \n \n \n");
					System.out.print("Entrer votre choix :");
					ch=sc.nextInt();

					switch(ch){
						case 1:
						Insertionmenu();
						ch=sc.nextInt();
								switch (ch) {
								case 7:
									System.out.println("Inserez le lien de fichier exemple ANTISLASH DOUBLEMENT ECRITE ! : C:\\Users\\NUMIDEA\\Desktop\\filename.txt");
									tofind = sc.next();
									carnet.lectureFichier(tofind);
									break;
									case 8:
									System.out.println("Inserez les informations : \n -Personne : ID;PERSONNE;PRENOMS;NOM;GENRE;ID_CONJOINT;ID_SOCIETE;FONCTION \n -Societe : ID;SOCIETE;RAISON_SOCIALE");
									tofind = sc.next();
									carnet.ajouterEntree(tofind);
									break;
									case 9:
									System.out.println("Combien d'information souhaitez vous insérer ?");
									System.out.println("Inserez les informations : \n -Personne : ID;PERSONNE;PRENOMS;NOM;GENRE;ID_CONJOINT;ID_SOCIETE;FONCTION \n -Societe : ID;SOCIETE;RAISON_SOCIALE");
									nb = sc.nextInt();
										for (int i=1;i<=nb ; i++) {
											System.out.println("Inserez la : "+i+" information ");
											tofind = sc.next();
											carnet.ajouterEntree(tofind);
										}
									break;
								}
						break;
						case 2:
						Selectionnementmenu();
						ch=sc.nextInt();
								switch (ch) {
								case 11:
									System.out.println("Entrer le nom : ");
									tofind = sc.next();
									carnet.selection(tofind);
									break;
									case 12:
									System.out.println("Pour selectionner par informations d'entrees, veuillez inserer les informations : \n -Personne : ID;PERSONNE;PRENOMS;NOM;GENRE;ID_CONJOINT;ID_SOCIETE;FONCTION \n -Societe : ID;SOCIETE;RAISON_SOCIALE");
									tofind = sc.next();
									//TO DO LATER...	
									carnet.selection(tofind);
									break;
									case 13:
									System.out.println("Pour selectionner par informations d'entrees, veuillez inserer les informations : \n -Personne : ID;PERSONNE;PRENOMS;NOM;GENRE;ID_CONJOINT;ID_SOCIETE;FONCTION \n -Societe : ID;SOCIETE;RAISON_SOCIALE");
									tofind = sc.next();
									//TO DO LATER...	
									carnet.selection(tofind);
									break;
								}

						break;
						case 3:
						carnet.deselection();
						break;
						case 4:
						System.out.println("quelle valeur cherchez vous ?");
						tofind = sc.next();
						carnet.recherche(tofind);
						break;
						case 5:
						Affichagemenu();
						ch=sc.nextInt();
								switch (ch) {
									case 1111:
										carnet.affichage(Ordre.CROISSANT, Presentation.COMPLET, Sens.PRENOMS_NOM);
									break;
									case 1112:
										carnet.affichage(Ordre.CROISSANT, Presentation.COMPLET, Sens.NOM_PRENOMS);
									break;
									case 1121:
										carnet.affichage(Ordre.CROISSANT, Presentation.ABREGE, Sens.PRENOMS_NOM);
	
									break;
									case 1122:
										carnet.affichage(Ordre.CROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);
	
									break;
									case 1131:
										carnet.affichage(Ordre.CROISSANT, Presentation.SIMPLE, Sens.PRENOMS_NOM);
									break;
									case 1132:
										carnet.affichage(Ordre.CROISSANT, Presentation.SIMPLE, Sens.NOM_PRENOMS);
									break;	
									case 1211:
										carnet.affichage(Ordre.DECROISSANT, Presentation.COMPLET, Sens.PRENOMS_NOM);
									break;
									case 1212:
										carnet.affichage(Ordre.DECROISSANT, Presentation.COMPLET, Sens.NOM_PRENOMS);
									break;
									case 1221:
										carnet.affichage(Ordre.DECROISSANT, Presentation.ABREGE, Sens.PRENOMS_NOM);
	
									break;
									case 1222:
										carnet.affichage(Ordre.DECROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);
	
									break;
									case 1231:
										carnet.affichage(Ordre.DECROISSANT, Presentation.SIMPLE, Sens.PRENOMS_NOM);
									break;
									case 1232:
										carnet.affichage(Ordre.DECROISSANT, Presentation.SIMPLE, Sens.NOM_PRENOMS);
									break;	
									case 2111:
										carnet.affichageSelection(Ordre.CROISSANT, Presentation.COMPLET, Sens.PRENOMS_NOM);
									break;
									case 2112:
										carnet.affichageSelection(Ordre.CROISSANT, Presentation.COMPLET, Sens.NOM_PRENOMS);
									break;
									case 2121:
										carnet.affichageSelection(Ordre.CROISSANT, Presentation.ABREGE, Sens.PRENOMS_NOM);
	
									break;
									case 2122:
										carnet.affichageSelection(Ordre.CROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);
	
									break;
									case 2131:
										carnet.affichageSelection(Ordre.CROISSANT, Presentation.SIMPLE, Sens.PRENOMS_NOM);
									break;
									case 2132:
										carnet.affichageSelection(Ordre.CROISSANT, Presentation.SIMPLE, Sens.NOM_PRENOMS);
									break;	
									case 2211:
										carnet.affichageSelection(Ordre.DECROISSANT, Presentation.COMPLET, Sens.PRENOMS_NOM);
									break;
									case 2212:
										carnet.affichageSelection(Ordre.DECROISSANT, Presentation.COMPLET, Sens.NOM_PRENOMS);
									break;
									case 2221:
										carnet.affichageSelection(Ordre.DECROISSANT, Presentation.ABREGE, Sens.PRENOMS_NOM);
	
									break;
									case 2222:
										carnet.affichageSelection(Ordre.DECROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);
	
									break;
									case 2231:
										carnet.affichageSelection(Ordre.DECROISSANT, Presentation.SIMPLE, Sens.PRENOMS_NOM);
									break;
									case 2232:
										carnet.affichageSelection(Ordre.DECROISSANT, Presentation.SIMPLE, Sens.NOM_PRENOMS);
									break;					
								}
						break; 
						case 6:
							System.out.print("\n\nFin de programme");
							for (int i = 0; i < 3; i++) {
								System.out.print(".");
								Thread.sleep(700);
							}
						System.exit(0); 
						break;
							
						case 10:
						case 14:
						case 15:
							System.out.println("Retour Au menu Pricipale!");
						break;	
						default: System.out.println("Choix Invalide!");

					}

					System.out.print("Continue? Press 0 to continue:");
					yes=sc.nextInt();

				}

			}catch(Exception e){System.exit(100);}

		}

	}

# TP1 : Gestion-Carnet-Adresses
## Introduction

Ce projet est �ffectu� par     `BELGHARBI Meryem` &     `AIT MANSOUR Mohamed`

```
belgharbimeryem@gmail.com
```
```
mohamed.ait-mansour@etu.univ-lehavre.fr
```

## L'application
Cette Application permet de g�rer un carnet d�adresses.Un carnet d�adresses est constitu� d�entr�es qui peuvent repr�senter des personnes ou des soci�t�s. Les informations et la pr�sentation sont diff�rentes s�il s�agis d�une personne ou d�une soci�t�. Les t�ches possibles sont :
  - Insertion
  - Selectionnement
  - Deselectionnement
  - Recherche
  - ...

Ci-joint le code `JAVA` du menu permettant de g�rer l'application :

```java
public static void showmenu(){
System.out.println("=======================================================");
System.out.println("Menu d'op�rations possible pour Gestion Carnet Adresses");
System.out.println("=======================================================");
System.out.println("1.Insertion (MENU)");
System.out.println("2.Selectionnement (MENU)");
System.out.println("3.DeSelectionnement - IRREVERSIBLE");
System.out.println("4.Recherche");
System.out.println("5.Affichage (MENU)");
System.out.println("6.Sortir");
}
```
## Testes
Pour tester l'application, notament l'insertion par fichier, merci d'utiliser un lien vers un fichier comme ceci:
```
C:\\Users\\User\\Desktop\\filename.txt
```
pour tester �galement l'ajout ou la selection, merci de respecter la format suivante pour `PERSONNE`:
```
ID;PERSONNE;PRENOMS;NOM;GENRE;ID_CONJOINT;ID_SOCIETE;FONCTION
```
Ou la format ci-dessous pour `SOCIETE` : 
```
ID;SOCIETE;RAISON_SOCIALE
```

Pour l'utilisation des fichiers, il faut respecter certains r�gles (ex. conjoint existant, et societ� d'une personne existante), pour �a merci d'utiliser ce fichier de test :
```
0;SOCIETE;Premiere Societe
1;PERSONNE;Cremier,James;Potter;H;;0;El�ve
2;PERSONNE;Clbus,Perceval,Wulfric,Brian;Dumbledore;H;1;0;Directeur
3;SOCIETE;Une societe SARL
4;PERSONNE;Drry,James;XXX;H;2;3;El�ve
```
## Dificult�s
Nous avons renctontr�s au d�but quelques difiult�s que nous avons d�pass�s ensemble, notament en :
 - Familiarisation avec GitLab
 - Erreurs avec la cr�ation des branches
 - Dificult�s de programmation 
 

## Conclusion
Merci de prendre en cos�diration que `nous avons travailler ensemble sur les m�mes t�ches` durant le TP de d�but jusqu'� la fin...

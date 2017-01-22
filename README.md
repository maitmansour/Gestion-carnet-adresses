# TP1 : Gestion-Carnet-Adresses
## Introduction

Ce projet est éffectué par     `BELGHARBI Meryem` &     `AIT MANSOUR Mohamed`

```
belgharbimeryem@gmail.com
```
```
mohamed.ait-mansour@etu.univ-lehavre.fr
```

## L'application
Cette Application permet de gérer un carnet d’adresses.Un carnet d’adresses est constitué d’entrées qui peuvent représenter des personnes ou des sociétés. Les informations et la présentation sont différentes s’il s’agis d’une personne ou d’une société. Les tâches possibles sont :
  - Insertion
  - Selectionnement
  - Deselectionnement
  - Recherche
  - ...

Ci-joint le code `JAVA` du menu permettant de gérer l'application :

```java
public static void showmenu(){
System.out.println("=======================================================");
System.out.println("Menu d'opérations possible pour Gestion Carnet Adresses");
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
pour tester également l'ajout ou la selection, merci de respecter la format suivante pour `PERSONNE`:
```
ID;PERSONNE;PRENOMS;NOM;GENRE;ID_CONJOINT;ID_SOCIETE;FONCTION
```
Ou la format ci-dessous pour `SOCIETE` : 
```
ID;SOCIETE;RAISON_SOCIALE
```

Pour l'utilisation des fichiers, il faut respecter certains régles (ex. conjoint existant, et societé d'une personne existante), pour ça merci d'utiliser ce fichier de test :
```
0;SOCIETE;Premiere Societe
1;PERSONNE;Cremier,James;Potter;H;;0;Elève
2;PERSONNE;Clbus,Perceval,Wulfric,Brian;Dumbledore;H;1;0;Directeur
3;SOCIETE;Une societe SARL
4;PERSONNE;Drry,James;XXX;H;2;3;Elève
```
## Dificultés
Nous avons renctontrés au début quelques difiultés que nous avons dépassés ensemble, notament en :
 - Familiarisation avec GitLab
 - Erreurs avec la création des branches
 - Dificultés de programmation 
 

## Conclusion
Merci de prendre en cosédiration que `nous avons travailler ensemble sur les mêmes tâches` durant le TP de début jusqu'à la fin...

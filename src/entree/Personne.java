package entree;
   public class Personne implements Entree{
	
	private String nom;
	   private String [] prenoms;
	   private Genre genre;
	   private Personne conjoint;
	   private Societe societe;
	   private String fonction;
	   
	   public Personne(String nom, String[] prenoms, Genre genre, Personne conjoint, Societe societe, String fonction) {
			super();
			this.nom = nom;
			this.prenoms = prenoms;
			this.genre = genre;
			this.conjoint = conjoint;
			this.societe = societe;
			this.fonction = fonction;
		}
	   
	/*public boolean recherche(String s){
	//TODO
	}*/
	   
	
	public String toString(Presentation pre,Sens sen){
	if(genre==NOM_PRENOMS && genre==ABREGE){
		for (String prenom : prenoms) {
			System.out.println(prenom.substring(0, 1) + ". ");
		}
		
		System.out.println(" "+nom);

	}
	}

	};


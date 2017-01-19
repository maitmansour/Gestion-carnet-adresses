package entree;
   public class Personne implements Entree{
	
	private String nom;
	   private String [] prenoms;
	   private Genre genre;
	   private Personne conjoint;
	   private Societe societe;
	   private String fonction;
	   
	   public Personne(String nom, String[] prenoms, Genre genre, Personne conjoint, Societe societe, String fonction) {
			this.nom = nom;
			this.prenoms = prenoms;
			this.genre = genre;
			this.conjoint = conjoint;
			this.societe = societe;
			this.fonction = fonction;
			//System.out.println("  Constructeur  ");
		}
	   
	
	public String toString(Presentation pre,Sens sen){
	//	System.out.println("  ToString Debut  ");

		String result="";
//Genre Homme ou Femme
		if(this.genre==Genre.HOMME){
			result+="M. ";
		}else{
			result+="Mme ";
		}
//Nom et prenoms
		switch (pre) {
		case ABREGE:
			result="";
			for (String prenom : prenoms) {
				result+=prenom.substring(0, 1) + ". ";
			}
			break;
		case SIMPLE:
			int i=0;
			for (String prenom : prenoms) {
				if(i==0){
				result+=prenom+ " ";
				i++;
				}else{
					result+=prenom.substring(0, 1) + ". ";
				}
			}
			break;

		default:
			for (String prenom : prenoms) {
				result+=prenom+ " ";
				}
			break;
		}
		
	if(sen==Sens.NOM_PRENOMS){
		result=nom+" "+result;		

	}else{
		result+=" "+nom;
	}
	
//Societé
	
	switch (pre) {
	case SIMPLE:
		result+=" ("+societe.toString()+")";
		break;
	case COMPLET:
		result+="\n"+"    -Societé : "+societe.toString();
		result+="\n"+"    -Fonction : "+fonction;
						
		break;
	}
	
	
	return result;
	}

	@Override
	public boolean recherche() {
		// TODO Auto-generated method stub
		return false;
	}

	};


package entree;
   public class Personne implements Entree{
	
	private String nom;
	   private String [] prenoms;
	   private Genre genre;
	   private Personne conjoint;
	   private Societe societe;
	   private String fonction;
	   
	   public Personne(String nom, String[] prenoms, Genre genre, Personne conjoint, Societe societe, String fonction) {
			setNom(nom);
			setPrenoms(prenoms);;
			setGenre(genre);;
			setConjoint(conjoint);;
			setSociete(societe);;
			setFonction(fonction);;
			//System.out.println("  Constructeur  ");
		}
	   
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String[] getPrenoms() {
		return prenoms;
	}


	public void setPrenoms(String[] prenoms) {
		this.prenoms = prenoms;
	}


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public Personne getConjoint() {
		return conjoint;
	}


	public void setConjoint(Personne conjoint) {
		this.conjoint = conjoint;
	}


	public Societe getSociete() {
		return societe;
	}


	public void setSociete(Societe societe) {
		this.societe = societe;
	}


	public String getFonction() {
		return fonction;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	public String toString(Presentation presentation,Sens sens){
	//	System.out.println("  ToString Debut  ");

		String result="";
//Genre Homme ou Femme
		if(getGenre()==Genre.HOMME){
			result+="M. ";
		}else{
			result+="Mme ";
		}
//Nom et prenoms
		switch (presentation) {
		case ABREGE:
			result="";
			for (String prenom : getPrenoms()) {
				result+=prenom.substring(0, 1) + ". ";
			}
			break;
		case SIMPLE:
			int i=0;
			for (String prenom : getPrenoms()) {
				if(i==0){
				result+=prenom+ " ";
				i++;
				}else{
					result+=prenom.substring(0, 1) + ". ";
				}
			}
			break;

		default:
			for (String prenom : getPrenoms()) {
				result+=prenom+ " ";
				}
			break;
		}
		
	if(sens==Sens.NOM_PRENOMS){
		result=getNom()+" "+result;		

	}else{
		result+=" "+getNom();
	}
	
//Societé
	
	switch (presentation) {
	case SIMPLE:
		result+=" ("+getSociete().toString()+")";
		break;
	case COMPLET:
		result+="\n"+"    -Societé : "+getSociete().toString();
		result+="\n"+"    -Fonction : "+getFonction();
						
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


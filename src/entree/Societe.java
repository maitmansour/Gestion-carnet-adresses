package entree;

public class Societe implements Entree{
	private String raisonSociale;

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public Societe(String raisonSociale) {
		setRaisonSociale(raisonSociale);
	}


	@Override
	public boolean recherche() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString(Presentation presentation, Sens sens) {
		return 	null;
	}	
	@Override
	public String toString() {
		return 	getRaisonSociale();
	}
	

}

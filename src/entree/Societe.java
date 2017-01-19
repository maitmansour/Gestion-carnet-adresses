package entree;

public class Societe implements Entree{
	private String raisonSociale;

	public Societe(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	@Override
	public String toString() {
		return raisonSociale;
	}

	@Override
	public boolean recherche() {
		// TODO Auto-generated method stub
		return false;
	}

}

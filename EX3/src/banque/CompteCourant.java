package banque;

public class CompteCourant {

	private static final int SEUIL_SECURITE = 1000;

	private int noCompte;
	private int solde;
	private int decouvertAutorise;

	public CompteCourant(int noCompte, int solde, int decouvertAutorise) {
		this.noCompte = noCompte;
		if (solde > SEUIL_SECURITE) {
			System.out.println("Attention, affectation suspecte d'un nouveau solde : compte n°" + this.noCompte);
		} else {
			this.solde = solde;
		}
		this.decouvertAutorise = decouvertAutorise;
	}

	public void crediter(int montant) {
		if (montant > SEUIL_SECURITE) {
			System.out.println("Attention, affectation suspecte d'un nouveau solde : compte n°" + this.noCompte);
		} else {
			this.solde += montant;
		}
	}

	public void debiter(int montant) {
		if ((this.solde - montant) > this.decouvertAutorise) {
			System.out.println("Erreur débit non autorisé");
		}
	}

	public int getNoCompte() {
		return noCompte;
	}

	public void setNoCompte(int noCompte) {
		this.noCompte = noCompte;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public int getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(int decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}
}
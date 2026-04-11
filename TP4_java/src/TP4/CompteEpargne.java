package TP4;

public class CompteEpargne extends Compte {
	private double tauxInteret;
	
	public CompteEpargne(String numero, String titulaire, double solde, double tauxInteret) {
		super(numero, titulaire, solde);
		this.tauxInteret = tauxInteret;
	}
	
	public void calculerInteret() {
		double interet = solde * tauxInteret;
		solde += interet;
	}
	
	public void retirer(double montant) {
		if(montant <= solde) {
			solde -= montant;
		}
		else {
			System.out.println("retrait refuse : solde insufisant");
		}
	}
}

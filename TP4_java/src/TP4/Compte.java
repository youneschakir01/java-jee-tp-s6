package TP4;

public class Compte {
	protected String numero;
	protected String titulaire;
	protected double solde;
	
	public Compte(String numero, String titulaire, double solde) {
		this.numero = numero;
		this.titulaire = titulaire;
		this.solde = solde;
	}
	// pas besoin de getters et setters : nous avons les attributts sont protected.
	
	public void deposer(double montant) {
		solde += montant;
	}
	
	public void retirer(double montant) {
		if (montant <= solde) {
			solde -= montant;
		}
		else {
			System.out.println("Solde insufisant !");
		}
	}
	
	public void afficher() {
		System.out.println("Numero :" +numero);
		System.out.println("Titulaire :" +titulaire);
		System.out.println("Solde :" +solde);
	}
}

package TP5;

public abstract class Abonnement {
	private String nom;
	private double prixBase;
	private int nbProfils;
	public Abonnement(String nom , double prixBase , int nbProfils) {
		this.nom = nom;
		if ( prixBase <= 0 ) {
			this.prixBase = 10;	
		}else {
			this.prixBase = prixBase;
		}
		if ( nbProfils <= 0 ) {
			this.nbProfils = 1;
		}else {
			this.nbProfils = nbProfils;
		}
	}
	public String getNom() {
		return nom;
	}
	public double getPrixBase() {
		return prixBase;
	}
	public int getNbProfils() {
		return nbProfils;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrixBase(double prixBase) {
		this.prixBase = prixBase;
	}
	public void setNbProfils(int nbProfils) {
		this.nbProfils = nbProfils;
	}
	public boolean estPartageFamilial() {
		if (nbProfils >= 3) {
			return true;
		}else {
			return false;
		}
	}
	public void afficherInfos() {
		System.out.println("Votre nom est :" +nom);
		System.out.println("Le prix de base est :" +prixBase);
		System.out.println("Le nombre de profils est :" +nbProfils);
		System.out.println("Le partage familiale est :" +estPartageFamilial());
	}
	public abstract double calculerCoutMensuel();
	public abstract int calculerScoreSatisfaction();
}

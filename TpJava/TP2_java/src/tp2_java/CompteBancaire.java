package tp2_java;

public class CompteBancaire {

	 private int numero;
	 private String titulaire;
     private double solde;
	 private double decouvertAutorise;
	 private static int nbComptes = 0;
	 private static double tauxInteretAnnuel = 0.03;
	 public CompteBancaire() {
		    nbComptes++;
		    this.numero = nbComptes;
		    this.titulaire = "Inconnu";
		    this.solde = 0.0;
		    this.decouvertAutorise = 0.0;
	 } 
	 public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
		    nbComptes++;
		    this.numero = nbComptes;
		    this.titulaire = titulaire;
		    this.solde = solde;
		    this.decouvertAutorise = decouvertAutorise;
	 }
	 public int getNumero() {
		    return numero;
		}

		public String getTitulaire() {
		    return titulaire;
		}

		public void setTitulaire(String titulaire) {
		    this.titulaire = titulaire;
		}

		public double getSolde() {
		    return solde;
		}

		public void setSolde(double solde) {
		    if (solde >= 0) {
		        this.solde = solde;
		    }
		}

		public double getDecouvertAutorise() {
		    return decouvertAutorise;
		}

		public void setDecouvertAutorise(double decouvertAutorise) {
		    if (decouvertAutorise >= 0) {
		        this.decouvertAutorise = decouvertAutorise;
		    }
		}
		public void afficher() {
		    System.out.println("------ Compte Bancaire ------");
		    System.out.println("Numéro : " + numero);
		    System.out.println("Titulaire : " + titulaire);
		    System.out.println("Solde : " + solde + " MAD");
		    System.out.println("Découvert autorisé : " + decouvertAutorise + " MAD");
		    System.out.println("-----------------------------");
		}
		public void deposer(double montant) {
		    if (montant > 0) {
		        solde += montant;
		    } else {
		        System.out.println("Montant de dépôt invalide.");
		    }
		}
		public void retirer(double montant) {
		    if (montant > 0 && (solde - montant) >= -decouvertAutorise) {
		        solde -= montant;
		    } else {
		        System.out.println("Retrait refusé.");
		    }
		}
		public void virementVers(CompteBancaire autre, double montant) {
		    if (montant > 0 && (solde - montant) >= -decouvertAutorise) {
		        this.solde -= montant;
		        autre.solde += montant;
		    } else {
		        System.out.println("Virement impossible : montant ou solde insuffisant.");
		    }
		}
		public double calculerSoldeAvecInterets() {
		    return solde + (solde * tauxInteretAnnuel);
		}
		public double calculerSoldeAvecInterets(double bonus) {
		    return solde + (solde * (tauxInteretAnnuel + bonus));
		}
		public static int getNbComptes() {
		    return nbComptes;
		}
		public static double getTauxInteretAnnuel() {
		    return tauxInteretAnnuel;
		}
		public static void setTauxInteretAnnuel(double taux) {
		    if (taux >= 0) {
		        tauxInteretAnnuel = taux;
		    } else {
		        System.out.println("Taux invalide.");
		    }
		}
}



package tp2_java;

public class TestBanque {

    public static void main(String[] args) {

        Banque marocBank = new Banque(1500);

        CompteBancaire c1 = new CompteBancaire("Younes", 1000, 500);
        CompteBancaire c2 = new CompteBancaire("Ali", 2000, 300);
        CompteBancaire c3 = new CompteBancaire("Ahmad", 1500, 400);

        marocBank.ajouterCompte(c1);
        marocBank.ajouterCompte(c2);
        marocBank.ajouterCompte(c3);

        c1.deposer(500);
        c1.retirer(200);
        c2.virementVers(c3, 300);

        marocBank.afficherTous();

        double s1 = c2.calculerSoldeAvecInterets();
        double s2 = c2.calculerSoldeAvecInterets(0.015);

        System.out.println("Solde avec intérêts (sans bonus) : " + s1);
        System.out.println("Solde avec intérêts (avec bonus) : " + s2);

        System.out.println("Nombre total de comptes : " + CompteBancaire.getNbComptes());
        System.out.println("Taux d'intérêt annuel : " + CompteBancaire.getTauxInteretAnnuel());
    }
}



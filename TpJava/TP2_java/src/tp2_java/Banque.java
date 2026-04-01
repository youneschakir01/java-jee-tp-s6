package tp2_java;

public class Banque {
    private CompteBancaire[] comptes;
    private int nbComptes;
    public Banque(int capacite) {
        comptes = new CompteBancaire[capacite];
        nbComptes = 0;
    }
    public void ajouterCompte(CompteBancaire c) {
        if (nbComptes < comptes.length) {
            comptes[nbComptes] = c;
            nbComptes++;
        } else {
            System.out.println("Banque pleine !");
        }
    }
    public void afficherTous() {
        for (int i = 0; i < nbComptes; i++) {
            comptes[i].afficher();
        }
    }
}



package TP4;

public class TestBanque {
	public static void main(String[] args) {
		Compte[] comptes = new Compte[4];
		
		comptes[0] = new CompteCourant("A1", "younes", 1000, 500);
		comptes[1] = new CompteEpargne("B1", "said", 2000, 0.05);
		comptes[2] = new ComptePremium("C1", "khalid", 3000, 1000);
		comptes[3] = new CompteCourant("D1", "omar", 1500, 300);
		
		for (Compte C : comptes) {
			C.deposer(100);
			C.retirer(200);
			C.afficher();
			System.out.println(" ");
		}
		
		// question 6
		System.out.println("Comptes Epargne :");
		for (Compte C : comptes) {
			if (C instanceof CompteEpargne) {
				C.afficher();
			}
		}
	}
}
/*
Compte c = new CompteEpargne();
CompteCourant cc = (CompteCourant) c;
❌ Est-ce que ça fonctionne ?
👉 NON, ça ne fonctionne pas correctement à l’exécution.
❌ Erreur :
👉 ClassCastException
❓ Pourquoi ?
c est réellement un objet de type CompteEpargne
tu essaies de le convertir en CompteCourant
ce sont deux classes différentes (frères dans l’héritage)
Java refuse ce cast à runtime
 */

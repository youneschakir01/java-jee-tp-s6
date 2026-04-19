package TP5;

public class TestAbonnement {

	public static void main(String[] args) {
		/* Q1 */
		Abonnement[] abonnements = new Abonnement[3];
		abonnements[0] = new AbonnementVideo("Netflix", 80, 4, true, true);
		abonnements[1] = new AbonnementMusique("Spotify", 50, 3, 25, true);
		abonnements[2] = new AbonnementJeux("xbox", 100, 2, 60, 45);
		/* Q2 */
		for (Abonnement a : abonnements) {
			System.out.println(" ");
			a.afficherInfos();
			System.out.println("Le cout mensuel est : " +a.calculerCoutMensuel());
			System.out.println("Le score de satisfaction est : " +a.calculerScoreSatisfaction());
			System.out.println();
	    }
		/* Q3 */
		Reducible[] reducibles = new Reducible[2];
		
		reducibles[0] = (Reducible) abonnements[0];
		reducibles[1] = (Reducible) abonnements[1];
		/* Q4 */
		double[] reductions = {20, 50};
		for (double r : reductions) {
			System.out.println("\n--- Reduction : " + r + "% ---");
			for (Reducible red : reducibles) {
				System.out.println("Le cout apres reduction : " +red.AppliquerReduction(r));
			}
		}
	}
}

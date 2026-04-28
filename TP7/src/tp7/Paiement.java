package tp7;

public class Paiement {
	
	public static double effectuerPaiement(double montant, double solde) {
		if (montant <= 0) {
			throw new IllegalArgumentException("Montant invalide");
		}
		if (montant > solde) {
			throw new IllegalArgumentException("Solde insuffisant");
		}
		return solde - montant;
	}
	
	public static double lireMontant(String valeur) throws NumberFormatException, IllegalArgumentException {
		
			double montant = Double.parseDouble(valeur);
			if (montant < 0) {
				throw new IllegalArgumentException("Montant negatif interdit.");
			}
		    return montant;
    }
	
	public static double lireTransaction(double[] tab, int index) {
		return tab[index];
	}
	
	public static void main(String[] args) {
		double solde = 1000;
		
		try {
			double nouveauSolde = effectuerPaiement(200, solde);
			System.out.println("Paiement reussi. Le nouveau solde est : " + nouveauSolde);
		}catch(IllegalArgumentException e){
			System.out.println(" Erreur : montant invalide");
		}catch (ArithmeticException e) {
			System.out.println("Erreur : solde insuffisant");
		}finally {
			System.out.println("Fin de la transaction");
		}
		
        try {
            double m1 = lireMontant("150");
            System.out.println("Montant 1 : " + m1);

        } catch (NumberFormatException e) {
            System.out.println("Erreur : format invalide");

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            double m2 = lireMontant("abc");
            System.out.println("Montant 2 : " + m2);

        } catch (NumberFormatException e) {
            System.out.println("Erreur : format invalide");

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        
        try {
            double m3 = lireMontant("-50");
            System.out.println("Montant 3 : " + m3);

        } catch (NumberFormatException e) {
            System.out.println("Erreur : format invalide");

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        
        double[] tab1 = {100, 200, 300};
        try {
            double valeur1 = lireTransaction(tab1, 1);
            System.out.println("Transaction 1 : " + valeur1);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : index invalide");

        } catch (NullPointerException e) {
            System.out.println("Erreur : tableau non initialisé");
        }
        try {
            double valeur2 = lireTransaction(tab1, 5);
            System.out.println("Transaction 2 : " + valeur2);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : index invalide");

        } catch (NullPointerException e) {
            System.out.println("Erreur : tableau non initialisé");
        }
        double[] tab2 = null;
        try {
            double valeur3 = lireTransaction(tab2, 0);
            System.out.println("Transaction 3 : " + valeur3);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : index invalide");

        } catch (NullPointerException e) {
            System.out.println("Erreur : tableau non initialisé");
        }
	}
}


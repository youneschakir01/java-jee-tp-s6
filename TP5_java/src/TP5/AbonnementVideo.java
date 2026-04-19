package TP5;

public class AbonnementVideo extends Abonnement implements Reducible {
	    protected boolean optionHD;
	    protected boolean option4K;
	    public AbonnementVideo(String nom, double prixBase, int nbProfils, boolean optionHD, 
	    		boolean option4K) {
	    	super(nom,prixBase,nbProfils);
	    	this.optionHD = optionHD;
	    	this.option4K = option4K;
	    }
	    public double calculerCoutMensuel() {
	    	double cout = getPrixBase();
	    	if (optionHD) {
	    		cout += 10;
	    	}
	    	if (option4K) {
	    		cout += 20;
	    	}
	    	return cout;
	    }
	    public int calculerScoreSatisfaction() {
	    	int score = 60;
	    	if (optionHD) {
	    		score += 10;
	    	}
	    	if (option4K) {
	    		score += 20;
	    	}
	    	if (getNbProfils() >= 4) {
	    		score += 10;
	    	}
	    	if (score > 100) {
	    		score = 100;
	    	}
	    	return score;
	    }
	    /* Interface Reductible */
		public boolean EstEligibleReduction(double pourcentage) {
			return pourcentage <= 30;
		}
		public double AppliquerReduction(double pourcentage) {
			if (!EstEligibleReduction(pourcentage)) {
				return calculerCoutMensuel();
			}
			return calculerCoutMensuel() * (1 - pourcentage / 100);
		}
}

package tp6;

public class Livre {
	
		protected String isbn;
		protected String titre;
		protected String auteur;
		protected int annee;
		
		public Livre(String isbn, String titre, String auteur, int annee) {
			this.isbn = isbn;
			this.titre = titre;
			this.auteur = auteur;
			this.annee = annee;	
		}
		
		public String toString() {
			return isbn + " | " + titre + " | " + auteur + " | " + annee;	
		}
}


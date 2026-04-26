package tp6;

public class Etudiant {
	protected int id;
	protected String nom;
	protected double moyenne;
	public Etudiant(int id, String nom, double moyenne) {
		this.id = id;
		this.nom = nom;
		this.moyenne = moyenne;
	}
	public String toString() {
		return "Id :" + id + " Nom :" + nom + " - Moyenne :" + moyenne;
	}
}


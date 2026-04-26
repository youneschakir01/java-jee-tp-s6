package tp6;

public class Client {
	protected int numero;
	protected String nom;
	public Client(int numero, String nom) {
		this.numero = numero;
		this.nom = nom;
	}
	public String toString() {
        return "Num :" + numero + " - Nom :" + nom;
    }
}


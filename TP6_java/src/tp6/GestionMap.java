package tp6;
import java.util.HashMap;
import java.util.Scanner;

public class GestionMap {
	public static void main(String[] args) {
		
		HashMap<String, Double> notes = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		notes.put("younes", 20.0);
		notes.put("khalid", 12.0);
		notes.put("salma", 17.5);
		
		System.out.println("La liste des notes :");
		for (String nom : notes.keySet()) {
			System.out.println(nom + " : " + notes.get(nom));
		}
		
		System.out.print("Donner le nom de l'etudiant : ");
		String nomR = sc.nextLine();
		if (notes.containsKey(nomR)) {
			double note = notes.get(nomR);
			System.out.println("La note de " + nomR + " est : " + note);
		}else {
			System.out.println("Etudiant non trouve");
		}
		
		System.out.println("Donner le nom de l'etudiant a modifier : ");
		String nomM = sc.nextLine();
		if (notes.containsKey(nomM)) {
			System.out.println("La nouvelle note est : ");
			double newNote = Double.parseDouble(sc.nextLine());
			notes.put(nomM,  newNote);
	    }
		
		System.out.println("Donner le nom a supprimer : ");
		String nomS = sc.nextLine();
		notes.remove(nomS);
		System.out.println("La liste des notes :");
		for (String nom : notes.keySet()) {
			System.out.println(nom + " : " + notes.get(nom));
		}
		
		double somme = 0;
		for(double n : notes.values()) {
			somme += n;
		}
		double moyenne = somme / notes.size();
		System.out.println(" La moyenne generale de la classe est : " + moyenne);	
	}
}

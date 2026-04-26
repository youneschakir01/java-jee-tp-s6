package tp6;
import java.util.*;

public class Bibliotheque {
	public static void main(String[] args) {
		
		ArrayList<Livre> livres = new ArrayList<>();
		
		livres.add(new Livre("111", "Java", "Kamal", 2020));
		livres.add(new Livre("222", "Python", "Younes", 2019));
		livres.add(new Livre("333", "C++", "Yassine", 2018));
		
		HashSet<String> categories = new HashSet<>();
		categories.add("Reseaux");
		categories.add("Programmation");
		
		HashMap<String, Livre> emprunts = new HashMap<>();
		emprunts.put("younes", livres.get(0));
		emprunts.put("kamal", livres.get(1));
		
		String titreR = "java";
		boolean trouve = false;
		for (Livre l : livres) {
			if (l.titre.equalsIgnoreCase(titreR)) {
				System.out.println("Le livre" + l + " est trouve.");
				trouve = true;
				break;
			}
		}
		if (!trouve) {
			System.out.println("Le livre non trouve");
		}
		
		String isbnSup = "222";
		for (int i = 0; i < 3; i++) {
			if(livres.get(i).isbn.equals(isbnSup)) {
				livres.remove(i);
				break;
			}
		}
		
		System.out.println("Les livres disponibles sont :");
		for (Livre l : livres) {
			System.out.println(l);
		}
		
		System.out.println("Le rapport :");
		System.out.println("Le nombre des livres est :" + livres.size());
		System.out.println("Le nombre des categories est :" + categories.size());
		System.out.println("Le nombre des emprunts est :" + emprunts.size());	
	}
}

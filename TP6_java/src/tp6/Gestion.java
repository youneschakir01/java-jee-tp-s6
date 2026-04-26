package tp6;
import java.util.*;
import java.util.Scanner;
public class Gestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Etudiant> list = new ArrayList<>();
		
		list.add(new Etudiant(1, "younes", 20));
		list.add(new Etudiant(2, "mohammed", 18));
		list.add(new Etudiant(3, "yassine", 19));
		list.add(new Etudiant(4, "ali", 14));
		list.add(new Etudiant(5, "hassan", 17));

		
		for(Etudiant e : list) {
			System.out.println(e);
		}
		boolean trouve = false;
		String nom_rechercher;
		System.out.println("Donner le nom a rechercher :");
		nom_rechercher = sc.nextLine();
		for (Etudiant e : list) {
			if (e.nom.equals(nom_rechercher)) {
				trouve = true;
				break;
			}
		}
		if(trouve) {
			System.out.println("Le nom " + nom_rechercher +" est trouve.");
		}else {
			System.out.println("Le nom " + nom_rechercher +" n'est pas trouve.");
		}
		int idSup = 3;
		for(int i = 0; i <= 5; i++) {
			if(list.get(i).id == idSup) {
				list.remove(i);
				break;
			}
		}
		System.out.println("La liste apres la suppression est : ");
		for(Etudiant e : list) {
			System.out.println(e);
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (list.get(i).moyenne < list.get(j).moyenne) {
					Etudiant temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
				
		}
		System.out.println("La liste triee est :");
		for(Etudiant e : list) {
			System.out.println(e);
		}
		Etudiant meilleure = list.get(0);
		for (Etudiant e : list) {
			if(e.moyenne > meilleure.moyenne) {
				meilleure = e;
			}
		}
		System.out.println("La meilleure etudiant est : " + meilleure);
	}
}



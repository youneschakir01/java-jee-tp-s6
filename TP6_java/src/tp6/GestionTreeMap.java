package tp6;
import java.util.TreeMap;

public class GestionTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> etudiants = new TreeMap<>();
		
		etudiants.put(200, "kamal");
		etudiants.put(3, "ilyas");
		etudiants.put(1, "oussama");
		etudiants.put(400, "ahmed");
		
		System.out.println("La liste triee est : ");
		for (Integer id : etudiants.keySet()) {
			System.out.println(id + " : " + etudiants.get(id));
		}
		
		System.out.println("La premier etudiant est : " + etudiants.get(etudiants.firstKey()));
		System.out.println("La dernier etudiant est : " + etudiants.get(etudiants.lastKey()));
		
		System.out.println("Les etudiants ayant un numero superieur a 100 sont :");
		for (Integer id : etudiants.keySet()) {
			if (id > 100) {
				System.out.println(etudiants.get(id));
			}
		}
	}
}


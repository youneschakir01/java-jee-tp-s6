package tp6;
import java.util.HashSet;
import java.util.TreeSet;

public class GestionSet {

	public static void main(String[] args) {
		
		HashSet<String> matieres = new HashSet<>();
		matieres.add("Informatique");
		matieres.add("Arabe");
	    matieres.add("Physique");
	    matieres.add("Math");
	    matieres.add("Physique");
	    
	    System.out.println("Les matieres sont : ");
	    for (String m : matieres) {
	    	System.out.println(m);
	    }
	    
	    if (matieres.contains("Physique")) {
	    	System.out.println("Aucun doublon exixte.");
	    }
	    
	    TreeSet<String> matieresTriees = new TreeSet<>(matieres);
	    
	    System.out.println("Les matieres triees par ordre alphabitique est :");
	    for (String m : matieresTriees) {
	    	System.out.println(m);
	    }
	}
}


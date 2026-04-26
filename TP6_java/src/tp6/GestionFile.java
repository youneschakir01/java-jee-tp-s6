package tp6;
import java.util.LinkedList;

public class GestionFile {
	public static void main(String[] args) {
		
		LinkedList<Client> file = new LinkedList<>();
		file.add(new Client(1, "younes"));
		file.add(new Client(2, "ali"));
		file.add(new Client(3, "walid"));
		
		System.out.println("La File originale est :");
		for (Client c : file) {
			System.out.println(c);
		}
		
		if(!file.isEmpty()) {
			Client servi = file.removeFirst();
			System.out.println("Le client servi est : " + servi);
		}
		
		file.addLast(new Client(4, "Fatima"));
		
		if (!file.isEmpty()) {
			System.out.println("Le premier client est : " + file.getFirst());
		}
		
		System.out.println("La file apres modification est :  ");
		for (Client c : file) {
			System.out.println(c);
		}
	}
}



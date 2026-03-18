package partie1;
import java.util.Scanner;
public class Exercice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir un nombre :");
		int N = sc.nextInt();
		System.out.println("la table de multiplication est :");
		for(int i=0 ; i<=10 ; i++) {
			int S = N*i;
			System.out.println(N + "*" + i + "=" + S);
		}
		
		
	}

}

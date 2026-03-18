package partie2;
import java.util.Scanner;
public class Exercice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = 10;
		int i;
		int[] Tableau=new int [N];
		for(i=0 ; i<N ; i++) {
			System.out.println("saisir une valeur :");
			Tableau[i]=sc.nextInt();
		}
		System.out.println("donner un nombre a rechercher :");
		int M = sc.nextInt();
		for(i=0 ; i<N ; i++) {
			if(Tableau[i] == M) {
				System.out.println("la position de " + M + " " + "dans le tableau est :" + i);
			}
				
		}

	}

}

package partie2;
import java.util.Scanner;
public class Exercice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir la taille de tableau :");
		int N = sc.nextInt();
		int[] Tableau=new int [N];
		for(int i =0 ; i<N ; i++) {
			System.out.println("donner les elements de tableau :");
			Tableau[i]=sc.nextInt();
		}
		System.out.println("les element de tableau est :");
		for (int i=0 ; i<N ; i++) {
			System.out.println(Tableau[i]);
		}
	}

}

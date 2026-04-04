package partie2;
import java.util.Scanner;
public class Exercice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("donner la taille de tableau :");
		int N = sc.nextInt();
		int[] Tableau=new int [N];
		int i;
		for(i=0 ; i<N ; i++) {
		System.out.println("donner les elements de tableau :");
		Tableau[i] = sc.nextInt();
		}
		int max=Tableau[0];
		for(i=0 ; i<N ; i++) {
			if(Tableau[i]>max) {
				max=Tableau[i];
			}
		}
		System.out.println("la plus grand valeur de tableau est :" + max);
	}

}


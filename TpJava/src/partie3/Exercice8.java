package partie3;
import java.util.Scanner;
public class Exercice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] matrice = new int[3][3];
		System.out.println("entrer les elements de la matrice 3*3 :");
		int i;
		int j;
		for(i=0 ; i<3 ; i++) {
			for(j=0 ; j<3 ; j++) {
				System.out.println("element [" + (i+1) + "," +(j+1) + "] :");
				matrice[i][j] = sc.nextInt();
			}
		}
		System.out.println("la matrice 3*3 est :");
		for(i=0 ; i<3 ; i++) {
			for(j=0 ; j<3 ; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}

}
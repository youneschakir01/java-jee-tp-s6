package partie3;
import java.util.Scanner;
public class Exercice9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [][] matrice = new int[3][3];
		System.out.println("entrer les element de la matrice 3*3 :");
		int i ;
		int j ;
		for (i=0 ; i<3 ; i++) {
			for(j=0 ; j<3 ; j++) {
				System.out.print("element [" + (i+1) + "," +(j+1) + "] :");
				matrice[i][j] = sc.nextInt();
			}
		}
		System.out.println("la matrice 3*3 est :");
		for (i=0 ; i<3 ; i++) {
			for(j=0 ; j<3 ; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		int somme = 0;
		for (i=0 ; i<3 ; i++) {
			for(j=0 ; j<3 ; j++) {
				somme += matrice[i][j];
			}
		}	
System.out.println("la somme des elements de la matrice est :" + somme);
	}

}



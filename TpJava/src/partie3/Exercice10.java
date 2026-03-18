package partie3;
import java.util.Scanner;
public class Exercice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de lignes de la matrice : ");
        int lignes = scanner.nextInt();
        System.out.print("Entrez le nombre de colonnes de la matrice : ");
        int colonnes = scanner.nextInt();
        int[][] matrice = new int[lignes][colonnes];
        System.out.println("Entrez les éléments de la matrice :");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print("Élément [" + (i + 1) + "," + (j + 1) + "] : ");
                matrice[i][j] = scanner.nextInt();
            }
        }
        System.out.println("La matrice originale est :");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transposée = new int[colonnes][lignes];
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                transposée[j][i] = matrice[i][j];
            }
        }
        System.out.println("La matrice transposée est :");
        for (int i = 0; i < colonnes; i++) {
            for (int j = 0; j < lignes; j++) {
                System.out.print(transposée[i][j] + " ");
            }
            System.out.println();
        }
    }
}
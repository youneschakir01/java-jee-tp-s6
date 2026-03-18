package partie1;
import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int a = sc.nextInt();

        System.out.print("Entrez le deuxieme nombre : ");
        int b = sc.nextInt();

        System.out.print("Entrez le troisieme nombre : ");
        int c = sc.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Le plus grand nombre est : " + max);

        sc.close();
    }
}

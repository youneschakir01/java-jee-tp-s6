package partie1;
import java.util.Scanner;
public class Exercice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("saisir un nombre:");
		int N = sc.nextInt();
		int S = 0;
		int i = 0;
		while( i <= N) {
		S = S + i;
		i++;
		}
		System.out.println("la somme des" + N + "premiers entiers est :" + S);
		

	}

}

package partie4;
import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = scanner.nextLine().toLowerCase();
        String chaineClean = chaine.replaceAll("[^a-zA-Z0-9]", "");
        boolean estPalindrome = true;
        int i = 0;
        int j = chaineClean.length() - 1;
        while (i < j) {
            if (chaineClean.charAt(i) != chaineClean.charAt(j)) {
                estPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (estPalindrome) {
            System.out.println("La chaîne est un palindrome.");
        } else {
            System.out.println("La chaîne n'est pas un palindrome.");
        }
    }
}


package partie4;
import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = scanner.nextLine().toLowerCase();
        int compteurVoyelles = 0;
        for (int i = 0; i < chaine.length(); i++) {
            char caractere = chaine.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' || caractere == 'y') {
                compteurVoyelles++;
            }
        }
        System.out.println("Le nombre de voyelles dans la chaîne est : " + compteurVoyelles);
    }
}


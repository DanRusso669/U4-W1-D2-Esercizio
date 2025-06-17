package esercizio1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa. Se il risultato è 'true' significa che il numero di caratteri è pari.");
        System.out.println(stringaPariDispari(scanner.nextLine()));

        System.out.println("Inserisci un anno. Se il risultato è 'true' significa che è bisestile.");
        System.out.println(annoBisestile(Integer.parseInt(scanner.nextLine())));

        scanner.close();
    }

    public static boolean stringaPariDispari (String str) {


        if(str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile (int anno) {

        if (anno % 4 == 0) {
            return true;
        } else if (anno % 100 == 0) {
            if (anno % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

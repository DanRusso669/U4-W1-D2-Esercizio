package esercizio3;

import java.util.Objects;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        separatiDaVirgola();
    }

    public static void separatiDaVirgola (){

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Inserisci una stringa. Inserisci ':q' se vuoi uscire. ");
            String str = scanner.nextLine();

            if(!Objects.equals(str, ":q")){
                System.out.println(String.join(",", str.split("")));

            } else {
                break;
            }

        }

        scanner.close();
    }
}

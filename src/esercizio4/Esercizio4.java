package esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero. Partirà il countdown da quel numero a 0.");
        countdown(Integer.parseInt(scanner.nextLine()));

        scanner.close();
    }

    public static void countdown (int num){

        for(int i = num; i >= 0; i--){
            System.out.println(i);
        }
    }
}

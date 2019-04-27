package Zadanie_1;

import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Random rand = new Random();
        guessNumber(rand.nextInt(100));
    }

    private static void guessNumber(int number) {
        int userNumber;
        do {
            userNumber = getInt();
            if (userNumber < number) {
                System.out.println("Za mało");
            } else if (userNumber > number) {
                System.out.println("Za dużo");
            }
        } while (number != userNumber);
        System.out.println("Zgadłeś");
    }

    protected static int getInt() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.print("Nieprawidłowe dane. Podaj jeszcze raz: ");
        }
        return scan.nextInt();
    }
}

package Lessons6;

import java.util.Scanner;

public class Futures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String firstWord = scanner.next();
        System.out.println("Введите второе слово");
        String secondWord = scanner.next();
        int halfLength = firstWord.length() / 2;
        String firstHalf = firstWord.substring(0 , halfLength);
        String secondHalf = secondWord.substring(halfLength);
        String result = firstHalf + secondHalf;
        System.out.println("Результат: " + result);

    }
}

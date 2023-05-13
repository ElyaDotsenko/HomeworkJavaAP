package Lessons6;


public class MatTest {
    public static void main(String[] args) {
        int a = 8; int b = 4;

        System.out.println("Арифметические результаты:");
        System.out.println("Умножение: " + multiply(a, b));
        System.out.println("Деление: " + divide(a, b));
        System.out.println("Сложение: " + sum(a , b));
        System.out.println("Вычитание: " + subtract(a , b));
    }
          public static int multiply(int a, int b) {
              return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;

    }
}

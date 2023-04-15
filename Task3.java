// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int num1 = sc.nextInt();
        System.out.println("Введите знак: ");
        String sym = sc.next();
        System.out.println("Введите число 2: ");
        int num2 = sc.nextInt();

        if (sym.equals("+")) {
            System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
        } else if (sym.equals("-")) {
            System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
        } else if (sym.equals("*")) {
            System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
        } else if (sym.equals("/")) {
            double num_1 = num1;
            double num_2 = num2;
            System.out.printf("%d / %d = %f", num1, num2, num_1/num_2);
        } else {
            System.out.println("Ошибка ввода");
        }
        sc.close();
    }
}
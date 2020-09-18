// Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.
import java.util.Scanner;
public class Task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        int S = 0;
        for (int i = 1; i <= x; i++) {
            S += i;
        }
        System.out.println("S = " + S);

    }
}
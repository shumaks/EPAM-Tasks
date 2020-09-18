// Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа.
import java.util.Scanner;
public class Task3_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while (a>0) {
            s1.insert(0, a%10);
            a /= 10;
        }
        while (b>0) {
            s2.insert(0, b%10);
            b /= 10;
        }
        char [] digit = new char[999999];
        int k = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    digit[k] = s1.charAt(i);
                    k++;
                }
            }
        }
        System.out.println("Цифры, входящие в оба числа: ");
        for (int n = 0; n < k; n++) {
            System.out.println(digit[n]);
        }

    }
}
//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
import java.util.Scanner;
public class Task3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("mgit  = ");
        int m = in.nextInt();
        System.out.print("n = ");
        int n = in.nextInt();
        int k = 0;
        for (int i = m; i <= n; i++) {
            System.out.print(i + ": ");
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    System.out.print(j + " ");
                    k++;
                }
            }
            if (k==0) {
                System.out.print("none");
            }
            k = 0;
            System.out.println();
        }
    }
}

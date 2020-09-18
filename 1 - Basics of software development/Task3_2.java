// Вычислить значение функции на отрезке [а,b] c шагом h
import java.util.Scanner;
public class Task3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("h = ");
        int h = in.nextInt();
        int y = 0;
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
              y += i;
            }
            else {
                y -= i;
            }
        }
        System.out.println("y = " + y);
    }
}

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
import java.util.Scanner;
public class Task2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1 = ");
        int x1 = in.nextInt();
        System.out.print("y1 = ");
        int y1 = in.nextInt();
        System.out.print("x2 = ");
        int x2 = in.nextInt();
        System.out.print("y2 = ");
        int y2 = in.nextInt();
        System.out.print("x3 = ");
        int x3 = in.nextInt();
        System.out.print("y3 = ");
        int y3 = in.nextInt();

        double a, b;
        a = (x1 - x2) / (y1 - y2);
        b = y1 - a * x1;
        if (y3 == (a*x3 + b)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}

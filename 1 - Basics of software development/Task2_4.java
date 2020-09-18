//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
import java.util.Scanner;
public class Task2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A = ");
        int a = in.nextInt();
        System.out.print("B = ");
        int b = in.nextInt();
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        System.out.print("z = ");
        int z = in.nextInt();
        if (((a>=x) && (b>=y)) || ((a>=y) && (b>=z)) || ((a>=x) && (b>=z)) || ((b>=x) && (a>=y)) || ((b>=y) && (a>=z))
                || ((b>=x) && (a>=z))) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

}

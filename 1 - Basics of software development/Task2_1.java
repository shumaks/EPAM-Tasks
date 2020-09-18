//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным
import java.util.Scanner;
public class Task2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        int z = 180 - x - y;
        if ((x + y) < 180) {
            if ((x == 90) || (y == 90) || (z == 90)) {
                System.out.println("Существует и является прямогульным");
            }
            else {
                System.out.println("Существует и не является прямоугольным");
            }
        }
        else {
            System.out.println("Не существует");
        }
    }
}

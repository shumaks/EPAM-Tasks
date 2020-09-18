//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
import java.util.Scanner;
public class Task1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();
        double z = ( (a-3)*b/2)+c;
        System.out.println("z = " + z);
    }
}

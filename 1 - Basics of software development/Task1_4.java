// Поменять местами целую и дробную часть числа R = nnn.ddd
import java.util.Scanner;
public class Task1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("R = ");
        double R = in.nextDouble();
        double NewR = (R * 1000)%1000 + (int) R / 1000.0;
        System.out.println("NewR = " + NewR);
    }

}

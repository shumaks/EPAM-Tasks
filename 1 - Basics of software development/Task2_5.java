//Вычислить значение функции
import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Task2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        if (x<=3) {
            System.out.println(pow(x,2)-3*x+9);
        }
        else {
            System.out.println(1/(pow(x,3)+6));
        }
    }
}

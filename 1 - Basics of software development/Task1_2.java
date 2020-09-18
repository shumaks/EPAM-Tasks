//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
import java.util.Scanner;
public class Task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();
        double z = ((b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a) - Math.pow(a,3)*c + Math.pow(b,-2));
        System.out.println(z);
    }
}

//Найти max{min(a, b), min(c, d)}
import java.util.Scanner;
public class Task2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("c = ");
        int c = in.nextInt();
        System.out.print("d = ");
        int d = in.nextInt();
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
    }
}

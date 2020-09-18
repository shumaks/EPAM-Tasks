// Перевести секунды в ЧЧ:ММ:СС
import java.util.Scanner;
public class Task1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sec = ");
        int time = in.nextInt();
        int hours = time / 3600;
        int min = time / 60 - hours * 60;
        int sec = time - hours * 3600 - min * 60;
        System.out.println(hours + ":" + min + ":" + sec + ":");
    }
}
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:
import java.util.Scanner;
public class Task3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (1/Math.pow(2,i) + 1/Math.pow(3,i));
        }
        System.out.print("e = ");
        int e = in.nextInt();
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (Math.abs(arr[i]) >= e) {
                s+=arr[i];
            }
        }
    }
}

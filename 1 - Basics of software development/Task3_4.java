//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task3_4 {
    public static void main(String[] args) {
        long s = 1;
        int j;
        for (int i = 1; i <= 200; i++) {
            j = (int) Math.pow(i,2);
            s = s * j;
        }
        System.out.println(s);
    }
}

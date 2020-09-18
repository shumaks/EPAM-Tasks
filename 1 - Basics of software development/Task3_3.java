//Найти сумму квадратов первых ста чисел
public class Task3_3 {
    public static void main(String[] args) {
        int s = 0;
        int j;
        for (int i = 1; i <= 100; i++) {
            j = (int) Math.pow(i,2);
            s +=j;
        }
        System.out.println(s);
    }
}

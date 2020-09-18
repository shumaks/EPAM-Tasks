// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Task3_6 {
    public static void main(String[] args) {
        char c;
        for (int i = 0; i <= 127; i++) {
            c = (char) i;
            System.out.println(i + " - " + c);
        }

    }
}
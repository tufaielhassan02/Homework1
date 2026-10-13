import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h, m, s;

        System.out.print("Enter hours, minutes and seconds: ");
        h = input.nextInt();
        m = input.nextInt();
        s = input.nextInt();

        s++;

        if (s == 60) {
            s = 0;
            m++;
        }

        if (m == 60) {
            m = 0;
            h++;
        }

        if (h == 24) {
            h = 0;
        }

        System.out.println(h + " " + m + " " + s);
    }
}
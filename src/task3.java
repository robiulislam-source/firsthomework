import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int width = x2 - x1;
        int height = y1 - y2;

        int s = width * height;
        int p = 2 * (width + height);

        System.out.println("s = " + s);
        System.out.println("p = " + p);
    }
}

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int v = input.nextInt(); // average books per month
        int n = input.nextInt(); // visitors per year

        double k = (v * 12.0) / n;

        System.out.println(k);
    }
}


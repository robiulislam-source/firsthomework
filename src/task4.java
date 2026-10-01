import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(area);
    }
}

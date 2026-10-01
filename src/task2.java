import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int width = input.nextInt();
        double price = input.nextDouble();

        double area = length * width;
        double totalArea = area * 1.05;
        double totalCost = totalArea * price;

        System.out.println(totalCost);
    }
}

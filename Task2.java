import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int width = sc.nextInt();
        double price = sc.nextDouble();

        double floor = length * width;
        double tiles = floor + floor * 0.05;
        double money = tiles * price;

        System.out.println(money);
    }
}
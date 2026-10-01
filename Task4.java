import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sideA = sc.nextDouble();
        double sideB = sc.nextDouble();
        double sideC = sc.nextDouble();

        double semi = (sideA + sideB + sideC) / 2;

        double result = Math.sqrt(
                semi * (semi - sideA) *
                        (semi - sideB) *
                        (semi - sideC)
        );

        System.out.println(result);
    }
}
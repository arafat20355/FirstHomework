import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int side1 = x2 - x1;
        int side2 = y1 - y2;

        int area = side1 * side2;
        int perimeter = 2 * (side1 + side2);

        System.out.println("s = " + area);
        System.out.println("p = " + perimeter);
    }
}
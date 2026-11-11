
import java.util.Scanner;

public class point_location {
    public static void main(String[] args) {

        System.out.println("Enter coordinates (x, y)");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x:");
        int x = sc.nextInt();

        System.out.println("Enter y:");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Origin");

        } else if (x == 0) {
            System.out.println("On Y-axis");

        } else if (y == 0) {
            System.out.println("On X-axis");

        } else if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");

        } else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");

        } else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");

        } else {
            System.out.println("4th Quadrant");
        }
    }
}

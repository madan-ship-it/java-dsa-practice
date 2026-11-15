
package loops;

import java.util.Scanner;

public class a_raised_to_power_b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        int power = 1;
        int i = 0;

        while (i < b) {
            power = power * a;
            i++;
        }

        System.out.println(power);
    }
}

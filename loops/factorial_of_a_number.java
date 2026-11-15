package loops;

import java.util.Scanner;

public class factorial_of_a_number {
    public static void main(String[] args) {
        System.out.println("Write a Java program to calculate the factorial of a given number");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter any num to find its factorial :");
        int num=sc.nextInt();

        int fact=1;
        int i=1;
        while (i<=num) {
            fact*=i;
            i++;
        }
        System.out.println(fact);
    }
}

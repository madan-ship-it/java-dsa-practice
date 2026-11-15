package loops;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        System.out.println("Write a Java program to calculate the sum of all digits of a given number.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num :");
        int num=sc.nextInt();

        int sum=0;

        while (num!=0) {
            int digits=num%10;
            sum+=digits;
            num=num/10;
        }
        System.out.println(sum);
    }
}

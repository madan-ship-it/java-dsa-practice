package loops;

import java.util.Scanner;

public class reverse_of_a_number {
    public static void main(String[] args) {
        System.out.println("Write a Java program to reverse a given number.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num :");
        int num=sc.nextInt();

        int rev=0;

        while (num !=0) {
            int digits=num%10;
            rev=rev*10+digits;
            num=num/10;
        }
        System.out.println(rev);

    }
}

package loops;

import java.util.Scanner;

public class digits_of_a_number {
    public static void main(String[] args) {
        System.out.println(" Write a Java program to print all the digits of a given number. ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num ");
        int num=sc.nextInt();
        while (num!=0) {
            int digit=num%10;
            num=num/10;
            System.out.println(digit);
            
        }
    }
}

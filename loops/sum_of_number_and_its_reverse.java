package loops;

import java.util.Scanner;

public class sum_of_number_and_its_reverse {
    public static void main(String[] args) {
        System.out.println("Sum of Number & Its Reverse");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num :");
        int num=sc.nextInt();
        int original=num;
        int rev=0;

        while (num !=0) {
            int digits=num%10;
            rev=rev*10+digits;
            num=num/10;

        }
        original+=rev;
        System.out.println(rev);
        System.out.println(original);
    }
}

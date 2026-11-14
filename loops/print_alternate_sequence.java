package loops;

import java.util.Scanner;

public class print_alternate_sequence {
    public static void main(String[] args) {
        System.out.println("Write a Java program to print the following sequence: 1, n, 2, n-1, 3, n-2, ..");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();


        for(int i=1;i<=n;i++,n--){
            System.out.println(i);
            System.out.println(n);
        }
    }
}

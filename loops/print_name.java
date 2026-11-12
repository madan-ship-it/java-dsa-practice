package loops;

import java.util.Scanner;

public  class print_name{
    public static void main(String[] args) {
        System.out.println("Write a Java program that takes an integer n as input and prints \"Raghav\" exactly n times.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("raghav");
        }
    }
}
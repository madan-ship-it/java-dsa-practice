package loops;

import java.util.Scanner;

public class print_gp_1_to_n {
    public static void main(String[] args) {
        System.out.println("Write a Java program to display the following Geometric Progression (GP): 1, 2, 4, 8, ...");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
        int count=0;

        for(int i=1;count <n;i*=2){
            System.out.println(i);
            count ++;

        }
    }
}

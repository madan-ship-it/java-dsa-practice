package loops;

import java.util.Scanner;

public class arithmetic_progression {
    public static void main(String[] args) {
        System.out.println("Write a Java program to print the first n terms of an Arithmetic Progression.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println(2+i*3);
    
        }
     
    }
}
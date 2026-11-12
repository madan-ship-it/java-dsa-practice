package loops;

import java.util.Scanner;

public class print_n_to_1 {

    public static void main(String[] args) {
        System.out.println("Write a Java program that takes an integer n as input and prints numbers from n down to 1.");

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n :");
      int n=sc.nextInt();

      for(int i=n;i>=1;i--){
System.out.println(i);
      }
    }
}
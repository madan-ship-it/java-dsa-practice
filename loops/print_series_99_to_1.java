package loops;

import java.util.Scanner;

public class print_series_99_to_1 {

    public static void main(String[] args) {
        System.out.println("Write a Java program to print the following series:\n" + //
                        "\n" + //
                        "99, 95, 91, 87, ...");


                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter n :");
                        int n=sc.nextInt();

                        int count=0;

                        for(int i=99;i>0 && count<n;i-=4){
                            System.out.println(i);
                            count++;
                        }
    }
}
package basics;

import java.util.Scanner;

public class square_cube {
    public static void main (String[]args){
        int square,cube;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();

        square=a*a;
        cube = a * a * a;
        System.out.println(square);
        System.out.println(cube);
    }
}

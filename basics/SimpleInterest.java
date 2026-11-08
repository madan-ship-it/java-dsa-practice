package basics;

import java.util.Scanner;

public class SimpleInterest {
    public  static void main(String[]args){
        double si;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal :");
        double p=sc.nextDouble();
        System.out.println("Enter rate :");
        double r =sc.nextDouble();
        System.out.println("Enter Time :");
        double t=sc.nextDouble();
        si=(p*r*t)/100;
        System.out.println("Simple intrest :=>"+si);

    }
}

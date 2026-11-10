import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
       System.out.println("Write a Java program to check whether a given positive integer is a four-digit number or not.");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any num :");
       int num = sc.nextInt();       
       
       if (num >=1000 && num <=9999) {
        System.out.println("it is an 4 digit number ");
       }else{
        System.out.println("it is not and 4 digit number ");
       }
    }
}

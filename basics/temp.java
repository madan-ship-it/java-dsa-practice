package basics;

import java.util.Scanner;

public class temp {
 public static void main(String[]args){
    double fahrenheit;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter temperature in celsius :");
    double c =sc.nextDouble();
    
    fahrenheit=(c*9/5)+32;
System.out.println("Temperature in Fahrenheit: " + fahrenheit);
 }   
}

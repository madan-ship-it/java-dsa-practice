import java.util.Scanner;

public class triangle_sides {
 public static void main(String[] args) {
    System.out.println("Take 3 positive integers as input and check whether they can form a triangle or not.");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter side a :");
    int a=sc.nextInt();
    System.out.println("Enter side b :");
    int b=sc.nextInt();
    System.out.println("Enter side c :");
    int c=sc.nextInt();


    if (a > 0 && b > 0 && c > 0 &&
    a < b+c && b < a+c && c < a+b) {
     System.out.println("yes they can form a triangle");    
    }else{
    System.out.println("no the triangle cant be formed");
    }

 }   
}

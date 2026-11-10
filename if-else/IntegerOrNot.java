import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        System.out.println("Java program to check whether the given number is an integer or not.");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter anything to check weather it is integer or not ");
        double n=sc.nextDouble();

        int x=(int)n;
        if (n-x==0) {
            System.out.println(" integer ");
        }else{
            System.out.println("not an integer ");
        }
    }
}

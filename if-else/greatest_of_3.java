import java.util.Scanner;

public class greatest_of_3 {
    public static void main(String[] args) {
        System.out.println("wap to find which value is greater ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter b :");
        int b=sc.nextInt();
        System.out.println("Enter c :");
        int c=sc.nextInt();


        if (a>=b && a>=c) {
            System.out.println("a is greater ");
        }else if (b>=a && b>=c){
            System.out.println("b is greater ");
        }else{
            System.out.println("c is greatest ");
        }
    }
}

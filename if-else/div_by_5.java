import java.util.Scanner;

public class div_by_5 {
    public static void main(String[] args) {
        System.out.println("programe to check weather a num is divisible by 5 or not :");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num :");
        int num=sc.nextInt();

        if (num % 5==0) {
            System.out.println("num is divisible by 5 ");
        }else{
            System.out.println("num is not divisible by 5");
        }
    }
}

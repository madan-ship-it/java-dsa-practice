import java.util.Scanner;
public class turnery_even_odd {
    public static void main(String[] args) {
        System.out.println("wap to check weather a num is even or odd using turnery operator ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num  :");
        int num=sc.nextInt();

        String res=num%2==0?" even ": "odd";
        System.out.println(res);
    }
}

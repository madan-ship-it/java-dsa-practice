import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println("Absolute Value of Integer");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num ");
        int num=sc.nextInt();

        if (num<0) {
            System.out.println(num*(-1));
        }else if(num==0){
            System.out.println("zero");
        }else{
            System.out.println(num);
        }
    }
}

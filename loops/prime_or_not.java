package loops;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        System.out.println("wap to check weather it is prime or not :");
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter num you want to check weather it is prime or not :");
        int num=sc.nextInt();

        boolean prime=false;

        if (num<=1) {
            System.out.println("not prime");
        }else{
            for(int i=2;i<num;i++){
                if (num % i ==0) {
                    prime=true;
                    break;
                }
            }
            if (prime) {
                System.out.println("not prime");
            }else{
                System.out.println("prime");
            }
        }
    }
}

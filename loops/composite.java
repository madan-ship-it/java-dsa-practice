package loops;

import java.util.Scanner;

public class composite {
    public static void main(String[] args) {
        System.out.println("wap to check weather it is prime or not :");
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter num you want to check weather it is prime or not :");
        int num=sc.nextInt();

        boolean composite=false;

        if (num<=1) {
            System.out.println("niether  prime nor composite " );
        }else{
            for(int i=2;i<num;i++){
                if (num % i ==0) {
                    composite=true;
                    break;
                }
            }
            if (composite) {
                System.out.println("composite");
            }else{
                System.out.println("not composite");
            }
        }
    }
}

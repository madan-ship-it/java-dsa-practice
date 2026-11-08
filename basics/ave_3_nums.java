package basics;

import java.util.Scanner;

public class ave_3_nums {
    public  static void main(String[]args){
        int ave;
Scanner sc= new Scanner(System.in);
System.out.println("Enter num1 :");
int num1=sc.nextInt();
System.out.println("Enter num2 :");
int num2=sc.nextInt();
System.out.println("Enter num3 :");
int num3=sc.nextInt();
ave=(num1+num2+num3)/3;
System.out.println(ave);
    }
    
}

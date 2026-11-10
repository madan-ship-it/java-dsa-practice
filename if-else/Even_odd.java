import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
   
         System.out.println("programe to check weather an number is even or odd :");
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a num :");
         int num=sc.nextInt();

         if (num %2==0) {
            System.out.println("number is even ");
         }else{
            System.out.println("number is odd ");
         }
    }
}

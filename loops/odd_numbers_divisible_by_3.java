package loops;
public class odd_numbers_divisible_by_3 {
public static void main(String[] args) {
 System.out.println("Write a Java program using a for loop to print all odd numbers divisible by 3 (from 1 to 100)");  
 
 for(int i=1;i<=100;i+=2){
    if (i %3==0) {
        System.out.println("odd numbers from 1 - 100 : "+i);
    }
 }
}
}
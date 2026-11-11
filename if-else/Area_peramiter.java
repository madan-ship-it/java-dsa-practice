import java.util.Scanner;

public class Area_peramiter {
    public static void main(String[] args) {
            
            System.out.println("Take the length and breadth of a rectangle as input and write a program to find whether the area of the rectangle is greater than its perimeter.");
            double area,peramiter;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of rectangle :");
            double  l=sc.nextDouble();
            System.out.println("Enter breadth of rectangle :");
            double  b=sc.nextDouble();
           
            area=l*b;
            peramiter=2*(l+b);

            if (area > peramiter) {
                System.out.println("yes the area of rectangle is greater than the area of peramiter ");
            } else if (area==peramiter){
                System.out.println("both are equall");
            }
            else{
                System.out.println("no the peramiter is greater than area ");
            }


            

        
    }
}

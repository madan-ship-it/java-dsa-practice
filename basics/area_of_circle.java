package basics;

import java.util.Scanner;

public class area_of_circle {
    public static void main(String[]args){
    double area;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter radius :");
     int r=sc.nextInt();
     area=3.14*r*r;
     System.out.println("area of circle =>"+area);
     

        }
}

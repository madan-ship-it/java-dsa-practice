import java.util.Scanner;

public class magnitude {
    public static void main(String[] args) {
        System.out.println("Magnitude less than 69");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num :");
        int num=sc.nextInt();

    if ((num >= 0 && num < 69) || (num < 0 && num > -69)) {
    System.out.println("Magnitude less than 69");
} else {
    System.out.println("Magnitude is not less than 69");
}
    }
}

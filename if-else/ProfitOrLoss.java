import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        System.out.println("Java program to calculate whether a seller makes a profit, suffers a loss, or has no profit/no loss using cost price and selling price.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price of product :");
        double cost_price=sc.nextDouble();
        System.out.println("Enter selling price of product :");
        double selling_price=sc.nextDouble();

        if (selling_price > cost_price) {
            System.out.println((selling_price-cost_price) + " => Profit");
        }else if(cost_price==selling_price){
           System.out.println("No profit, no loss");
        }else{
            System.out.println((cost_price-selling_price) + " => Loss");
        }
    }
}

//David W

package neww;

import java.util.Scanner;

public class lab2 {
	public static final double commission = 0.02;

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        
        //initial price
        
      	System.out.println("Initial price per share during stock purchase:");
        double Iprice = key.nextDouble();
        key.nextLine();
        
		//number of shares bought

        System.out.println("Number of shares purchased:");
        double shares = key.nextDouble();
        key.nextLine();

        
    	//exit if you sell more than you own
        
        
        if (shares <= 0) {
            System.out.println("Error: Invalid number of shares purchased.");
            System.exit(0);
    }
        
      //price of each

        System.out.println("Price of each share when stock is sold:");
        double price = key.nextDouble();
        key.nextLine();

    	//number of shares sold
        
        System.out.println("Number of shares sold:");
        double numsharesold = key.nextDouble();
        key.nextLine();

        if (numsharesold > shares || numsharesold <= 0) {
            System.out.println("Error: Invalid number of shares to sell. Exiting the program!");
            System.exit(0);
        }

        // Calculate totals
        double tpurchasecost = Iprice * shares;
        double totalsalesamount = price * numsharesold;
        
        
        double purchasecommission = tpurchasecost * commission;
        double salecommission = totalsalesamount * commission;
        
        
        //commisions stuff
        System.out.println("Commission paid during purchase: $" + purchasecommission);
        System.out.println("Commission paid during sale: $" + salecommission);

        
        //sales and purchase
        System.out.println("Total cost for all shares purchased: $" + tpurchasecost);
        System.out.println("Total sales amount: $" + totalsalesamount);
     

double profit;

        if (shares == numsharesold) {
            // Sold all shares
            profit = totalsalesamount - (tpurchasecost + purchasecommission + salecommission);
} else {
            // less shares than bought
            double cshares = Iprice * numsharesold;
            profit = totalsalesamount - (cshares + purchasecommission + salecommission);
    }
        
        //last part required

        if (profit > 0) {
            System.out.println("Profit was made: $" + profit);
        } else if (profit < 0) {
            System.out.println("Loss was made: $" + profit);
}


        key.close();
    }
}

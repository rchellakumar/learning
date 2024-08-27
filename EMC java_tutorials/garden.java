import java.util.Scanner;

public class garden {

    // Define app_price and app_count as instance variables
    int app_price;
    int app_count;

    // Method to calculate total amount
    int total_amt(int x, int y) { 
        return x * y; 
    }

    // Method to get input values
    void getvar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of apple: ");
        app_price = scan.nextInt();
        try{
        Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Uncaught interupption: "+e.getMessage());
        }
        System.out.println("Enter the number of apples you want: ");
        app_count = scan.nextInt(); // Assign value to instance variable
        System.out.println("Calculating the total price, please wait...");
        try {
            Thread.sleep(1250); // Pause execution for 5 seconds (5000 milliseconds)
        } catch (InterruptedException e) {
            System.out.println("An error occurred during the delay.");
        }
        scan.close();
    }
        
    public static void main(String[] args) {
        garden obj = new garden();
        obj.getvar(); // Call the getvar method to set app_price and app_count
        System.out.println("Total amount: " + obj.total_amt(obj.app_count, obj.app_price));
    }
}

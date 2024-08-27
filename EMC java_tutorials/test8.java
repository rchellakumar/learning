/* Get Input for a number and find it is even or
odd Number. */


import java.util.Scanner;


public class test8 {
    public static void main(String[] args) {
        java.util.Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to find wheather it is even or odd: ");
        int num=scan.nextInt();
        if (num%2==0)
        {
            System.out.println("It is Even!");
        }
        else{
            System.out.println("It is odd!");
        }
    }    
}

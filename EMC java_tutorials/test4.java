/*Get a input from user, for the variable called
RCB.
= Win Print("Ee sala cup Namdhey")
If RCB =
- loose Print("cup illa")
if RCB -= */
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Say wheather RCB will win or lose! ");
        String fdecision=scan.nextLine();
        if (fdecision.equals("win")){
            System.out.println("Esala Cup Namade!!");
        }
        else if(fdecision.equals("lose")){
            System.out.println("Cup ledhu bhaiya!!");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}

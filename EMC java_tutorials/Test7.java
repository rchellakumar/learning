/* Get input for a number and check whether it is
divisible by both 3 and 5 or not. if yes then
print, the number is divisible by 3 and 5 print
the number is not divisible by 3 and 5. */


import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number that can be divisible by 3 & 5: ");
    int num=scan.nextInt();
    if (num%3==0 && num%5==0)
    {
        System.out.println("It is divisible by 3 & 5!");
    }
    else{
        System.out.println("It can't be divisible by 3 & 5");
    }
    scan.close();
}
}

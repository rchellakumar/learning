/*Create a class called "Find" with main function
Create a function called evenorodd with
integer parameter called int num
Inside Main function get integer input from
user.
Pass that input to the evenorodd function and
let the function decide whether the number is
even or odd */

import java.util.Scanner;
public class excer1 {
    protected void evenorodd(int x){
        if (x%2==0){
            System.out.println("The number "+x+" is Even!!");
        }
        else{
            System.out.println("The number "+x+" is Odd!!");
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to find its even or odd! ");
        int num=scan.nextInt();
        scan.close();
        excer1 obj1=new excer1();
        obj1.evenorodd(num);
    }
}

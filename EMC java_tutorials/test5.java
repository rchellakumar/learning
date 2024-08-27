


import java.util.Scanner;


public class test5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your mark to know wheather you pass or fail!   ");
        int mark=scan.nextInt();
        if (mark>=35&&mark<=100)
        {
            System.out.println("You are Pass!");
        }
        else if(mark<35)
        {
            System.out.println("You are Fail!");
        }
        else{
            System.out.println("Invalid Input!");
        }
        scan.close();
    }
    
}

/* Get input for salary and age.
If salary greater than or equal to 20000 or age
less than or equal to 25,
get input for required loan amount. If not print
you are not eligible for
loan.
If required loan amount is less than or equal
to 50,000 print You are
eligible for loan. If it is greater than 50,000
print maximum loan amount
is 50000. */

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        int salary=scan.nextInt();
        System.out.print("Enter your Age: ");
        int age=scan.nextInt();
      
        boolean res;
        if (salary>=20000 && age>=25)
        {
            System.out.println("You are eligible for Loan!");
            System.out.println("Do you want loan or not, y / n");
            scan.nextLine();
            String input = scan.nextLine(); 
            char cres=input.charAt(0);
            if (cres=='y')
            {
                res=true;
            }
            else
            {
                res=false;
            }
            if (res){
                System.out.print("Enter Your required loan amount: ");
                int loanamt=scan.nextInt();
                if (loanamt<=50000)
                {
                    System.out.println("Your loan amount will be sanctioned soon!!");
                }
                else{
                    System.out.println("Not Possible for loan amount: "+loanamt+"\n You are eligible for only 50,000");
                }
            }
            else{
                System.out.println("Okay Sir!, if you have any change, please visit our website www.loanbank.com/");

            }
        }
        else if (salary<25000 && age<25)
        {
            System.out.println("You are not eligible for loan because the criteria for loan is minimum salary 25,000 & minimum age 25");
        }
        else if(salary<20000){
            System.out.println("You are not eligible for loan!!\n Minimum required salary for loan is: 20,000");
        }
        else if(age<25){
            System.out.println("You are not eligible for loan \n Minimum age limit to avail loan is 25");
        }
    }
}

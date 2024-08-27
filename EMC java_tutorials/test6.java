/* Get input for Variable Income. if Income is
greater than 7000 scholarship is available.
Else not eligible for scholarship. */



import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your salary to know if you are eligible for scholorship or not! ");
        int income=scan.nextInt();

        if (income>=7000)
        {
            System.out.println("Your are eligible!!");
        }
        else{
            System.err.println("You are not eligible!");
        }

    }
}

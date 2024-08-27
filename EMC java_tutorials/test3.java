/*4. Get Input or varia es: Name, Score, epartment. Lett e user
enter the score for 100 Marks, you convert it for IO and print it.
Sample Input:
John
56
Computer
Sample Output:
My name is John
My score is 5.6/10
My department is Computer */


import java.util.Scanner;


public class test3 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter Your Name:");
        String name=scan.nextLine();

        System.out.println("Enter Your Score for 100: ");
        double a=scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter Your Dept. name: ");
        String dept=scan.nextLine();

        double b=a/10;

        System.err.println("\n Your name is: "+name);
        System.err.println("Your Score is "+b);
        System.err.println("Your Dept. is : "+dept);

    }    
}

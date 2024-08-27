import java.util.Scanner;




//edit of the file to check wheather the commit is functioning well
public class testloop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();
        int b=scan.nextInt();
        if (a==b || a>b)
        {
            System.out.println("Enter the num1 smaller than num2!");
        }
        for (int i=a;i<=b;i++)
        {
            System.out.println("Number: "+i);
        }
    }
    
}

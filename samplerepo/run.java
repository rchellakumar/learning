package learning.samplerepo;
import java.util.Scanner;


public class run{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a =35;
        int b=55;
        int c=a+b;
        int d=scan.nextInt();
        int e=c/d;
        scan.close();
        System.out.println("This is a sample file git repo");
        System.out.println("The answer is: "+c+e);
    }
}

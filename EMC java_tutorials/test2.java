/* 3.Get input for 3 integer variables: a,b and c. Now multiply all
varableq and store it in d. Now add all variables and store it in e.
Now divide d by e.
Sample Input:
10
20
10
Sample Output:
50*/ 


import java.util.Scanner;


public class test2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter 1st Num: ");
        int a=scan.nextInt();
       
        System.out.println("Enter 2nd Num: ");
        int b=scan.nextInt();
        
        System.out.println("Enter 3rd Num: ");
        int c=scan.nextInt();

        int d=a*b*c;
        int e=a+b+c;

        System.err.println("Output: \n"+d/e);
    }
    
}

import java.util.Scanner;

public class factorial1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int num=scan.nextInt();
        scan.close();
        System.out.println(factorial(num));
    }
     public static int factorial(int n){

           if(n==1){
                return 1;
            }
            return n*factorial(n-1);
    }
    
}

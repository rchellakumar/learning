import java.util.Scanner;




public class testloop2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int count=0;
        if (a==b || a>b)
        {
            System.out.println("Enter the num1 smaller than num2!");
        }
        for (int i=a;i<=b;i++)
        {
            if (i%2==0){
                System.out.println("Number: "+i);
                count++;
            }
        }
        System.out.println("Total Count: "+count);
    }
}

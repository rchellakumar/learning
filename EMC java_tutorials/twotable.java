import java.util.Scanner;


public class twotable {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the number table you want to know: ");
       int table=scan.nextInt();
       System.out.println("Enter the tabel limit: ");
       int limit=scan.nextInt();

       for (int i=1;i<=limit;i++)
       {
        System.out.println(table+" x "+i+" = "+i*table);
       }
       

    }
}

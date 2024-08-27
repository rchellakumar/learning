/* get input for five subjects marks. Add all of it,
And find average. If
average mark is less than 35. Print "Additional
class is required" else
Print "you are good to go" */
import java.util.Scanner;


public class test11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your five Subject marks!: ");
        int s1=scan.nextInt();
        int s2=scan.nextInt();
        int s3=scan.nextInt();
        int s4=scan.nextInt();
        int s5=scan.nextInt();
        double total=s1+s2+s3+s4+s5;
        
        double avg=total/5;
        if (avg<35)
        {
            System.out.println("Total Marks: "+total);
            System.out.println("Percentage: "+avg+"%");
            System.out.println("Grade: -A");
        }
        else if(avg>=35 && avg<=60)
        {
            System.out.println("Total Marks: "+total);
            System.out.println("Percentage: "+avg+"%");
            System.out.println("Grade: B");
        }
        else if(avg>60 && avg<=75)
        {
            System.out.println("Total Marks: "+total);
            System.out.println("Percentage: "+avg+"%");
            System.out.println("Grade: A");
        }
        else if(avg>75 && avg<=90)
        {
            System.out.println("Total Marks: "+total);
            System.out.println("Percentage: "+avg+"%");
            System.out.println("Grade: A+");
        }
        else if(avg>90 && avg<=100)
        {
            System.out.println("Total Marks: "+total);
            System.out.println("Percentage: "+avg+"%");
            System.out.println("Grade: A++");
        }

    }
    
}


import java.util.Scanner;
import java.util.Arrays;

public class testarray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] numbers=new int[5];
        int total=0;
        for (int i=0;i<numbers.length;i++){
            System.out.println("Enter integer "+(i+1)+" : ");
            numbers[i]=scan.nextInt();
        }
        for (int number:numbers)
        {
            total+=number;
        }
        System.out.println("Total Numbers: "+total);
        double avg=(double) total/numbers.length;
        System.out.println("Average of no. : "+avg);
        System.out.println("Integer Numbers: "+Arrays.toString(numbers));
    }
}

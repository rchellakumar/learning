import java.util.Scanner;
import java.util.Arrays;
public class testarray2 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=scan.nextInt();
        int key=0;
        if (size%2==1){
            key=size/2;
        }
        else{
            key=size/2-1;
        }
        System.out.println(key);
        int[] number=new int[size];
        for (int i=0;i<number.length;i++){
            System.out.println("Enter the Element "+(i+1)+" : ");
            number[i]=scan.nextInt();
        }
        
        System.out.println("Array Elements: "+Arrays.toString(number));
        System.out.println("The center of the array: "+number[key]);
    }
    
}

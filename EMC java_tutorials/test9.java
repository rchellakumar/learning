/*I can get Video game if i score >35
I can get Iphone if i score > 60
I can get MacBook Pro if i score > 90 */
import java.util.Scanner;




public class test9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your mark kid!: ");
        int mark=scan.nextInt();
        if (mark>=35)
        {
            if(mark>=60){
                if(mark>=90)
                {
                    System.out.println("You can avail Mac Book!");
                }
                else{
                    System.out.println("You can avail Iphone!");
                }
            }
            else{
                System.out.println("You can avail Video Game!");
            }
        }
        else{
            System.out.println("You can't avail anything!!");
        }
    }
    
}

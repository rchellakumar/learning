/*Create a class called "School" with main
function
Create a function called passorfail which
should return the string "Pass/Fail"
Inside Main function get integer input from
user for total mark.
Pass that input to the passorfail function and
let the function decide whether student is
oassorfail */
import java.util.Scanner;



public class excer2 {
    String passorfail(int mk){
        if (mk>=35){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter your mark kid: ");
      int mark=scan.nextInt();
      excer2 obj1=new excer2();
      String result=obj1.passorfail(mark);
      if (result.equals("Pass")){
        System.out.println("Hurray!!,You are Pass!!");
      }
      else{
        System.out.println("You are fail!");
      }
      excer1 objex2=new excer1();
      objex2.evenorodd(mark);
    
    }
}

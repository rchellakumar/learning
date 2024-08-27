/*Get a input from user, for the variable called
meghana.
If meghana is "dead" Print("Surya meets
Ramya")
else
Print("surya weds meghana") */
import java.util.Scanner;

public class teststr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Say Meghana is \"DEAD\" or \"ALIVE\"  ");
        String meghana=scan.nextLine();   
        if (meghana.equals("dead"))
        {
            System.out.println("Suriya meets Ramya");
        }
        else if(meghana.equals("alive"))
        {
            System.out.println("Suriya weds meghana");
        }
        else{
            System.out.println("Invalid Input!!");
        }

    }
}

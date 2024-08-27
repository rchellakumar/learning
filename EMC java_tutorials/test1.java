/*I.Get input for variable: Name and Age.
Prnit it
Sample Input:
John
24
Sample Output:
My name is John
My age is 24*/

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);

        System.out.println("Enter Your Name; ");
        String name=get.nextLine();

        System.out.println("Enter Your Age: ");
        int age=get.nextInt();

        get.nextLine();

        System.out.println("Enter Your Address: ");
        String Address=get.nextLine();

        

        System.out.println("Hi, "+name+'!'+" Your are "+age+" years old.\n"+"Address: "+Address);
        get.close();
    }
    
}

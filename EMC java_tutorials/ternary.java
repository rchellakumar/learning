

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter true or false for rain!");
        String input=scan.nextLine();
        boolean userboolean=Boolean.parseBoolean(input);
        boolean rain=false;
        String result=userboolean ? "Get an umbrella with you!" : "Enjoy the sunshine!";
        System.err.println(result);
    }
}

/* Question: What is the score in a game.
- If the score is less than 50, print "YOU need
to improve. I
If the score is between 50 and 70
(inclusive), print "Good job!"
- If the score is greater than 70, print
'Excellent performance!' */
import java.util.Scanner;


public class test10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Score: ");
        int score=scan.nextInt();
        if (score<50)
        {
            System.out.println("Need to improve!");
        }
        else if(score>=50 && score<=70)
        {
            System.out.println("Good Job!");
        }
        else if(score>=70 && score<=100)
        {
            System.out.println("Excellent Performance!");
        }
        
    }
}

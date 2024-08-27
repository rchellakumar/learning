import java.util.Scanner;

public class NumberToWords {

    // Array to store words for single digit numbers

    private static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    // Array to store words for two digit numbers from 10 to 19

    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    // Array to store words for multiples of ten from 20 to 90

    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println(convertToWords(number));
        }
    }

    private static String convertToWords(int num) {
        if (num < 0) {
            return "Minus " + convertToWords(-num);
        }

        String words = "";
        if((num / 1000000000) > 0) {
            words+= convertToWords(num/1000000000) + " Billion ";
            num%=1000000000;
        }

        if ((num / 1000000) > 0) {
            words += convertToWords(num / 1000000) + " Million ";
            num %= 1000000;
        }

        if ((num / 1000) > 0) {
            words += convertToWords(num / 1000) + " Thousand ";
            num %= 1000;
        }

        if ((num / 100) > 0) {
            words += convertToWords(num / 100) + " Hundred ";
            num %= 100;
        }

        if (num > 0) {
            if (num < 10) {
                words += ones[num];
            } else if (num < 20) {
                words += teens[num - 10];
            } else {
                words += tens[num / 10];
                if ((num % 10) > 0) {
                    words += "-" + ones[num % 10];
                }
            }
        }

        return words.trim();
    }
}

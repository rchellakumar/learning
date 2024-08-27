public class makeexcept{
    public static void main(String[] args) {
        try{
            // Voluntarily create an error: Divide by zero
            int numerator = 10;
            int denominator = 0;
            
            // This will cause an ArithmeticException (division by zero)
            int result = numerator / denominator;
            
            // This line will not be executed if an exception occurs
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("An error has Occured: "+e.getMessage()+e.hashCode());
        }
        System.out.println("Program will starts to flow after the error has been resolved!, don't worry dev. soon everything will be back to normal!!");
        
    }
}

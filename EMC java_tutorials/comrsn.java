public class comrsn {
    public static void main(String[] args) {
        
        int a=20;
        int b=25;
        int c=50;


        if (a>c){
            if (a>b){
                System.out.println("A is Greater than b!");
            }
            System.out.println("A is Greater than c!");
        }
        else if (b>a) {
            if(b>c)
            {
                System.out.println("B is greater than C");
            }
            System.out.println("B is greater than A!");
        }
        else{
            System.out.println("C is ultimately Greater!!");
        }
    }
    
}

public class encap {
    static void greeting()
    {
        System.out.println("Vanakkam!");
       
    }
    void dummy(){
        System.out.println("I am dummy!");
        greeting();
    }
    public static void main(String[] args) {
        encap obj1=new encap();
        obj1.dummy();
    }
}

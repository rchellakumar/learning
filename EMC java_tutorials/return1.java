public class return1 {

    private String getname(){
        return "ChellaKumar";
    }
    private long getphone(){
        return 7299333375L;
    }
    public static void main(String[] args) {
        return1 obj1=new return1();
        String name=obj1.getname();
        long pho=obj1.getphone();
        System.out.println("My name is: "+name+"\nMy phone number: "+pho);
    }
}

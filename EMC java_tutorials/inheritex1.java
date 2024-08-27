/*Step l:
Crege a Class Named Animal:
Add a field called name of type String.
Add a field called age of type int.
Add a method called makesound() that prints
"Animal makes a sound".

Step 2:
Create a Subclass Named Dog that Inherits from
Animal:
Add a field called breed of type String.
Override the makesound() method to print "Dog
barks".
Add a method called fetch() that prints "Dog is
fetching"

Step 3:
Create a Subclass Named Cat that Inherits from
Animal:
Add a field called color of type String.
Override the makesound() method to print 'Cat
meows".
Add a method called climb() that prints "Cat is
climbing"*/


public class inheritex1 {
    public static void main(String[] args) {
        inheritex1 ih1=new inheritex1();
        inheritex1.dog d1=ih1.new dog();
        inheritex1.cat c1=ih1.new cat();
        d1.name="Jacky";
        d1.age=5;
        d1.type="Dog";
        d1.breed="PitBull";
        System.out.println("Animal kind: "+d1.type+"\n    Name: "+d1.name+"\n    Age: "+d1.age+"\n    Breed: "+d1.breed);
        d1.makesound();
        d1.fetch();
        c1.name="Lucy";
        c1.age=3;
        c1.type="Cat";
        c1.color="White & Brown";
        System.out.println("Animal kind: "+c1.type+"\n    Name: "+c1.name+"\n    Age: "+c1.age+"\n    Color: "+c1.color);
        c1.makesound();
        c1.climb();
    }
    public class Animal{
        String name;
        int age;
        String type;
        void makesound(){
            System.out.println("Animals make sound");
        }
    }
    class dog extends Animal{
        String breed;
        @Override
        void makesound() {
            // TODO Auto-generated method stub
            System.out.println("    Dog Barks");
        }
        void fetch(){
            System.out.println("    Dog is fetching...");
        }
    }
    class cat extends Animal{
        String color;
        @Override
        void makesound() {
            System.out.println("    meow....");
        }
        void climb(){
            System.out.println("    cat is climbing!!!");
        }
    }

}

package sirkequestion;
public class Abstraction1 {
    public static void main(String[] args) {
        Dog D1 = new Dog();
        D1.animalSound();
        D1.sleep();
    }
    
}

abstract class Animal {
   public abstract void animalSound();
    
   public void sleep (){
       System.out.println("Animals is Sleeping");
   }
   
}

class Dog extends Animal {
       public void animalSound (){
            System.out.println("The Dog was : Boo Boo");
}
}
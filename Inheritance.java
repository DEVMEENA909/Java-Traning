public class Inheritance {
        public static void main(String args[]){
            Dog bullDog = new Dog("Black");
            bullDog.eat();
            bullDog.bark();
            Jerman jerman = new Jerman("Brown");
            jerman.eat();
            jerman.danger();
        }    
}
// Base class
class Animal{
    String color;
    void eat(){
        System.out.println("It eats");
    }
    void breathe(){
        System.out.println("it breathes");
    }
}
// Derived class / Subclass
class Dog extends Animal{
    Dog(String color){
        super.color = color;
        System.out.println("Color is: "+super.color);
    }
    void bark(){
        System.out.println("barks");
    }
}
class Jerman extends Dog{
    Jerman(String color){
        super(color);
    }
    void danger(){
        System.out.println("Dangerous");
    }
}

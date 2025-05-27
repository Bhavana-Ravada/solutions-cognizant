class Animal{
    void makeSound(){
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }

}
public class Inheritance {
        public static void main(String[] args) {
            Dog ob= new Dog();
            ob.makeSound();
            
        }
    
}

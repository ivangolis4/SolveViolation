public class Main {

    public static void main(String[]args){

        AnimalManager manager = new AnimalManager();
        Dog dog = new Dog();
        Cat cat = new Cat();

        manager.makeSound(dog);  // Prints "Woof woof!"
        manager.makeSound(cat);  // Prints "Meow meow!"
    }
}
    
    


class AnimalManager {
    public void makeSound(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).sound();
        } else if (animal instanceof Cat) {
            ((Cat) animal).sound();
        } else {
            animal.sound();
        }
    }
}
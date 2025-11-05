public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever", "Big France King");
        Cat cat = new Cat("Whiskers", 2, "Black");
        Bird bird = new Bird("Tweety", 1, true, "Pinky Canan");
        Bird penguin = new Bird("Pingu", 4, false, "Penuina King");

        Animal[] animals = {dog, cat, bird, penguin};

        System.out.println("=== ANIMAL WORLD ===");
        for (Animal animal : animals) {
            animal.eat();
            animal.makeSound();

            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Cat) {
                ((Cat) animal).climb();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }

            System.out.println("---");
        }
    }
}
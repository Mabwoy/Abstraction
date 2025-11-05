public class Dog extends Animal {
    private String breed;
    private int legs;

    public Dog(String name, int age, String breed, String type) {
        super(name, age,type);
        this.breed = breed;
        this.legs =legs;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}
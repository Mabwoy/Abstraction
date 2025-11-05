public class Bird extends Animal {
    private boolean CanFly;

    public Bird(String name, int age, boolean canFly, String type) {
        super(name, age, type);
        this.CanFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet Tweet!");
    }

    public void fly() {
        if (CanFly) {
            System.out.println(name + " is flying high!");
        } else {
            System.out.println(name + " cannot fly");
        }
    }
}
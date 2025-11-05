public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly, String type) {
        super(name, age, type);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet Tweet!");
    }

    public void fly() {
        if (canFly) {
            System.out.println(name + " is flying high!");
        } else {
            System.out.println(name + " cannot fly");
        }
    }
}
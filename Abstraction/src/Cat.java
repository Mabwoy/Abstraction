public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age, color);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }

    public void climb() {
        System.out.println(name + " is climbing the tree");
    }
}
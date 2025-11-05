public class Cat extends Animal {
    private String color;
    private String sex;

    public Cat(String name, int age, String color) {
        super(name, age, color);
        this.color = color;
        this.sex = sex;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }

    public void climb() {
        System.out.println(name + " is climbing the tree");
    }
}
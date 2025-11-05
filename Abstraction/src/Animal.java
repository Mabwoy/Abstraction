abstract class Animal {
    protected String name;
    protected int age;
    protected String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println(name + " is eating");
    }
}
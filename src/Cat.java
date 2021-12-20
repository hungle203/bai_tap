public class Cat extends Animal implements AnimalInterface {
    private String hunting;

    public Cat() {
    }

    public Cat(String name, int age, double weigh, String hunting) {
        super(name, age, weigh);
        this.hunting = hunting;
    }

    public String getHunting() {
        return hunting;
    }

    public void setHunting(String hunting) {
        this.hunting = hunting;
    }

    @Override
    public int run() {
        return 10;
    }

    @Override
    public String makeSound() {
        return "Mew Mew!!";
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                "hunting='" + hunting + '\'' +
                '}';
    }
}

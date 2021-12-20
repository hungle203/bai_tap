public class Dog extends Animal implements AnimalInterface{
    private String sleep;
    public Dog() {
    }

    public Dog(String name, int age, double weigh, String sleep) {
        super(name, age, weigh);
        this.sleep = sleep;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    @Override
    public int run() {
        return 6;
    }

    @Override
    public String makeSound() {
        return "Gâu Gâu!!";
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "sleep='" + sleep + '\'' +
                '}';
    }
}

public class Mouse extends Animal implements AnimalInterface {
    private double speed;
    public Mouse() {
    }

    public Mouse(String name, int age, double weigh, double speed) {
        super(name, age, weigh);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public int run() {
        return 3;
    }

    @Override
    public String makeSound() {
        return "Chít chít";
    }

    @Override
    public String toString() {
        return "Mouse{" + super.toString() +
                "speed=" + speed +
                '}';
    }
}

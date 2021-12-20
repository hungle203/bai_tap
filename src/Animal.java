public class Animal {
private String name;
private int age;
private double weigh;

    public Animal() {
    }

    public Animal(String name, int age, double weigh) {
        this.name = name;
        this.age = age;
        this.weigh = weigh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigh=" + weigh +
                '}';
    }
}

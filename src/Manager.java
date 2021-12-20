import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager implements AnimalInterface {
    private ArrayList<Animal> animals;
    private final Scanner scanner = new Scanner(System.in);

    public Manager() {
        this.animals = new ArrayList<>();
    }

    public void displayAll() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Animal deleteByName(String name) {
        Animal animal = null;
        for (Animal animal1 : animals) {
            if (animal1.getName().equals(name)) {
                animal = animal1;
            }
        }
        animals.remove(animal);
        return animal;
    }

    public Animal displayByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;

    }

    public Animal updateByName(String name) {
        Animal animalUpdate = null;
        Cat catUpdate = null;
        Dog dogUpdate = null;
        Mouse mouseUpdate = null;

        for (Animal animal : animals) {
            if (animal.getName() == name && animal instanceof Cat && animal instanceof Dog && animal instanceof Mouse) {
                catUpdate = (Cat) animal;
                dogUpdate = (Dog) animal;
                mouseUpdate = (Mouse) animal;
                }else if (animal.getName() == name) {
                animalUpdate = animal;
            }
            if (animalUpdate != null) {
                System.out.println("Nhập tên mới: ");
                name = scanner.nextLine();
                if (name.equals("")) {
                    animalUpdate.setName(animalUpdate.getName());
                } else {
                    animalUpdate.setName(name);
                    System.out.println("Nhập tuổi mới: ");
                    animalUpdate.setAge(scanner.nextInt());
                    System.out.println("Nhập cân nặng mới: ");
                    animalUpdate.setWeigh(scanner.nextDouble());
                    scanner.nextLine();
                    return animalUpdate;
                }
            } else if (catUpdate != null) {
                System.out.println("Nhập tên mới: ");
                catUpdate.setName(scanner.nextLine());
                System.out.println("Nhập tuổi mới: ");
                catUpdate.setAge(scanner.nextInt());
                System.out.println("Nhập vào cân nặng mới: ");
                catUpdate.setWeigh(scanner.nextDouble());
                System.out.println("Cập nhập trạng thái mới: ");
                catUpdate.setHunting(scanner.nextLine());
                scanner.nextLine();
                return catUpdate;
            } else if (dogUpdate != null) {
                System.out.println("Nhập tên mới: ");
                dogUpdate.setName(scanner.nextLine());
                System.out.println("Nhập tuổi mới: ");
                dogUpdate.setAge(scanner.nextInt());
                System.out.println("Nhập vào cân nặng mới: ");
                dogUpdate.setWeigh(scanner.nextDouble());
                System.out.println("Cập nhập trạng thái mới: ");
                dogUpdate.setSleep(scanner.nextLine());
                scanner.nextLine();
                return dogUpdate;
            } else if (mouseUpdate != null) {
                System.out.println("Nhập tên mới: ");
                mouseUpdate.setName(scanner.nextLine());
                System.out.println("Nhập tuổi mới: ");
                mouseUpdate.setAge(scanner.nextInt());
                System.out.println("Nhập vào cân nặng mới: ");
                mouseUpdate.setWeigh(scanner.nextDouble());
                System.out.println("Cập nhập trạng thái mới: ");
                mouseUpdate.setSpeed(scanner.nextDouble());
                scanner.nextLine();
                return mouseUpdate;
            }
        }
        return null;
    }

    public Animal createAnimal(Scanner scanner, int choice) {
        scanner.nextLine();
        System.out.println("Nhập vào tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi: ");
        int age = scanner.nextInt();
        double weigh = scanner.nextDouble();
        scanner.nextLine();
        if (choice == 1) {
            return new Animal(name, age, weigh);
        } else if (choice == 2) {
            System.out.println("Nhập vào con mồi: ");
            String hunting = scanner.nextLine();
            return new Cat(name, age, weigh, hunting);
        } else if (choice == 3) {
            System.out.println("Nhập tư thế ngủ: ");
            String sleep = scanner.nextLine();
            return new Dog(name, age, weigh, sleep);
        } else if (choice == 4) {
            System.out.println("Nhập tốc độ: ");
            double speed = scanner.nextDouble();
            return new Mouse(name, age, weigh, speed);
        }
        return null;
    }

    @Override
    public int run() {
        return run();
    }

    @Override
    public String makeSound() {
        return makeSound();
    }
}

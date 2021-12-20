import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả các con vật");
            System.out.println("2. Thêm 1 con vật");
            System.out.println("3. Sửa một con vật theo tên");
            System.out.println("4. Xóa một con vật theo tên");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.displayAll();
                    break;
                case 2:
                    int choice1;
                    do {
                        System.out.println("1. Animal");
                        System.out.println("2. Cat");
                        System.out.println("3. Dog");
                        System.out.println("4, Mouse");
                        System.out.println("0. Exit");
                        System.out.println("Nhập lựa chọn của bạn");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                Animal animal = manager.createAnimal(scanner, choice1);
                                manager.addAnimal(animal);
                                break;
                            case 2:
                                Cat cat = (Cat) manager.createAnimal(scanner, choice1);
                                manager.addAnimal(cat);
                                break;
                            case 3:
                                Dog dog = (Dog) manager.createAnimal(scanner, choice1);
                                manager.addAnimal(dog);
                                break;
                            case 4:
                                Mouse mouse = (Mouse) manager.createAnimal(scanner, choice);
                                manager.addAnimal(mouse);
                                break;
                        }
                    } while (choice1 != 0);
                    break;

                case 3:
                    System.out.println("Nhập vào tên con vật muốn sửa: ");
                    String name = scanner.nextLine();
                    System.out.println(manager.updateByName(name));
                    break;
                case 4:
                    System.out.println("Nhập vào tên muốn xóa: ");
                    name = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(manager.deleteByName(name));
                    break;
                case 5:

            }
        } while (choice != 0);
    }
}

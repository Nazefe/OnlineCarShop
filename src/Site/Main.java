package Site;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Иван", "Петров", 1, 123);
        Admin admin = new Admin();

        Car car1 = new Car("Toyota Camry", 20000);
        Car car2 = new Car("Honda Accord", 25000);

        manager.addCar(car1);
        manager.addCar(car2);

        admin.addCar(car1);
        admin.addCar(car2);

        Buyer buyer = new Buyer("Алексей", "Сидоров", 30000);
        buyer.buyCar(car1);

        System.out.println("Доступные машины:");
        for (Car car : admin.getAvailableCars()) {
            System.out.println(car);
        }
    }
}


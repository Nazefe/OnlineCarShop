package Site;

import java.util.ArrayList;
import java.util.List;

class Manager implements CarManager {
    private String firstName;
    private String lastName;
    private int id;
    private int pinCode;
    private List<Car> availableCars;

    public Manager(String firstName, String lastName, int id, int pinCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.pinCode = pinCode;
        this.availableCars = new ArrayList<>();
    }

    @Override
    public void addCar(Car car) {
        availableCars.add(car);
        System.out.println("Машина добавлена: " + car);
    }

    @Override
    public void removeCar(Car car) {
        if (availableCars.remove(car)) {
            System.out.println("Машина удалена: " + car);
        } else {
            System.out.println("Машина не найдена.");
        }
    }

    @Override
    public List<Car> getAvailableCars() {
        return availableCars;
    }
}

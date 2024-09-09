package Site;

import java.util.ArrayList;
import java.util.List;

class Admin implements CarManager {
    private List<Car> availableCars;

    public Admin() {
        this.availableCars = new ArrayList<>();
    }

    @Override
    public void addCar(Car car) {
        availableCars.add(car);
    }

    @Override
    public void removeCar(Car car) {
        availableCars.remove(car);
    }

    @Override
    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public void cancelOrder(Buyer buyer, Car car) {
        availableCars.add(car);
        System.out.println("Заказ отменен для " + buyer + " на машину: " + car.getModel());
    }
}


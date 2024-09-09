package Site;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface CarManager {
    void addCar(Car car);
    void removeCar(Car car);
    List<Car> getAvailableCars();
}
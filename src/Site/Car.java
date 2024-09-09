package Site;

class Car {
private String model;
private double price;

public Car(String model, double price) {
    this.model = model;
    this.price = price;
}

public String getModel() {
    return model;
}

public double getPrice() {
    return price;
}

@Override
public String toString() {
    return "Модель: " + model + ", Цена: " + price;
}
}

package Site;

class Buyer {
    private String firstName;
    private String lastName;
    private double accountBalance;

    public Buyer(String firstName, String lastName, double accountBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;
    }

    public void buyCar(Car car) {
        if (accountBalance >= car.getPrice()) {
            accountBalance -= car.getPrice();
            System.out.println(firstName + " " + lastName + " купил машину: " + car.getModel());
        } else {
            System.out.println("Недостаточно средств для покупки.");
        }
    }
}

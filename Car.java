public class Car implements Vehicle{
    private String model;
    private int days;

    // Constructor
    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    // Setters & getters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    // Override abstract methods
    @Override
    public double calculateRentalCost() {
        return this.days * 50.0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Cra Model: " + this.model
                + "\nDaily Rental Rate: $50.0"
                + "\nRental Cost: $" + calculateRentalCost());
    }
}
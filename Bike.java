public class Bike implements Vehicle{
    private String brand;
    private int hours;

    // Constructor
    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    // Setters & getters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    // Override abstract methods
    @Override
    public double calculateRentalCost() {
        return this.hours * 10.0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + this.brand
                + "\nHourly Rental Rate: $10.0: "
                + "\nRental Cost: $" + calculateRentalCost());
    }
}
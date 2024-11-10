public class Truck implements Vehicle {
    private String type;
    private int weeks;

    // Constructor
    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    // Setters & getters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    // Override abstract methods
    @Override
    public double calculateRentalCost() {
        return this.weeks * 500.0;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck type: " + this.type
                + "\nWeekly Rental Rate: $500.0: "
                + "\nRental cost: $" + calculateRentalCost());
    }
}
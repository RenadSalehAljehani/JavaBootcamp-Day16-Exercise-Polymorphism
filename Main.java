import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialize vars
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner user_input = new Scanner(System.in);
        int choice = 0;

        // Loop till the user exit the program
        do {
            try {
                // Display a menu-driven interface to the user
                System.out.println("*********** Vehicle Rental System ***********\n"
                        + "1. Rent a Car\n2. Rent a Bike\n3. Rent a Truck\n4. View Rented Vehicles\n5. Exit");

                // Prompt the user to enter a choice
                System.out.print("Enter your choice: ");
                choice = user_input.nextInt();

                user_input.nextLine();

                // Cases
                switch (choice) {
                    case 1:
                        // Prompt the user to enter the car model and rental days.
                        System.out.print("Enter Car Model: ");
                        String carModel = user_input.nextLine();

                        System.out.print("Enter Rental Days: ");
                        int rentalDays = user_input.nextInt();

                        user_input.nextLine();

                        // Create an instance of the Car class
                        Vehicle car = new Car(carModel, rentalDays);

                        // Add it to the rentedVehicles list
                        rentedVehicles.add(car);

                        // Display rental details
                        System.out.println("----------------------------\n"
                                + "Rental details:");
                        car.displayDetails();
                        System.out.println("----------------------------");

                        break;
                    case 2:
                        // Prompt the user to enter the bike brand and rental hours.
                        System.out.print("Enter Bike Brand: ");
                        String bikeBrand = user_input.nextLine();

                        System.out.print("Enter Rental Hours: ");
                        int rentalHours = user_input.nextInt();

                        user_input.nextLine();

                        // Create an instance of the Bike class
                        Vehicle bike = new Bike(bikeBrand, rentalHours);

                        // Add it to the rentedVehicles list
                        rentedVehicles.add(bike);

                        // Display rental details
                        System.out.println("----------------------------\n"
                                + "Rental details:");
                        bike.displayDetails();
                        System.out.println("----------------------------");

                        break;
                    case 3:
                        // Prompt the user to enter the truck type and rental weeks.
                        System.out.print("Enter Truck Type: ");
                        String truckType = user_input.nextLine();

                        System.out.print("Enter Rental Weeks: ");
                        int rentalWeeks = user_input.nextInt();

                        user_input.nextLine();

                        // Create an instance of the Truck class
                        Vehicle truck = new Truck(truckType, rentalWeeks);

                        // Add it to the rentedVehicles list
                        rentedVehicles.add(truck);

                        // Display rental details
                        System.out.println("----------------------------\n"
                                + "Rental details:");
                        truck.displayDetails();
                        System.out.println("----------------------------");

                        break;
                    case 4:
                        // Display details of all rented vehicles
                        System.out.println("----------------------------\n"
                                + "Rented Vehicles:");
                        for (Vehicle vehicle : rentedVehicles) {
                            vehicle.displayDetails();
                        }
                        System.out.println("----------------------------");
                        break;
                    case 5:
                        System.out.println("Thank you for using the Vehicle Rental System!");
                        break;
                    default:
                        System.out.println("Please enter a number between 1 -5!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a correct number!");
                user_input.nextLine();
            }
        } while (choice != 5);
    }
}
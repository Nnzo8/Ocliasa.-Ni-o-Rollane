import java.util.Scanner;
import java.util.InputMismatchException;

public class RouteOcliasa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.println("=== Welcome User! This is RouteOcliasa ===");
            System.out.println("This is your Default Routes:");
            System.out.println("Cebu City(start)");
            System.out.println("Minglanilla (Route 1)");
            System.out.println("San Fernando (Route 2)");
            System.out.println("Carcar (Route 3)");
            System.out.println("Barili (Route 4.1)");
            System.out.println("Dumanjug (Route 4.1.1)");
            System.out.println("Alcantara (Route 4.1.2)");
            System.out.println("Moalboal (End)");
            System.out.println("Do you want a recommended route(1) or exit(2)");

             int choice = getIntInput(s, "Invalid choice. Please enter 1 or 2.");
             
                if (choice == 2) {
                    System.out.println("Goodbye!!");
                    break;
                } else if (choice == 1) {
                    System.out.println("Is Barili obstructed?(1 for Yes/2 for No)");
                     int o1 = getIntInput(s, "Invalid input. Please enter 1 or 2 for Barili obstruction status.");
                     

                    if (o1 == 1) ///// Barili Obstructed /////
                    {

                        System.out.println("Is Dumanjug obstructed?(1 for Yes/2 for No)");
                        int o2 = getIntInput(s, "Invalid input. Please enter 1 or 2 for Dumanjug obstruction status.");
                      
                        System.out.println("How fast are you going? __ km/hr");
                        int speed = getSpeedInput(s);


                        if (o2 == 1) ///// Dumanjug Obstructed /////
                        {
                            double distance1 = 101.5;
                            double eta1 = distance1/speed;
                            int hours1 = (int) eta1;
                             int minutes1 = (int) ((eta1 - hours1) * 60);
                            System.out.println("Recommended Route:");
                            System.out.println("Cebu City(start)");
                            System.out.println("Minglanilla (Route 1)");
                            System.out.println("San Fernando (Route 2)");
                            System.out.println("Carcar (Route 3)");
                            System.out.println("Sibonga (Route 4.2)");
                            System.out.println("Argao (Route 5)");
                            System.out.println("Ronda (Route 5.1)");
                            System.out.println("Alcantara (Route 5.2)");
                            System.out.println("Moalboal (End)");
                            System.out.println();
                            System.out.println("==== Additional Data: ====");
                            System.out.println("Speed: " + speed + " km/hr");
                            System.out.println("Distance: " + distance1 + " km");
                            System.out.println("Estimated Time of Arrival (ETA): " + hours1 + " hour/s & " + minutes1 + " minutes");
                            break;
                        } else if (o2 == 2) ///// Dumanjud NOT Obstructed /////
                        {
                            double distance2 = 96.5;
                            double eta2 = distance2/speed;
                            int hours2 = (int) eta2;
                         int minutes2 = (int) ((eta2 - hours2) * 60);
                            System.out.println("Recommended Route:");
                            System.out.println("Cebu City(start)");
                            System.out.println("Minglanilla (Route 1)");
                            System.out.println("San Fernando (Route 2)");
                            System.out.println("Carcar (Route 3)");
                            System.out.println("Sibonga (Route 4.2)");
                            System.out.println("Dumanjug (Route 4.2.1)");
                            System.out.println("Alcantara (Route 4.2.2)");
                            System.out.println("Moalboal (End)");
                            System.out.println();
                            System.out.println("==== Additional Data: ====");
                            System.out.println("Speed: " + speed + " km/hr");
                            System.out.println("Distance: " + distance2 + " km");
                            System.out.println("Estimated Time of Arrival (ETA): " + hours2 + " hour/s & " + minutes2 + " minutes");
                            break;
                        }
                    } else if (o1 == 2) ///// Barili NOT Obstructed /////
                    {
                        
                        System.out.println("How fast are you going? __ km/hr");
                        int speed1 = getSpeedInput(s);

                        double distance3 = 85.4;
                        double eta3 = distance3/speed1;
                        int hours3 = (int) eta3;
                        int minutes3 = (int) ((eta3 - hours3) * 60);
                        System.out.println("Recommended Route:");
                        System.out.println("Cebu City(start)");
                        System.out.println("Minglanilla (Route 1)");
                        System.out.println("San Fernando (Route 2)");
                        System.out.println("Carcar (Route 3)");
                        System.out.println("Barili (Route 4.1)");
                        System.out.println("Dumanjug (Route 4.1.1)");
                        System.out.println("Alcantara (Route 4.1.2)");
                        System.out.println("Moalboal (End)");
                        System.out.println();
                        System.out.println("==== Additional Data: ====");
                        System.out.println("Speed: " + speed1 + " km/hr");
                        System.out.println("Distance: " + distance3 + " km");
                        System.out.println("Estimated Time of Arrival (ETA): " + hours3 + " hour/s & " + minutes3 + " minutes");
                         break;
                    }
                } else {
                    System.out.println("Invalid choice. Please enter 0 or 1.");
                }
            } 
            }
            
              private static int getIntInput(Scanner scanner, String errorMessage) {
        while (true) {
            try {
                int input = Integer.parseInt(scanner.next());
                if (input == 0 || input == 1 || input == 2) {
                    return input;
                } else {
                    System.out.println(errorMessage);
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    private static int getSpeedInput(Scanner scanner) {
        while (true) {
            try {
                int speed = scanner.nextInt();
                if (speed > 0) {
                    return speed;
                } else {
                    System.out.println("Invalid speed. Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for speed.");
                scanner.next();
            
        }
    }
}
}
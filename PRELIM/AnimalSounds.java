import java.util.Scanner;

class Animals {
    String sound;

    public void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animals {
    public Dog() {
        sound = "Bark Bark";
    }
}

class Cat extends Animals {
    public Cat() {
        sound = "Meow Meow";
    }
}

class Cow extends Animals {
    public Cow() {
        sound = "Moo Moo";
    }
}

class Lion extends Animals {
    public Lion() {
        sound = "Roar Roar";
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animals[] animals = { new Dog(), new Cat(), new Cow(), new Lion() };

        System.out.println("========== Activity One: What does the animal say? ===========");
        System.out.println("Choose an animal:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Cow");
        System.out.println("4. Lion");
        System.out.println("0. Exit");

        int choice;

        do {
            System.out.print("Enter a number (1-4) or 0 to exit: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 4) {
                    animals[choice - 1].makeSound();
                } else if (choice != 0) {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } else {
                // Consume the invalid input to prevent an infinite loop
                scanner.next();
                System.out.println("Invalid input. Please enter a number.");
                choice = -1; // Set to an invalid choice
            }
        } while (choice != 0);

        System.out.println("Goodbye!");
        scanner.close();
    }
}

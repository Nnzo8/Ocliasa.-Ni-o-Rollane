import java.util.Scanner;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String fullName;
    
    public Student() {
    }

    public Student(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.fullName = this.firstName + " " + this.middleName + " " + this.lastName;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        updateFullName();
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
        updateFullName();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        updateFullName();
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullName() {
        return fullName;
    }

    private void updateFullName() {
    StringBuilder fullNameBuilder = new StringBuilder();
    fullNameBuilder.append(this.firstName).append(" ").append(this.middleName).append(" ").append(this.lastName);

    if (suffix != null && !suffix.isEmpty()) {
        fullNameBuilder.append(" ").append(this.suffix);
    }
    this.fullName = fullNameBuilder.toString();
}

       public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        this.firstName = readValidInput(scanner);

        System.out.print("Enter Middle Name: ");
        this.middleName = readValidInput(scanner);

        System.out.print("Enter Last Name: ");
        this.lastName = readValidInput(scanner);

        System.out.print("Enter Suffix: ");
        this.suffix = scanner.nextLine();
    }

    private String readValidInput(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            if (input.matches("^[a-zA-Z]*$")) {
                return input;
            } else {
                System.out.println("Invalid input. Please enter a valid name without numbers.");
            }
        }
    }

    public void displayInfo() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Middle Name: " + getMiddleName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Suffix: " + (getSuffix() != null && !getSuffix().isEmpty() ? getSuffix() : "n/a"));
        System.out.println("Full Name: " + getFullName());
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.inputData();
        student.updateFullName();

        System.out.println("\nEntered Information:");
        student.displayInfo();
    }
}

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day index (0-6): ");
        int dayIndex = scanner.nextInt();

        try {
            System.out.println("The day is: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid day index. Please enter a number between 0 and 6.");
        }
        scanner.close();
    }
}

// Output
Enter the day index (0-6): 1
The day is: Monday

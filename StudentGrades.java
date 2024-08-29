import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    private HashMap<String, Integer> grades;

    public StudentGrades() {
        grades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        grades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    public void removeStudent(String name) {
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public void displayGrade(String name) {
        if (grades.containsKey(name)) {
            System.out.println(name + "'s grade: " + grades.get(name));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    studentGrades.addStudent(nameToAdd, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    studentGrades.removeStudent(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String nameToDisplay = scanner.nextLine();
                    studentGrades.displayGrade(nameToDisplay);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

// Output
1. Add Student
2. Remove Student
3. Display Student Grade
4. Exit
Enter your choice: 1
Enter student name: surya
Enter student grade: 5
Student surya added with grade 5
1. Add Student
2. Remove Student
3. Display Student Grade
4. Exit
Enter your choice: 4
Exiting...

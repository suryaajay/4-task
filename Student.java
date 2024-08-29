public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;

        if (!name.matches("[a-zA-Z\\s]+")) {
            System.out.println("Error: Name contains numbers or special symbols.");
            return;
        }
        this.name = name;

        if (age < 15 || age > 21) {
            System.out.println("Error: Age is not within the valid range (15-21).");
            return;
        }
        this.age = age;

        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "John", 20, "Computer Science");
        student1.display();

        Student student2 = new Student(102, "Jack", 22, "Electronics");
        student2.display();

        Student student3 = new Student(103, "Jade", 18, "Mechanical");
        student3.display();
    }
}

// Output
Roll No: 101
Name: John
Age: 20
Course: Computer Science
Error: Age is not within the valid range (15-21).
Roll No: 102
Name: Jack
Age: 0
Course: null
Roll No: 103
Name: Jade
Age: 18
Course: Mechanical

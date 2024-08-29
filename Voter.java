public class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) {
        this.voterId = voterId;
        this.name = name;

        if (age < 18) {
            System.out.println("Invalid age for voter");
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public void display() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Voter voter1 = new Voter(1, "guru", 25);
        voter1.display();

        Voter voter2 = new Voter(2, "sandy", 16);
        voter2.display();
    }
}

// Output
Voter ID: 1
Name: guru
Age: 25
Invalid age for voter
Voter ID: 2
Name: sandy
Age: 18

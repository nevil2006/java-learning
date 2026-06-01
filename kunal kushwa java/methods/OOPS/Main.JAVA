class Student {

    String name;
    int rollNumber;
    String department;

    void display() {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(department);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Nevil";
        s1.rollNumber = 101;
        s1.department = "Data Science";

        s1.display();
    }
}
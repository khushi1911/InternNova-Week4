import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class Student {
int id;
String name;
String course;
int age;

Student(int id, String name, String course, int age) {
    this.id = id;
    this.name = name;
    this.course = course;
    this.age = age;
}

@SuppressWarnings("override")
public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("ID: ").append(id);
    sb.append(" | Name: ").append(name);
    sb.append(" | Course: ").append(course);
    sb.append(" | Age: ").append(age);

    return sb.toString();
}
}

public class Task6_StudentRecordManager {

static HashMap<Integer, Student> students = new HashMap<>();
static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {

    boolean running = true;

    while (running) {

        try {
            System.out.println("\n===== STUDENT RECORD MANAGER =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Display Unique Courses");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> addStudent();

                case 2 -> viewStudents();

                case 3 -> searchStudent();

                case 4 -> removeStudent();

                case 5 -> displayUniqueCourses();

                case 6 -> {
                    System.out.println("Thank you for using Student Record Manager!");
                    running = false;
                }

                default -> System.out.println("Invalid choice! Please select from 1 to 6.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric choice.");
            sc.nextLine();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    sc.close();
}

static void addStudent() {

    System.out.println("\n--- Add Student ---");

    System.out.print("Enter Student ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    if (id <= 0) {
        throw new IllegalArgumentException("Student ID must be positive.");
    }

    if (students.containsKey(id)) {
        System.out.println("Error: Student ID already exists!");
        return;
    }

    System.out.print("Enter Student Name: ");
    String name = sc.nextLine().trim();

    if (name.isEmpty()) {
        throw new IllegalArgumentException("Student name cannot be empty.");
    }

    System.out.print("Enter Course: ");
    String course = sc.nextLine().trim();

    if (course.isEmpty()) {
        throw new IllegalArgumentException("Course cannot be empty.");
    }

    System.out.print("Enter Age: ");
    int age = sc.nextInt();
    sc.nextLine();

    if (age <= 0 || age > 120) {
        throw new IllegalArgumentException("Please enter a valid age.");
    }

    students.put(id, new Student(id, name, course, age));

    System.out.println("Student added successfully!");
}

static void viewStudents() {

    System.out.println("\n--- Student Records ---");

    if (students.isEmpty()) {
        System.out.println("No student records available.");
        return;
    }

    for (Map.Entry<Integer, Student> entry : students.entrySet()) {
        System.out.println(entry.getValue());
    }
}

static void searchStudent() {

    System.out.print("\nEnter Student ID to search: ");
    int id = sc.nextInt();
    sc.nextLine();

    if (id <= 0) {
        throw new IllegalArgumentException("Student ID must be positive.");
    }

    if (students.containsKey(id)) {
        System.out.println("Student Found:");
        System.out.println(students.get(id));
    } else {
        System.out.println("Student with ID " + id + " not found.");
    }
}

static void removeStudent() {

    System.out.print("\nEnter Student ID to remove: ");
    int id = sc.nextInt();
    sc.nextLine();

    if (id <= 0) {
        throw new IllegalArgumentException("Student ID must be positive.");
    }

    if (students.containsKey(id)) {
        students.remove(id);
        System.out.println("Student removed successfully!");
    } else {
        System.out.println("Student with ID " + id + " not found.");
    }
}

static void displayUniqueCourses() {

    System.out.println("\n--- Unique Courses ---");

    HashSet<String> courses = new HashSet<>();

    for (Student student : students.values()) {
        courses.add(student.course);
    }

    if (courses.isEmpty()) {
        System.out.println("No courses available.");
        return;
    }

    for (String course : courses) {
        System.out.println(course);
    }
}
}

import java.util.ArrayList;

public class Task2_StudentNames {


public static void main(String[] args) {

    ArrayList<String> students = new ArrayList<>();

    // Add student names
    students.add("Khushi");
    students.add("Aarav");
    students.add("Priya");
    students.add("Rahul");
    students.add("Ananya");

    System.out.println("===== STUDENT NAMES =====");

    // Display all students
    System.out.println("All Students: " + students);

    // Remove a student
    students.remove("Rahul");
    System.out.println("\nAfter removing Rahul: " + students);

    // Search for a student
    String searchName = "Priya";

    if (students.contains(searchName)) {
        System.out.println("\n" + searchName + " was found in the collection.");
    } else {
        System.out.println("\n" + searchName + " was not found in the collection.");
    }

    // Display final collection
    System.out.println("\nFinal Student Collection: " + students);
}

}

import java.util.HashMap;
import java.util.Map;

public class Task4_StudentRecords {

public static void main(String[] args) {

    HashMap<Integer, String> students = new HashMap<>();

    // Add student records
    students.put(101, "Khushi");
    students.put(102, "Aarav");
    students.put(103, "Priya");
    students.put(104, "Rahul");
    students.put(105, "Ananya");

    System.out.println("===== STUDENT RECORDS =====");

    // Display all records
    System.out.println("All Student Records:");

    for (Map.Entry<Integer, String> entry : students.entrySet()) {
        System.out.println(
            "Student ID: " + entry.getKey()
            + ", Student Name: " + entry.getValue()
        );
    }

    // Search for a student using ID
    int searchId = 103;

    System.out.println("\nSearching for Student ID: " + searchId);

    if (students.containsKey(searchId)) {
        System.out.println("Student Name: " + students.get(searchId));
    } else {
        System.out.println("Student record not found.");
    }

    // Remove a student record
    int removeId = 104;

    if (students.containsKey(removeId)) {
        students.remove(removeId);
        System.out.println("\nStudent ID " + removeId + " removed successfully.");
    } else {
        System.out.println("\nStudent ID " + removeId + " was not found.");
    }

    // Display updated records
    System.out.println("\nUpdated Student Records:");

    for (Map.Entry<Integer, String> entry : students.entrySet()) {
        System.out.println(
            "Student ID: " + entry.getKey()
            + ", Student Name: " + entry.getValue()
        );
    }
}
}

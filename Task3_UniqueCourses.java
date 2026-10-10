import java.util.HashSet;

public class Task3_UniqueCourses {

public static void main(String[] args) {

    HashSet<String> courses = new HashSet<>();

    // Add course names, including duplicates
    courses.add("Java");
    courses.add("Python");
    courses.add("Data Science");
    courses.add("Web Development");
    courses.add("Machine Learning");
    courses.add("Python");
    courses.add("Java");
    courses.add("Database Management");

    System.out.println("===== UNIQUE COURSES =====");

    // Display unique courses
    System.out.println("Courses: " + courses);

    // Display the total number of unique courses
    System.out.println("\nTotal unique courses: " + courses.size());

    // Search for a particular course
    String searchCourse = "Python";

    if (courses.contains(searchCourse)) {
        System.out.println(searchCourse + " is available in the collection.");
    } else {
        System.out.println(searchCourse + " is not available in the collection.");
    }
}
}

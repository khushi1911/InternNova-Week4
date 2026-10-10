public class Task5_StringBuilderDemo {

public static void main(String[] args) {

    // Create a StringBuilder
    StringBuilder text = new StringBuilder("Hello Java");

    System.out.println("Original Text: " + text);

    // Append additional text
    text.append(" Programming");
    System.out.println("After Append: " + text);

    // Insert text at a specific position
    text.insert(10, " World");
    System.out.println("After Insert: " + text);

    // Replace a portion of the text
    text.replace(0, 5, "Welcome");
    System.out.println("After Replace: " + text);

    // Reverse the final string
    text.reverse();
    System.out.println("After Reverse: " + text);
}
}

package Assignment_Q2;

import java.util.Scanner;                             // Imports Scanner class to allow user input from the console.

public class testCourse {                               // Defines a public class named testCourse that contains the main method.
    public static void main(String[] args) {            // The main method: entry point of the Java program.
        
        Scanner scanner = new Scanner(System.in);       // Creates a Scanner object to read input from the user.

        System.out.print("Enter the course name: ");    // Prompts the user to enter the course name.
        String courseName = scanner.nextLine();         // Reads the course name input from the user.
        Course course = new Course(courseName);         // Creates a Course object using the provided course name.

        // Displays instructions to the user about entering student names.
        System.out.println("Enter student name (Press Enter on the blank line to finish):");    

// Starts an infinite loop to keep accepting student names.
        while (true) {
            if (course.getNumberOfStudents() >= 40) {                        // Checks if the course is already full (max 40 students).
                System.out.println("Course is full! Cannot add students.");  // Displays message if the course is full.
                break;                                                       // Exits the loop.
            }

            System.out.print(">> ");                                        // Prompts the user to input a student name.
            String student = scanner.nextLine();                            // Reads the student's name from user input.
            if (student.trim().isEmpty()) {                                 // If the input is empty (user presses Enter), exit loop.
                break;
            }

            course.addStudent(student);                                     // Adds the entered student name to the course.
        }

        System.out.println("\nCourse Name: " + course.getName());                   // Prints the course name.
        System.out.println("Number Of Students: " + course.getNumberOfStudents());  // Prints the total number of enrolled students.
        System.out.println("List Of Students:");                                    // Prints a heading for the student list.
        for (String student : course.getStudents()) {                               // Loops through each enrolled student in the course.
            System.out.println("- " + student);                                     // Prints each student's name with a dash in front.
        }
    }
}
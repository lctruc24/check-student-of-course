package Assignment_Q2;

public class Course {       // Defines the public class named Course
    
    // Attributes
    private final String name;          // Name of the course (constant after assignment)
    private final String[] students;    // Array to store student names (maximum 40)
    private int numberOfStudents;       // Counter for the number of enrolled students

    // Constructor
    public Course(String name) {        
        this.name = name;               // Assigns the course name
        this.students = new String[40]; // Initializes array with capacity for 40 students
        this.numberOfStudents = 0;      // Initially, no students are enrolled
    }

// Method to return the course name.
    public String getName() {           
        return name;                    
    }

// Method to add a student to the course.
    public void addStudent(String student) {        
        if (numberOfStudents < students.length) {   // Checks if there is room to add more students.
            students[numberOfStudents] = student;   // Stores the student's name at the next available index in the array.
            numberOfStudents++;                     // Increments the count of enrolled students.
        } else {
            System.out.println("Course is full");   // If 40 students are already added, prints a message.
        }
    }

// Method to return a trimmed list of students.
    public String[] getStudents() {
        String[] actualStudents = new String[numberOfStudents];     // Creates a new array of the exact size of enrolled students.
        for (int i = 0; i < numberOfStudents; i++) {                // Loops through the enrolled students.
            actualStudents[i] = students[i];                        // Copies each student's name from the main array to the new one.
        }
        return actualStudents;                                      // Returns the trimmed array of enrolled students.
    }

// Method to return the total number of students in the course.
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
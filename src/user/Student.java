package user;

/**
 * This class represents a student, which is a type of user.
 * It extends the User class and includes a student ID field.
 */
public class Student implements User {

    /**
     * The ID of the student.
     */
    private String studentID;
    /**
     * The password of a student
     */
    private String password;

    /**
     * Constructs a new Student object with the specified student ID.
     *
     * @param studentID the ID of the student.
     */
    public Student(String studentID) {
        this.studentID = studentID;
    }
}

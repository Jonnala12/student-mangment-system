public interface StudentOperations {
    void addStudent(Student student);
    void removeStudent(int studentID);
    void updateStudent(int studentID, Student updatedStudent);
    void displayStudents();
}


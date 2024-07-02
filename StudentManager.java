  public class StudentManager implements StudentOperations {
        // List to store students
        private List<Student> students;

        // Constructor
        public StudentManager() {
            this.students = new ArrayList<>();
        }

        // Implementing methods from StudentOperations interface
        @Override
        public void addStudent(Student student) {
            students.add(student);
        }

        @Override
        public void removeStudent(int studentID) {
            // Find and remove student based on studentID
            students.removeIf(student -> student.getStudentID() == studentID);
        }

        @Override
        public void updateStudent(int studentID, Student updatedStudent) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStudentID() == studentID) {
                    students.set(i, updatedStudent);
                    break;
                }
            }
        }

        @Override
        public void displayStudents() {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }



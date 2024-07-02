public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        while (true) {
            // Display menu
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Read user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.print("Enter student course: ");
                    String course = scanner.nextLine();

                    Student newStudent = new Student(id, name, age, course);
                    studentManager.addStudent(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter student ID to remove: ");
                    int removeID = scanner.nextInt();
                    studentManager.removeStudent(removeID);
                    System.out.println("Student removed successfully!");
                    break;

                case 3:
                    System.out.print("Enter student ID to update: ");
                    int updateID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.print("Enter new student name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter new student age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.print("Enter new student course: ");
                    String newCourse = scanner.nextLine();

                    Student updatedStudent = new Student(updateID, newName, newAge, newCourse);
                    studentManager.updateStudent(updateID, updatedStudent);
                    System.out.println("Student updated successfully!");
                    break;

                case 4:
                    System.out.println("\nList of Students:");
                    studentManager.displayStudents();
                    break;

                case 5:
                    System.out.println("Exiting Student Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}


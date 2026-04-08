public class StudentDemo21 {
    public static void main(String[] args) {
        TopStudent21 topStudents = new TopStudent21(5);

        topStudents.add(new Student21("2201", "Alice", "A", 3.9));
        topStudents.add(new Student21("2202", "Bob", "B", 3.7));
        topStudents.add(new Student21("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student21("2204", "David", "D", 3.6));
        topStudents.add(new Student21("2205", "Eve", "E", 4.0));

        System.out.println("Original student list: ");
        topStudents.print();
        System.out.println(" ");

        topStudents.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending): ");
        topStudents.print();
    }
}
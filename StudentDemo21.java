import java.util.Scanner;

public class StudentDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int size = sc.nextInt();
        sc.nextLine();

        TopStudent21 topStudents = new TopStudent21(size);

        for (int i = 0; i < size; i++) {
            System.out.println("Student data to-" + (i + 1));
            System.out.print("NIM\t: ");
            String nim = sc.nextLine();
            System.out.print("Name\t: ");
            String name = sc.nextLine();
            System.out.print("Class\t: ");
            String studentClass = sc.nextLine();
            System.out.print("GPA\t: ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            topStudents.add(new Student21(nim, name, studentClass, gpa));
            System.out.println();
        }

        System.out.println("Original student list: ");
        topStudents.print();
        System.out.println();

        topStudents.bubbleSort();

        System.out.println("Sorted student list (by GPA, descending): ");
        topStudents.print();
        System.out.println();

        topStudents.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Selection sort: ");
        topStudents.print();
        System.out.println();

        topStudents.insertionSort();
        System.out.println("Sorted list (by GPA, ascending) using Insertion sort: ");
        topStudents.print();

        sc.close();
    }

}
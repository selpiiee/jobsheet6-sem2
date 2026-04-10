import java.util.Scanner;

public class LecturerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData data = new LecturerData();
        int choice = 0;

        for (; choice != 5; ) { 
            System.out.println("\n===========================");
            System.out.println("   LECTURER DATA SYSTEM    ");
            System.out.println("===========================");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Youngest - Bubble)");
            System.out.println("4. Sort DSC (Oldest - Selection)");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.println("\n--- Input Lecturer Data ---");
                System.out.print("ID\t\t\t: "); 
                String id = sc.nextLine();
                System.out.print("Name\t\t\t: "); 
                String name = sc.nextLine();
                System.out.print("Gender (true=M/false=F) : "); 
                boolean gender = sc.nextBoolean();
                System.out.print("Age\t\t\t: "); 
                int age = sc.nextInt();
                
                Lecturer dsn = new Lecturer(id, name, gender, age);
                data.add(dsn);
                System.out.println("The data has been successfully added");

            } else if (choice == 2) {
                System.out.println("\n--- List of All Faculty Lecturer ---");
                data.print();

            } else if (choice == 3) {
                data.bubbleSort();
                System.out.println("\nThe data has been successfully sorted in ascending order (Bubble Sort).");
                data.print();

            } else if (choice == 4) {
                data.selectionSort();
                System.out.println("\nThe data has been successfully sorted in descending order (Selection Sort).");
                data.print();

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}

import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        StudentBST t = new StudentBST();
        t.load();
        int choice;
        Scanner sca = new Scanner(System.in);
        System.out.println();
        System.out.println(" 1. Test f1 - test insert function");
        System.out.println(" 2. Test f2 - count students");
        System.out.println(" 3. Test f3 - average of GPAs");
        System.out.println(" 4. Test f4 - Pre-Order traversal");
        System.out.println(" 5. Test f5 - In-Order traversal");
        System.out.println(" 6. Test f6 - Post-Order traversal");
        System.out.println(" 7. Test f7 - Find student by ID");
        System.out.println(" 8. Test getAverageGPA function");
        System.out.print("    Your selection (1 -> 8): ");
        choice = sca.nextInt();
        sca.nextLine(); // Clear buffer
        
        switch (choice) {
            case 1:
                System.out.println("Testing insert function:");
                t.f1();
                break;
            case 2:
                System.out.println("Count students:");
                int count = t.f2();
                System.out.println(count);
                break;
            case 3:
                System.out.println("avg of all GPAs:");
                double gpaSum = t.f3();
                System.out.println(gpaSum);
                break;
            case 4:
                System.out.println("PreOrder traversal:");
                t.f4();
                break;
            case 5:
                System.out.println("InOrder traversal:");
                t.f5();
                break;
            case 6:
                System.out.println("PostOrder traversal:");
                t.f6();
                break;
            case 7:
                System.out.print("Enter student ID to find: ");
                int findId = sca.nextInt();
                sca.nextLine(); // Clear buffer
                Student found = t.f7(findId);
                if (found != null) {
                    System.out.println("Student found: " + found);
                } else {
                    System.out.println("No student found with ID " + findId);
                }
                break;
            case 8:
                System.out.println("Average GPA of all students:");
                double avgGPA = t.getAverageGPA();
                System.out.println(avgGPA);
                break;
            default:
                System.out.println("Wrong selection");
        }
        System.out.println();
    }
}

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tungi
 */
public class Main {

    public static void main(String args[]) throws Exception {

        MyList t = new MyList();
        Scanner sca = new Scanner(System.in);
        System.out.print("Size of list:   ");
        int size = sca.nextInt();

        t.loadData(size);

        printMenu();

        int choice = sca.nextInt();
        sca.nextLine();

        switch (choice) {
            case 0:
                return;
            case 1:
                t.f1();
                break;
            case 2:
                t.f2();
                break;
            case 3:
                t.f3();
                break;
            case 4:
//                t.f4();
                break;
            case 5:
//                t.f5();
                break;

            default:
                System.out.println("Invalid choice");
        }

        System.out.println();
    }

    private static void printMenu() {
        System.out.println("=============MENU=============");
        System.out.println("1. Test f1 ");
        System.out.println("2. Test f2 ");
        System.out.println("3. Test f3 ");
        System.out.println("4. Test f4 ");
        System.out.println("5. Test f5 ");
        System.out.println("0. Exit");
        System.out.println("==============================");
        System.out.print("Enter your choice [0 --> 5]: ");
    }
}

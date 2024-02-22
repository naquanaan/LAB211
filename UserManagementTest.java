/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagementtest;

import java.util.Scanner;

/**
 * UserManagementTest is the main class for the User Management System. It
 * provides the main entry point for the application and allows users to create
 * new accounts, log in, or exit the system.
 *
 * @author WuanTun
 */
public class UserManagementTest {

    /**
     * The main entry point for the User Management System.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of UserManagementTest and start the system.
//        UserManagementTest system = new UserManagementTest();
//        system.run();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== User Management System =====");
            System.out.println("1. Create a new account");
            System.out.println("2. Login System");
            System.out.println("3. Exit");
            System.out.println("Choose an option:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Call the method to create a new account.
                    AccountManager.createNewAccount(scanner);
                    break;
                case 2:
                    // Call the method to log in to the system.
                    AccountManager.loginSystem(scanner);
                    break;
                case 3:
                    // Exit the program.
                    System.exit(0);
                default:
                    // Handle invalid choice.
                    System.out.println("Invalid choice");
            }
        }
    }

    /**
     * The core method that runs the User Management System.
     */
//    private void run() {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("===== User Management System =====");
//            System.out.println("1. Create a new account");
//            System.out.println("2. Login System");
//            System.out.println("3. Exit");
//            System.out.println("Choose an option:");
//
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    // Call the method to create a new account.
//                    AccountManager.createNewAccount(scanner);
//                    break;
//                case 2:
//                    // Call the method to log in to the system.
//                    AccountManager.loginSystem(scanner);
//                    break;
//                case 3:
//                    // Exit the program.
//                    System.exit(0);
//                default:
//                    // Handle invalid choice.
//                    System.out.println("Invalid choice");
//            }
//        }
//    }
}

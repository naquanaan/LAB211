/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagementtest;

import java.util.Scanner;

/**
 * AccountManager is a class responsible for managing user accounts in the User Management System.
 * It provides a method to create a new user account by taking input from the user.
 * 
 * @author WuanTun
 */

public class AccountManager {

    /**
     * Create a new user account by taking username and password input from the
     * user.
     *
     * @param scanner A Scanner object for reading user input.
     */
    public static void createNewAccount(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (username.length() < 5 || username.contains(" ")) {
            System.out.println("Your username must enter at least 5 characters, and no spaces!");
            return;
        }

        if (password.length() < 6 || password.contains(" ")) {
            System.out.println("Your password must enter at least 6 characters, and no spaces!");
            return;
        }

        if (FileHandler.writeAccountToFile(username, password)) {
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Error while creating the account.");
        }
    }

    /**
     * Attempt to log in to the user management system by verifying the entered
     * username and password against stored credentials.
     *
     * @param scanner A Scanner object for reading user input.
     */
    public static void loginSystem(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (FileHandler.checkCredentials(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

}

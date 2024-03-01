package usermanagementtest;

import java.util.Scanner;

/**
 * AccountManager is a class responsible for managing user accounts in the User
 * Management System. It provides a method to create a new user account by
 * taking input from the user.
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
        String username;

        while (true) {
            System.out.print("Enter username: ");
            username = scanner.next();

            // Kiểm tra nếu username đã tồn tại
            if (checkUsernameExists(username)) {
                System.out.println("Username already exists. Please enter a different username.");
            } else if (username.length() < 5 || username.contains(" ")) {
                System.out.println("Your username must contain at least 5 characters and no spaces!");
            } else {
                break;
            }
        }

        String password;
        while (true) {
            System.out.print("Enter password: ");
            password = scanner.next();
            if (password.length() < 6 || password.contains(" ")) {
                System.out.println("Your password must contain at least 6 characters and no spaces!");
            } else {
                break;
            }
        }

        // Ghi tài khoản vào file
        if (FileHandler.writeAccountToFile(username, password)) {
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Error while creating the account.");
        }
    }

    /**
     * Kiểm tra xem username đã tồn tại trong file hay chưa.
     *
     * @param username Tên người dùng cần kiểm tra.
     * @return `true` nếu username đã tồn tại; `false` nếu không tồn tại.
     */
    private static boolean checkUsernameExists(String username) {
        try {
            return FileHandler.checkUsernameExists(username);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Attempt to log in to the user management system by verifying the entered
     * username and password against stored credentials.
     *
     * @param scanner A Scanner object for reading user input.
     */
    public static void loginSystem(Scanner scanner) {
        // Input username
        System.out.print("Enter username: ");
        String username = scanner.next();

        // Input password
        System.out.print("Enter password: ");
        String password = scanner.next();

        // Kiểm tra thông tin đăng nhập
        if (FileHandler.checkCredentials(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}

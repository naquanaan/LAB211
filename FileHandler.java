/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagementtest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

   /**
 * FileHandler is responsible for handling file operations related to user accounts.
 * It provides a method to write user account (username and password) to a file.
 * 
 * @author WuanTun
 */
    public class FileHandler {

        /**
         * Writes a user account (username and password) to a file.
         *
         * @param username The username to be written.
         * @param password The password to be written.
         * @return `true` if the write operation was successful; `false` otherwise.
         */
        private static final String FILE_NAME = "user.dat";

        public static boolean writeAccountToFile(String username, String password) {
            try {
                FileWriter fileWriter = new FileWriter(FILE_NAME, true);
                fileWriter.write(username + " " + password + "\n");
                fileWriter.close();
                return true;
            } catch (IOException e) {
                return false;
            }
        }

    /**
     * Check if the provided username and password match any stored credentials
     * in the file.
     *
     * @param username The username to be checked.
     * @param password The password to be checked.
     * @return `true` if the provided credentials match an entry in the file;
     * `false` otherwise.
     */
    public static boolean checkCredentials(String username, String password) {
        try {
            File file = new File(FILE_NAME);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" ");

                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    fileScanner.close();
                    return true;
                }
            }

            fileScanner.close();
        } catch (IOException e) {
            // Handle potential file-related errors (e.g., file not found).
        }

        return false;
    }

}

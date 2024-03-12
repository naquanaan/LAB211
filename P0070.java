/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p0070;

import java.util.Locale;

/**
 *
 * @author WuanTun
 */
public class P0070 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Locale objects for Vietnamese and English
        Locale vietnamese = new Locale("vi");
        Locale english = Locale.ENGLISH;

        // Display language options and get user's choice
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Please choose one option: ");
        int choice = Controller.getInputIntLimit(1, 3, english);

        // Process user's choice
        switch (choice) {
            case 1:
                // Display in Vietnamese
                Controller.display(vietnamese);
                break;
            case 2:
                // Display in English
                Controller.display(english);
                break;
            case 3:
                // Exit the program
                System.out.println("Exiting...");
                break;
        }
    }

}

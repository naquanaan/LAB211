/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebank;

    import java.util.Locale;

    /**
     * This is the main class for the EBANK program, which allows users to choose
     * between Vietnamese and English language options for display. The program
     * utilizes the Controller class to handle user input and language display.
     *
     * @author WuanTun
     */
    public class EBANK {

        /**
         * The main method for the program.
         *
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

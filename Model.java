/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebank;

/**
 * Model is a class that contains constants and data structures used in the
 * application.
 *
 * @author WuanTun
 */
import java.security.SecureRandom;

public class Model {
    // Regular expression pattern for a valid account number.

    private static final String ACCOUNT_NUMBER_VALID = "^\\d{10}$";
    // Array of characters used for generating captchas.
    //private static final char[] captchaChars = {'1', 'A', 'a', 'B', 'b', 'C', 'c', '2', 'D', 'd', 'E', 'e', 'F', 'f', '3', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', '4', 'M', 'm', 'N', 'n', 'O', 'o', '5', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', '6', '7', 'U', 'u', 'V', 'v', 'U', 'u', 'W', 'w', '8', 'X', 'x', 'Y', 'y', 'Z', 'z', '9'};

    /**
     * Validates an account number.
     *
     * @param accountNumber The account number to validate.
     * @return True if the account number is valid (exactly 10 digits),
     * otherwise false.
     */
    public static boolean isValidAccountNumber(String accountNumber) {
        return accountNumber.matches(ACCOUNT_NUMBER_VALID);
    }

    /**
     * Validates a password based on length and character criteria.
     *
     * @param password The password to validate.
     * @return True if the password is valid (between 8 and 31 characters with
     * at least one letter and one digit), otherwise false.
     */
    public static boolean isValidPassword(String password) {
        int lengthPassword = password.length();
        if (lengthPassword < 8 || lengthPassword > 31) {
            return false;
        } else {
            int countDigit = 0;
            int countLetter = 0;
            for (int i = 0; i < lengthPassword; i++) {
                if (Character.isDigit(password.charAt(i))) {
                    countDigit++;
                } else if (Character.isLetter(password.charAt(i))) {
                    countLetter++;
                }
            }
            return countDigit >= 1 && countLetter >= 1;
        }
    }

    /**
     * Generates a random captcha text.
     *
     * @return The generated captcha text (6 characters chosen from a predefined
     * character set).
     */
    public static String generateCaptchaText() {
        SecureRandom random = new SecureRandom();
        StringBuilder captchaTextBuilder = new StringBuilder();
        int length = 6;
        for (int i = 0; i < length; i++) {
            char randomChar;

            if (random.nextBoolean()) {
                randomChar = (char) (random.nextInt(26) + 'a'); // a : 97

            } else {
                if (random.nextBoolean()) {
                    randomChar = (char) (random.nextInt(26) + 'A'); // A : 65

                } else {
                    randomChar = (char) (random.nextInt(10) + '0'); // 0 : 48
                }
            }
            captchaTextBuilder.append(randomChar);
        }

        return captchaTextBuilder.toString();
    }

//    public static String generateCaptchaText() {
//        StringBuilder captchaTextBuilder = new StringBuilder();
//        int length = 6;
//        Random random = new Random();
//        for (int i = 0; i < length; i++) {
//            int index = random.nextInt(captchaChars.length);
//            captchaTextBuilder.append(captchaChars[index]);
//        }
//        return captchaTextBuilder.toString();
//    }
   
    /**
 * Checks if the user-entered captcha is correct.
 * @param userInput The user-entered captcha.
 * @param generatedCaptcha The captcha generated by the system.
     * @return 
 */
//   public static void isCaptchaCorrect(String userInput, String generatedCaptcha) {
//    if (userInput.length() != generatedCaptcha.length()) {
//        System.out.println("Wrong captcha");
//        return;
//    }
//
//    for (int i = 0; i < userInput.length(); i++) {
//        if (userInput.charAt(i) != generatedCaptcha.charAt(i)) {
//            System.out.println("Wrong captcha");
//            return;
//        }
//    }
//
//    System.out.println("Correct");
//}

//    public static String isCaptchaCorrect(String userInput, String generatedCaptcha) {
//        if (userInput.length() != generatedCaptcha.length()) {
//            return "Wrong captcha";
//        }
//
//        for (int i = 0; i < userInput.length(); i++) {
//            if (userInput.charAt(i) != generatedCaptcha.charAt(i)) {
//                return " Wrong captcha";
//            }
//        }
//
//        return "Correct";
//    }
    public static boolean isCaptchaCorrect(String userInput, String generatedCaptcha) {
        if (userInput.length() != generatedCaptcha.length()) {
            return false;
        }

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) != generatedCaptcha.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p0070;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author WuanTun
 */
public class Ebank {

    private Locale locale;

    public static void setLocale(Locale locale) {
        ResourceBundle.getBundle("language", locale);
    }

    public String getMessage(String key) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("language", locale);
        return resourceBundle.getString(key);
    }

    public String checkAccount(String accountNumber) {
        if (!accountNumber.matches(Controller.getAccountInput(locale))) {
            return Controller.getAccountInput(locale);
        }
        return null;
    }

    public String checkPassword(String password) {

        if (!password.matches(Controller.getPasswordInput(locale))) {
            return Controller.getPasswordInput(locale);
        }
        return null;
    }
    private static String currentCaptcha;

    public String generateCaptchaText() {
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

        currentCaptcha = captchaTextBuilder.toString();
        return currentCaptcha;
    }

    public String checkCaptcha(String captchaInput, String captchaGenerate) {
        if (captchaInput.equals(captchaGenerate)) {
            return "Captcha correct";
        } else {
            return "Captcha incorrect";
        }
    }

}

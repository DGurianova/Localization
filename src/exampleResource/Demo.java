package exampleResource;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale locale;

        System.out.println("Select country: \n");
        String stringChoice = scanner.next();
        switch (stringChoice) {
            case "de":
                locale = new Locale("de", "DE");
                break;
            case "ua":
                locale = new Locale("ua", "UA");
                break;
            case "DE":
                locale = new Locale("de", "DE");
                break;
            case "UA":
                locale = new Locale("ua", "UA");
                break;
            default:
                locale = new Locale("de", "DE");
                break;
        }

        ResourceBundle exampleBundleDE = ResourceBundle.getBundle("exampleResource.ExampleResource", locale);

        System.out.println(exampleBundleDE.getString("currency"));
        System.out.println(exampleBundleDE.getObject("toUsdRate"));
        System.out.println(exampleBundleDE.getString("capital"));

    }
}

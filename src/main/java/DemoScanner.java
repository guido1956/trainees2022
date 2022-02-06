import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        // demoScanner1();
        demoScanner2();
    }

    public static void demoScanner1() {
        String firstName = inputTekst("Wat is de voornaam?");
        String insertion = inputTekst("Wat is het tussenvoegsel? [Enter] als er geen tussenvoegsel is");
        String lastname = inputTekst("Wat is de achternaam?");
        int  age = inputValue("Wat is de leeftijd?");
        printFullName(firstName, insertion, lastname);

    }

    public static void demoScanner2() {
        for (int i = 1; i <=3 ; i++) {
            String firstName = inputTekst("Wat is de voornaam?");
            String insertion = inputTekst("Wat is het tussenvoegsel? [Enter] als er geen tussenvoegsel is");
            String lastname = inputTekst("Wat is de achternaam?");
            int age = inputValue("Wat is de leeftijd?");
            printFullName(firstName, insertion, lastname);
        }

    }

    public static String inputTekst(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String input = scanner.nextLine();  // method om tekst in te lezen
        return input;
    }

    public static int inputValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int input = scanner.nextInt();  // method om gehele getallen in te lezen
        return input;
    }

    public static void printFullName(String first, String inbetween, String last) {
        // work in progress
    }
}

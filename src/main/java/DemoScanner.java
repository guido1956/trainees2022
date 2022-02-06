import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        // demoScanner1();
        //demoScanner2();
        demoScanner3();
    }

    public static void demoScanner1() {
        String firstName = inputText("Wat is de voornaam?");
        String insertion = inputText("Wat is het tussenvoegsel? [Enter] als er geen tussenvoegsel is");
        String lastname = inputText("Wat is de achternaam?");
        int  age = inputValue("Wat is de leeftijd?");
        printFullName(firstName, insertion, lastname);

    }

    public static void demoScanner2() {
        for (int i = 1; i <=3 ; i++) {
            String firstName = inputText("Wat is de voornaam?");
            String insertion = inputText("Wat is het tussenvoegsel? [Enter] als er geen tussenvoegsel is");
            String lastname = inputText("Wat is de achternaam?");
            int age = inputValue("Wat is de leeftijd?");
            printFullName(firstName, insertion, lastname);
        }
    }

    public static void demoScanner3() {
        boolean isContinue = true;
        do {
            String firstName = inputText("Wat is de voornaam?");
            String insertion = inputText("Wat is het tussenvoegsel? [Enter] als er geen tussenvoegsel is");
            String lastname = inputText("Wat is de achternaam?");
            int age = inputValue("Wat is de leeftijd?");
            printFullName(firstName, insertion, lastname);
            String doorgaan = inputText("Nog een naam invoeren? J/N");
            if (doorgaan.equalsIgnoreCase("N")) {
                isContinue = false;
            }
        } while (isContinue);
        System.out.println("U bent gestopt met namen invoeren");
    }


    public static String inputText(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String input = scanner.nextLine();  // method om tekst in te lezen
        return input;
    }

    public static int inputValue(String message) {
        Scanner scanner = new Scanner(System.in);
        boolean isInputCorrect = false;
        int input = 0;
        do {
            System.out.println(message);
            try {
                 input = scanner.nextInt();  // method om gehele getallen in te lezen
                isInputCorrect = true;
            } catch(Exception e ) {
                System.out.println("U dient een geheel getal in te voeren");
            }
        } while (!isInputCorrect);
        return input;
    }

    public static void printFullName(String first, String inbetween, String last) {
        // work in progress
    }
}

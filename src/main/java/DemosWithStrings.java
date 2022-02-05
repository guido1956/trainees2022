import java.util.Locale;

public class DemosWithStrings {
    public static void main(String[] args) {
        demoIsIsIsDangerousWithObjects();
        demoMethodsString();
    }

    public static void demoMethodsString() {
        String myText = "Hello World";
        System.out.println(myText.toUpperCase());  //HELLO WORLD
        System.out.println(myText);  //Hello World, object is niet gewijzigd.
        System.out.println(myText.substring(6));  // World  vanaf positie 6 tot einde
        System.out.println(myText.substring(6,8)); //Wo  van positie 6 TOT positie 8
        System.out.println(myText.toUpperCase().substring(6,8)); // WO

        myText = myText.toUpperCase(); // oorspronkelijk object wordt gedelete en een nieuwe wordt aangemaakt
        System.out.println(myText);  //HELLO WORLD
    }

    public static void demoIsIsIsDangerousWithObjects() {
        int number1 = 15;
        int number2 = 15;
        if (number1 == number2) {
            System.out.println("De waarden van de twee variabelen zijn gelijk");
        } else {
            System.out.println("De waarden van de twee variabelen zijn NIET gelijk");
        }

        String text1 = "Hallo";
        String text2 = "Hallo";
        if (text1 == text2) {
            System.out.println("De waarden van de twee variabelen zijn gelijk");
        } else {
            System.out.println("De waarden van de twee variabelen zijn NIET gelijk");
        }

        String text3 = new String("Hallo");
        String text4 = new String("Hallo");
        if (text3 == text4) {
            System.out.println("De waarden van de twee variabelen zijn gelijk");
        } else {
            System.out.println("De waarden van de twee variabelen zijn NIET gelijk");
        }
        if (text3.equals(text4)) {
            System.out.println("De waarden van de twee variabelen zijn gelijk");
        } else {
            System.out.println("De waarden van de twee variabelen zijn NIET gelijk");
        }
    }
}

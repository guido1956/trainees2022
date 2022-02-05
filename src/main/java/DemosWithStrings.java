public class DemosWithStrings {
    public static void main(String[] args) {
        demoIsIsIsDangerousWithObjects();
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
    }


}

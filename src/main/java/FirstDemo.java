public class FirstDemo {

    public static void main(String[] args) {
        // welcome();
       //  demoConcatenation();
       // demoVariables();
        String completeName = demoConcatenationWithParams("Jan", "Janssen");
        System.out.println(completeName);
        System.out.println("Einde programma");
    }


    public static String demoConcatenationWithParams(String firstName, String lastName ) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public static void demoVariables() {
        String colorTableTop = "zwart";
        System.out.println(colorTableTop);
        colorTableTop = "wit";
        System.out.println(colorTableTop);
    }


    public static void welcome() {
        System.out.println("Hallo trainees!");
    }

    public static void demoConcatenation() {
        System.out.println("Dit is een tekst " + ", een lange tekst!");
    }
}

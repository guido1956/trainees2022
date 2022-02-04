public class FirstDemo {

    public static void main(String[] args) {
        // welcome();
       //  demoConcatenation();
       // demoVariables();
       // String completeName = demoConcatenationWithParams("Jan", "Janssen");
        //demoArithmetic();
      //  System.out.println(completeName);
        demoIf();
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

    public static void demoIf() {
        boolean itRains = true;
        System.out.println("Wat jammer, het regent");
        actionForWalkingOutside(itRains);
        itRains = false;
        System.out.println("Gelukkig het regent niet");
        actionForWalkingOutside(itRains);
    }

    public static void actionForWalkingOutside(boolean itRains) {
        if (itRains) {
            System.out.println("Neem paraplu mee");
            System.out.println("Trek een regenjas aan");
        } else {
            System.out.println("Trek gewone jas aan");
        }
    }


    public static void welcome() {
        System.out.println("Hallo trainees!");
    }

    public static void demoConcatenation() {
        System.out.println("Dit is een tekst " + ", een lange tekst!");
    }

    public static void demoArithmetic() {
        System.out.println(4 + 5 + 12 % 6 * 3 /9);

    }
}

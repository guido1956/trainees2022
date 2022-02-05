public class FirstDemo {

    public static void main(String[] args) {
        // welcome();
       //  demoConcatenation();
       // demoVariables();
       // String completeName = demoConcatenationWithParams("Jan", "Janssen");
        //demoArithmetic();
      //  System.out.println(completeName);
        // demoIf();
       // demoGenesteIf();
       // demoRelationeleOperatoren();
        demoIntandDouble();
        System.out.println("Einde programma");
    }

    public static void demoIntandDouble() {
        int number1 = 12;
        int number2 = 24;
        System.out.println(number1 + number2);

        double number3 = 12;
        double number4 = 24;
        System.out.println(number3 + number4);

        // int kan wel toegekend worden aan een double, anders om kan niet
        double number5 = number1 + number2;
        // number1 = number5 + 1 //dit kan niet!!!
        System.out.println(number5);
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

    public static void demoRelationeleOperatoren() {
        boolean itRains = false;
        double temperature  = 0.0; //varieer naar hartelust
        actionForWalkingOutside( itRains, temperature);
    }

    public static void demoGenesteIf() {
        boolean itRains = true;
        boolean outsideTemperatureAbove15 = false;
        System.out.println("Wat jammer, het regent en het is koud");
        actionForWalkingOutside(itRains, outsideTemperatureAbove15);
        itRains = false;
        System.out.println("Gelukkig het regent niet, maar het is wel koud");
        actionForWalkingOutside(itRains, outsideTemperatureAbove15);
    }

    public static void actionForWalkingOutside(boolean itRains) {
        if (itRains) {
            System.out.println("Neem paraplu mee");
            System.out.println("Trek een regenjas aan");
        } else {
            System.out.println("Trek gewone jas aan");
        }
    }

    public static void actionForWalkingOutside(boolean itRains, boolean isWarm) {
        if (itRains) {
            System.out.println("Neem paraplu mee");
            System.out.println("Trek een regenjas aan");
        } else {
            if (!isWarm) {
                System.out.println("Trek gewone jas aan");
            }
        }
    }

    public static void actionForWalkingOutside(boolean itRains, double temperature) {
       if (itRains) {
           System.out.println("Blijf thuis");
           return;
       }
       if (temperature > 40.0) {
           System.out.println("Blijf thuis");
           return;
       }

       if (temperature >= 25) {
           System.out.println("Draag zomerkleding");
           if (temperature > 30) {
               System.out.println("Neem zwemkleding mee");

           }
       } else {
           if (temperature == 0.00) {
               System.out.println("Doe test of ijs buiten smelt of niet");
           }
           if (temperature < 15) {
               System.out.println("Trek jas aan");
           }
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

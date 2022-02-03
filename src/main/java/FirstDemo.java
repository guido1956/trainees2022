public class FirstDemo {

    public static void main(String[] args) {
        // welcome();
       //  demoConcatenation();
        demoVariables();
        System.out.println("Einde programma");
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

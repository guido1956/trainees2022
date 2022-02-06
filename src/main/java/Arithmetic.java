public class Arithmetic {
    public static void main(String[] args) {
        int number1 = 36;
        int number2 = 5;
        double number3 = 15;
        double number4 = 2;
        int result1 = 0;
        double result2 = 0;
        result1 = add(number1, number2);
        result2 = add(number3, number4);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add (double a, double b) {
        return a + b;
    }

    public static String calculateModulo  (int number, int divideNumber) {
        return "Restgetal als je " + number + " deelt door " + divideNumber +
                " is" + (number % divideNumber);
    }
}



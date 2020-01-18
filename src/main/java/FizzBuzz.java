public class FizzBuzz {
    public static String valueOf(int number) {
        if (fiveIsDivisorOf(number) && threeIsDivisorOf(number)) return "fizzbuzz";
        if (fiveIsDivisorOf(number)) return "buzz";
        return (threeIsDivisorOf(number)) ? "fizz" : String.valueOf(number);
    }

    private static boolean fiveIsDivisorOf(int number) {
        return (number%5 == 0);
    }

    private static boolean threeIsDivisorOf(int number) {
        return (number%3 == 0);
    }

    /*
    public static String valueOf(int number) {
        String result = "";
        if (number%3 == 0) result+="fizz";
        return (number%5 == 0) ? result+="buzz" : String.valueOf(number);
    }
     */
}

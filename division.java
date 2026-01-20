public class DivisionProgram {

    public static void main(String[] args) {
        // Declare and initialize variables
        int dividend = 50;
        int divisor = 5;

        // Perform division only if the divisor is not zero
        if (divisor != 0) {
            // Cast one of the integers to a double to get a precise floating-point result
            double result = (double) dividend / divisor;
            System.out.println("The result of the division is: " + result);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}

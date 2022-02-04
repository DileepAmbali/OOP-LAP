import java.util.Scanner;

class exceptiontest {

    static int factorial(int n) throws ArithmeticException {

        if (n < 0) {
            throw new ArithmeticException("Cannot find factorial of " + n + " (Negative Number) ");
        }
        int fac = 1;
        for (int i = 2; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) {
        System.out.println("");
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int r = s.nextInt();
            System.out.println("The factorial of " + r + " is: " + factorial(r));
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        } finally {
            System.out.println("Finally block");
        }

    }
}
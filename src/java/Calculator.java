public class Calculator {

    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return a / b;
    }

    public boolean isDivisionByZero(int b) {
        return b != 0;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public boolean isPositivesNums(int a, int b) {
        return a >= 0 && b >= 0;
    }

    public boolean isNegativesNums(int a, int b) {
        return a < 0 && b < 0;
    }
}
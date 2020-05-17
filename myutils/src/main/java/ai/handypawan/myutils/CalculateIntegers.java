package ai.handypawan.myutils;

/**
 * Created by pawan on 17,May,2020
 */
public class CalculateIntegers {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static float division(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Div by zero error");
        else
            return a / b;

    }
}

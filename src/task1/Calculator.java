package task1;

import java.util.function.IntBinaryOperator;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        IntBinaryOperator add = (a, b) -> a + b;
        IntBinaryOperator sub = (a, b) -> a - b;

        System.out.println(calculator.operateBinary(5, 12, sub));

    }

    private int operateBinary(int a, int b, IntBinaryOperator integerMath){
        return integerMath.applyAsInt(a , b);
    }
}

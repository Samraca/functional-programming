package punto5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;

public class Punto5 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("0.43284923");
        BigDecimal num2 = new BigDecimal("0.83749382");

        BinaryOperator<BigDecimal> division = (x, y)-> x.divide(y, 4, RoundingMode.HALF_UP);

        System.out.println("Numero 1: "+num1);
        System.out.println("Numero 2: "+num2);
        System.out.println("Resultado: "+division.apply(num1, num2));
        System.out.println(division.apply(num1, num2).getClass());
    }
}

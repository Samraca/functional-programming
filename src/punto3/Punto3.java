package punto3;

import java.util.function.Function;
import java.util.function.Predicate;

public class Punto3 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x*x;
        int squared = square.apply(2);
        Predicate<Integer> isEven = x -> x % 2 == 0;
        String validation = (isEven.test(squared)) ? "Even" : "odd";
        System.out.println(validation);
    }
}

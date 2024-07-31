package punto2;

import java.util.function.Function;

public class Punto2 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x*x;
        int squared = square.apply(2);
        System.out.println(squared);
    }
}

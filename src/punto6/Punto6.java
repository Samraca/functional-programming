package punto6;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;

public class Punto6 {
    public static void main(String[] args) {
        Trifunction<String, Integer, LocalDate, String> SAMFunction = (name, age, date) -> {
            BiFunction<Integer, LocalDate, Boolean> checkBirthDate = (x, y) -> {
                LocalDate actualDate = LocalDate.now();
                Period period = Period.between(y, actualDate);
                int calculatedAge = period.getYears();
                return calculatedAge==x;
            };

            return (checkBirthDate.apply(age, date)) ? "La fecha de nacimiento de "+name+" corresponde a la edad ingresada" :
                    "La fecha de nacimiento de "+name+" no corresponde a la edad ingresada";
        };

        LocalDate birthDate = LocalDate.of(2001,4,24);
        System.out.println("David, 23, 2001/4/24");
        System.out.println(SAMFunction.apply("Jon",23, birthDate));
    }
    @FunctionalInterface
    interface Trifunction<T, U, V, R>{
        R apply(T t, U u, V v);
    }
}

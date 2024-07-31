package punto7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Punto7 {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1924,4,27));
        dates.add(LocalDate.of(2011,9,18));
        dates.add(LocalDate.of(2006,5,23));
        dates.add(LocalDate.of(1994,4,7));
        dates.add(LocalDate.of(1997,2,10));

        dates.forEach(Punto7::datePrinter);
    }

    static void datePrinter(LocalDate date){
        System.out.println("La fecha es "+date.getDayOfMonth()+" de "+date.getMonth()+" del "+date.getYear());
    }
}

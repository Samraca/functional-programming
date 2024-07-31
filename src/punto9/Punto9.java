package punto9;

import java.util.Optional;
import java.util.stream.Stream;

public class Punto9 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Diego", "Luis", "Gerardo", "Carlos", "Javier", "David", "Daniel", "Miguel", "Alejandro", "José", "Juan", "Antonio", "Francisco", "Sergio", "Álvaro", "Rafael", "Marcos", "Andrés", "Víctor", "Manuel", "María", "Ana", "Laura", "Isabel", "Sofía", "Lucía", "Paula", "Carmen", "Marta", "Elena", "Julia", "Sara", "Cristina", "Andrea", "Irene", "Blanca", "Valeria", "Inés", "Raquel", "Gemma", "Alex", "Andrea", "Daniel", "Jordan", "Kimberly", "Leslie", "Noa", "Taylor", "Toni", "Yanira");
        printList(filterBy(names,"Lu"));
    }

    static Optional<Stream<String>> filterBy(Stream<String> stream, String criteria){
        System.out.println("Filtering by '"+criteria+"': ");
        return Optional.of(stream.filter(x -> x.contains(criteria)));
    }

    static void printList(Optional<Stream<String>> stream){
        stream.ifPresent(stringStream -> stringStream.forEach(System.out::println));
    }
}

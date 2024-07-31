package punto4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Punto4 {
    public static void main(String[] args) {
        //Supplier
        System.out.println("Supplier");
        Supplier<List<Book>> bookGenerator = () -> {
            List<Book> books = new ArrayList<>();
            books.add(new Book("Don Quijote de la Mancha","Miguel de Cervantes Saavedra", 9.5));
            books.add(new Book("Orgullo y Prejuicio","Jane Austen", 6.5));
            books.add(new Book("Cien años de soledad","Cien años de soledad", 10.0));
            return books;
        };
        for (Book book: bookGenerator.get()){
            System.out.println(book);
        }

        //Consumer
        System.out.println("\nConsumer");
        Consumer<List<Book>> consumerHelper = bookList -> {
            for (Book book: bookList){
                Predicate<Book> recommended = x -> x.getScore()>7;
                UnaryOperator<String> recommendation = bookName -> "El libro " + bookName + " es recomendado 😁";
                if (recommended.test(book)) {
                    System.out.println(recommendation.apply(book.getName()));
                }
            }
        };

        consumerHelper.accept(bookGenerator.get());
    }
}

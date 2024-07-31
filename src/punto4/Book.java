package punto4;

public class Book {
    private String name;
    private String author;
    private double score;

    public Book(String name, String author, double score) {
        this.name = name;
        this.author = author;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", score=" + score +
                '}';
    }
}

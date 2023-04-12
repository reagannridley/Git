package library;

public class Book {
    private String title;
    private String category;
    private String author;
    private String synopsis;

    public Book(String title, String category, String author, String synopsis) {
        this.title = title;
        this.category = category;
        this.author = author;
        this.synopsis = synopsis;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getAuthor() {
        return author;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public int countWords() {
        String[] words = synopsis.split("\\s+");
        return words.length;
    }

    public double checkSimilarity(Book other) {
        int sameAttributes = 0;
        if (this.title.equals(other.getTitle())) {
            sameAttributes++;
        }
        if (this.category.equals(other.getCategory())) {
            sameAttributes++;
        }
        if (this.author.equals(other.getAuthor())) {
            sameAttributes++;
        }
        if (this.synopsis.equals(other.getSynopsis())) {
            sameAttributes++;
        }
        return (double) sameAttributes / 4 * 100;
    }

    public Book copy() {
        Book copy = new Book(title, category, author, synopsis);
        return copy;
    }
    public double hitungRoyalti(double hargaBuku){
        return (0.1) * hargaBuku;
    }
    public double hitungRoyalti(double hargaBuku, double persenBulanan){
        return  (persenBulanan/100) * hargaBuku;

}
}

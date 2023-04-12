public class Book {
    private String category;
    private String author;
    private String synopsis;
    private String title;

    public Book(String category, String author, String synopsis, String title) {
        this.category = category;
        this.author = author;
        this.synopsis = synopsis;
        this.title = title;
    }

    public Book copy() {
        // Book copyBook = new Book(this.category, this.author, this.synopsis, this.title);
        // return copyBook;
        return new Book(this.category, this.author, this.synopsis, this.title);
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

    public int countWords() {
        String[] words = synopsis.split("\\s+");
        return words.length;
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

    public String getTitle() {
        return title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

package library;
public class Main{
public static void main(String[] args) {
    Book book1 = new Book("Harry Potter and the Philosopher's Stone", "fiksi", "J.K. Rowling",
            "Harry Potter menerima surat dari Hogwarts School of Witchcraft and Wizardry.");
    Book book2 = new Book("Sapiens: A Brief History of Humankind", "sejarah", "Yuval Noah Harari",
            "Sapiens membahas sejarah manusia sejak zaman prasejarah hingga era modern.");
    Book book3 = new Book("Harry Potter and the Philosopher's Stone", "fiksi", "J.K. Rowling",
            "Harry Potter menerima surat dari Hogwarts School of Witchcraft and Wizardry.");

    // Cek jumlah kata pada sinopsis
    System.out.println("Jumlah kata pada sinopsis buku 1: " + book1.countWords());

    // Cek tingkat kesamaan antara dua buku
    double similarity = book1.checkSimilarity(book2);
    System.out.println("Tingkat kesamaan antara buku 1 dan buku 2: " + similarity + "%");

    // Copy object buku
    Book book1Copy = book1.copy();
    System.out.println("Buku 1 copy: " + book1Copy.getTitle() + ", " + book1Copy.getCategory() + ", "
            + book1Copy.getAuthor() + ", " + book1Copy.getSynopsis());

        
}

}
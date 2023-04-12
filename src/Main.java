import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kategori buku (fiksi, politik, sejarah, agama, teknologi): ");
        String category = scanner.nextLine();

        String author = "Penulis";
        String synopsis = "Ini adalah sinopsis buku yang terdiri dari minimal 10 kata.";
        String title = "Judul Buku";

        switch (category) {
            case "fiksi":
                // author = "Sally Rooney";
                // synopsis = "Popular, working-class Connell and wealthy outcast Marianne begin seeing each other in secret during high school, but Marianne ends the relationship when Connell deeply hurts her.";
                // title = "Normal People";
                
                author = "Alice Oseman";
                synopsis = "What if everything you set yourself up to be was wrong? Frances is a study machine with one goal. Nothing will stand in her way. not friends, not a guilty secret, not even the person she is on the inside";
                title = "Radio Silence";
          
                // author = "Alice Oseman";
                // synopsis = "The story of two British teens, Nick Nelson and Charlie Spring, at an all-boys grammar school.";
                // title = "Heartstopper";
               
                // author = "Haruki Murakami";
                // synopsis = "Set in metropolitan Tokyo over the course of one night.";
                // title = "After Dark";
               
                // author = "Akimi Yoshida";
                // synopsis = "Ash is just sleeping, I REPEAT ASH IS JUST SLEEPING PERIOD.";
                // title = "Banana Fish";
                break;

            case "politik":
                author = "Francis Fukuyama";
                synopsis = "Buku ini membahas tentang perkembangan demokrasi dan keberhasilannya.";
                title = "Trust: The Social Virtues and The Creation of Prosperity";
                break;
            case "sejarah":
                author = "Yuval Noah Harari";
                synopsis = "Sapiens membahas sejarah manusia sejak zaman prasejarah hingga era modern.";
                title = "Sapiens: A Brief History of Humankind";
                break;
            case "agama":
                author = "Karen Armstrong";
                synopsis = "Buku ini membahas tentang sejarah dan perkembangan agama-agama di dunia.";
                title = "A History of God: The 4,000-Year Quest of Judaism, Christianity and Islam";
                break;
            case "teknologi":
                author = "Andrew Ng";
                synopsis = "Buku ini membahas tentang kecerdasan buatan dan aplikasinya dalam berbagai bidang.";
                title = "Machine Learning Yearning";
                break;
            default:
                System.out.println("Kategori buku tidak valid.");
                System.exit(0);
        }

        Book book = new Book(category, author, synopsis, title);

        System.out.println("Buku yang Anda pilih:");
        System.out.println("Kategori: " + book.getCategory());
        System.out.println("Judul: " + book.getTitle());
        System.out.println("Penulis: " + book.getAuthor());
        System.out.println("Sinopsis: " + book.getSynopsis());
        System.out.println("Jumlah kata pada sinopsis: " + book.countWords());
        
       
        Book copiedBook = book.copy();
        System.out.println("Buku yang telah dicopy:");
        System.out.println("Kategori: " + copiedBook.getCategory());
        System.out.println("Judul: " + copiedBook.getTitle());
        System.out.println("Penulis: " + copiedBook.getAuthor());
        System.out.println("Sinopsis: " + copiedBook.getSynopsis());
        System.out.println("Jumlah kata pada sinopsis: " + copiedBook.countWords());

        

    }
    }
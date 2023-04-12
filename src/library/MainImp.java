package library;
//import huwaa.Book.*;
public class MainImp {
    public static void main(String[] args) {
        Book buku = new Book("Radio Silence","Fiksi", 
        "Alice Oseman",
        "What if everything you set yourself up to be was wrong? Frances is a study machine with one goal. Nothing will stand in her way. not friends, not a guilty secret, not even the person she is on the inside");
        
        System.out.print("Royalti buku: ");
        //System.out.print(buku.hitungRoyalti(3000000));
        System.out.println(buku.hitungRoyalti(3000000, 50));
    }
}

package exp2.t4;

public class Client {
    public static void main(String[] args) {

        System.out.println("book:");
        SimpleBook book = new SimpleBook();
        book.borrowBook();
        book.returnBook();
        System.out.println("");

        System.out.println("book1:");
        LoseBook book1 = new LoseBook(book);
        book1.borrowBook();
        book1.returnBook();
        book1.loseBook();
        System.out.println("");

        System.out.println("book2:");
        FreezeBook book2 = new FreezeBook(book1);
        book2.borrowBook();
        book2.returnBook();
        book2.freezeBook();
    }
}

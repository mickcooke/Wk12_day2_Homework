import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int getCollectionSize() {
        return collection.size();
    }


    public void borrowBook(Book book) {
        this.collection.add(book);
    }
}

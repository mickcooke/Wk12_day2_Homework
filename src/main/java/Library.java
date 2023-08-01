import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private Integer capacity;

    public Library(int capacity){
        this.stock = new ArrayList<>();
        this.capacity = capacity;

    }

    public int countStock() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.countStock() < this.capacity) {
            this.stock.add(book);
        }

    }
}

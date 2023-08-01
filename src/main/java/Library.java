import java.util.ArrayList;

import static jdk.nashorn.internal.objects.NativeString.indexOf;

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

    public Book removeBook(Book book) {
        int index = this.stock.indexOf(book);
        if(this.countStock() > 0) {
            return this.stock.remove(index);
        }else{
            return null;
        }
    }
}

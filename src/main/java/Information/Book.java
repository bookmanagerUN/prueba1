package Information;

import util.LinkedList;

public class Book {

    int actualPage = 0;
    boolean status = false;
    LinkedList<Object> book = new LinkedList<>();
    
    public Book(int id, String name, String author, String category) {
        
        BookInformation bI = new BookInformation(id, name, author, category);
        //BookNotes bN = new BookNotes();
        
        book.insertEnd(bI.bookInformation());   
        book.insertEnd(actualPage);
        //book.insertEnd(bN.bookNotes());
        book.insertEnd(status);
    }

    public Book(int actualPage) {
        this.actualPage = actualPage;
    }
    
    public Book(boolean status) {
        this.status = status;
    }

    public Book(String name, String date, int page, int paragraph, String note) {
        
        //libro con name
        //booknotes
    }
    
}

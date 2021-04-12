package Information;

import util.LinkedList;

public class BookInformation {
    
    int id = 0;
    String name = null;
    String author = null;
    String category = null;
    
    public BookInformation(){
        
    }

    public BookInformation(int id, String name, String author, String category) {
        
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        
    } 

    //bookinformation[id, name, author, category]
    LinkedList<Object> bookInformation = new LinkedList<>();

    public LinkedList<Object> bookInformation() {

        bookInformation.insertEnd(id);
        bookInformation.insertEnd(name);
        bookInformation.insertEnd(author);
        bookInformation.insertEnd(category);

        return bookInformation;
    }

}

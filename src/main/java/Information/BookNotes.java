package Information;

import util.LinkedList;

public class BookNotes extends Notes {

    String bookName = null;

    public BookNotes() {
    }

    public BookNotes(String bookName, String date, int page, int paragraph, String note) {
        super(date, page, paragraph, note);
        this.bookName = bookName;
    }
    //BookNotes(nameBook,Notes)
    LinkedList<Object> bookNotes = new LinkedList<>();

    public LinkedList<Object> bookNotes() {

        Notes notes = new Notes();

        bookNotes.insertEnd(bookName);
        bookNotes.insertEnd(notes.newNote());
        
        return bookNotes;

    }

}

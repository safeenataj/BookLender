package saf.lexicon;


public class Book {
    private String title;
    private Person currentPerson;

    public Book(String title) {
        this.title = title;
        this.currentPerson = null;
    }

    public void loanTo(Person person) {
        this.currentPerson = person;
        person.addBook(this);
    }

    public void returnBook() {
        if (this.currentPerson != null) {
            this.currentPerson.removeBook(this);
            this.currentPerson = null;
        }
    }

    public Person getCurrentPerson() {
        return currentPerson;
    }

    public String getTitle() {
        return title;
    }
}


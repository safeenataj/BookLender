package saf.lexicon;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye");
        Book book2 = new Book("1984");
        Person person1 = new Person("Alice");

        // Alice loans book1 and book2
        book1.loanTo(person1);
        book2.loanTo(person1);

        // Check loaned books
        System.out.println(person1.getName() + " has loaned: " + getLoanedBooksTitles(person1));
        // Output: Alice has loaned: [The Catcher in the Rye, 1984]

        // Check current person holding book1
        System.out.println("The book '" + book1.getTitle() + "' is loaned to " + book1.getCurrentPerson().getName());
        // Output: The book 'The Catcher in the Rye' is loaned to Alice

        // Alice returns book1
        book1.returnBook();

        // Check loaned books again
        System.out.println(person1.getName() + " has loaned: " + getLoanedBooksTitles(person1));
        // Output: Alice has loaned: [1984]

        // Check current person holding book1
        System.out.println("The book '" + book1.getTitle() + "' is loaned to " + book1.getCurrentPerson());
        // Output: The book 'The Catcher in the Rye' is loaned to null
    }

    private static String getLoanedBooksTitles(Person person) {
        List<String> titles = new ArrayList<>();
        for (Book book : person.getBooksLoaned()) {
            titles.add(book.getTitle());
        }
        return titles.toString();
    }
}

package saf.lexicon;


    import java.util.ArrayList;
import java.util.List;

    public class Person {
        private static  int Sequencer=0;
        private int Id;
        private String FirstName;
        private String LastName;


        public Person(int id,String FirstName,String LastName) {
            validateStringParams(Id, "Id");
            this.Id = Id;


            setFirstName(FirstName);
             setLastName(LastName);
             this.booksLoaned=new Book[0];



        }
        public int getId()
        {
            return id;
        }

         public String getFirstName() {
                    return FirstName;
                }
                 public String getLastName() {
                            return LastName;  }
        
        public void loanBook(Book book) {
            if (!booksLoaned.contains(book)) {
                booksLoaned.add(book);
            }
        }

        public void returnBook(Book book) {
            booksLoaned.remove(book);
        }

        public List<Book> getBooksLoaned() {
            return booksLoaned;
        }

        public String getPersonInformation() {
            return name;
        }
    }



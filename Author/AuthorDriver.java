package Author;

import java.util.*;

public class AuthorDriver {
    public static void main(String[] args) {
        Book Book1 = new Book("Harry Potter", 15.5, 3);
        author Author1 = new author("JK Rowling", 'f');
        Author1.setEmail("jk.rowling@gmail.com");
        System.out.println(Book1.print());
        System.out.println(Author1.toString());
        
    }
}

package book;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BookTest
{
    @Test
    public void constructorTest()
    {
        Book b1 = new Book("John Steinbeck", "Of Mice and Men", 107);
        Book b2 = new Book("Kozsik Tamás", "Java programozás", 234);
        Book b3 = new Book("Alan Alexander Milne", "Winnie-the-Pooh", 145);

        assertFalse(!b.order(g));
    }

}
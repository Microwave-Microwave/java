package cafe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CafeTest
{
    @Test
    public void adultOrder()
    {
        Bartender b = new Bartender(18);
        Guest g = new Adult("Martin", 20);
        assertTrue(b.order(g));
        assertFalse(!b.order(g));
    }

    @Test
    public void minorOrder()
    {
        Bartender b = new Bartender(18);
        Guest g = new Minor("Dávid", 14);
        assertTrue(!b.order(g));
        assertFalse(b.order(g));
    }
}
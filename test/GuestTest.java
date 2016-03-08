import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    @Test
    public void test_getName_gives_name_with_prefix() throws Exception {
        Guest person = new Guest(new Name("Ram", "Laal"), Gender.Male, "20", new Address("Banglore","Karnataka","India"));
        assertEquals("Mr Ram Laal", person.getFirstNameFirst());
    }

    @Test
    public void test_getLastNameFirst_gives_last_name_first() throws Exception {
        Guest person = new Guest(new Name("Ram", "Laal"), Gender.Male, "20", new Address("Banglore","Karnataka","India"));
        assertEquals("Mr Laal,Ram", person.getLastNameFirst());
    }
}
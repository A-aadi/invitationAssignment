import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest male;
    private Guest female;

    @Before
    public void setUp() throws Exception {
        Address address = new Address("Banglore", "Karnataka", "India");
        male = new Guest(new Name("Ram", "Laal"), Gender.Male, "20", address);
        female = new Guest(new Name("Ram", "Laali"), Gender.Female, "20", address);
    }

    @Test
    public void test_getName_gives_name_with_prefix() throws Exception {
        assertEquals("Mr Ram Laal", male.getFirstNameFirst());
    }

    @Test
    public void test_getLastNameFirst_gives_last_name_first() throws Exception {
        assertEquals("Mr Laal,Ram", male.getLastNameFirst());
    }

    @Test
    public void test_getFirstNameFirst_gives_first_name_first_with_Ms_prefix_if_person_is_female() throws Exception {
        assertEquals("Ms Ram Laali", female.getFirstNameFirst());
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by adarshasa on 07/03/16.
 */
public class AddressTest {
    @Test
    public void test_get_full_address_should_give_full_address_of_any_guest() throws Exception {
        Address new_address = new Address("Bangalore", "Karnataka", "India");
        assertEquals("City - Bangalore, State - Karnataka, Country - India", new_address.getFullAddress());
    };

    @Test
    public void test_getCountry_should_give_only_country_name() throws Exception {
        Address new_address = new Address("Banglore", "Karnataka", "India");
        assertEquals("India", new_address.getCountry());

    }
}
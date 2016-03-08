import org.junit.Test;

import static org.junit.Assert.*;

public class GenderTest {
    @Test
    public void test_by_using_getPrefix_we_should_get_Mr_prefix_if_guest_is_male() throws Exception {
        assertEquals("Mr", Gender.Male.getPrefix());
    }

    @Test
    public void test_by_using_getPrefix_we_should_get_Ms_prefix_if_guest_is_female() throws Exception {
        assertEquals("Ms", Gender.Female.getPrefix());
    }
}
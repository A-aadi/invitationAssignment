import org.junit.Test;

import static org.junit.Assert.*;

public class GenderTest {
    @Test
    public void test_by_using_getPrefix_we_should_get_honorific_of_a_guest() throws Exception {
        assertEquals("Mr", Gender.Male.getPrefix());
    }
}
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void test_firstLastFormat_gives_first_name_first_and_last_name_first() throws Exception {
        Name n = new Name("Ram","Laal");
        assertEquals("Ram Laal", n.firstLastFormat());
    }

    @Test
    public void test_lastFirstFormat_gives_last_name_first_and_first_name_last() throws Exception {
        Name n = new Name("Ram","Laal");
        assertEquals("Laal,Ram", n.lastFirstFormat());
    }
}

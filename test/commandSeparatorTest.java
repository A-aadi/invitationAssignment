import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CommandSeparatorTest {
    @Test
    public void test_refineCommands_filters_options_and_puts_in_a_hashMap_and_cretes_keys_occordingly_command_line_arguments() throws Exception {
        HashMap commandMap = CommandSeparator.refineCommands(new String[]{"-fl", "record.txt"});
        assertTrue(commandMap.containsKey("option"));
        assertTrue(commandMap.containsKey("file"));
        assertTrue(commandMap.get("option").equals("-fl"));
        assertTrue(commandMap.get("file").equals(("record.txt")));
    }
    @Test
    public void test_refineCommands_create_all_filterOptions_as_a_key_if_these_options_are_given() throws Exception {
        HashMap myMap = CommandSeparator.refineCommands(new String[]{"-fl", "record.txt", "--India", "_24"});
        assertTrue(myMap.containsKey("option"));
        assertTrue(myMap.containsKey("file"));
        assertTrue(myMap.containsKey("country"));
        assertTrue(myMap.containsKey("age"));

        assertTrue(myMap.get("option").equals("-fl"));
        assertTrue(myMap.get("file").equals(("record.txt")));
        System.out.println(myMap.get("country"));
//        assertTrue(myMap.get("country").equals("India"));
//        assertTrue(myMap.get("age").equals("24"));
    }
}
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class OptionManagerTest {
    List<String> data = new ArrayList<String>();
    OptionManager optionManager;
    HashMap<String, Object> mapper;
    @Before
    public void setUp() throws Exception {
        optionManager = new OptionManager();
        mapper = new HashMap<String, Object>();
        mapper.put("option","-fl");
        mapper.put("file","record.txt");
        data.add("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia");
        data.add("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        data.add( "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania");
    }

    @Test
    public void test_giveGuestList_should_give_name_only_in_first_last_format() throws Exception {
        List<String> outputData = optionManager.giveGuestList(mapper, data);
        assertEquals("Ms Julius Barrows", outputData.get(0));
        assertEquals(3, outputData.size());
    }
    @Test
    public void test_giveGuestList_should_give_name_formally_and_should_filter_by_country_name() throws Exception {
        mapper.put("country","Romania");
        List<String> outputData = optionManager.giveGuestList(mapper, data);
        assertEquals("Mr Gavin Hyatt, Romania", outputData.get(0));
        assertEquals(1, outputData.size());
    }
}
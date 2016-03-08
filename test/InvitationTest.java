import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvitationTest {
    @Test
    public void test_getCardLableWithCountry_gives_fullName_and_country_as_lables() throws Exception {
        Invitation invitation = new Invitation();
        Guest person = new Guest(new Name("Ram", "Laal"), Gender.Male, "20", new Address("Banglore","Karnataka","India"));
        assertEquals("Mr Ram Laal,India", invitation.getCardLableFirstNameFirst(person));
    }

    @Test
    public void test_getCardLableLastNameFirst_gives_Last_name_first_as_lable() throws Exception {
        Invitation invitation = new Invitation();
        Guest person = new Guest(new Name("Ram", "Laal"), Gender.Male, "20", new Address("Banglore","Karnataka","India"));
        assertEquals("Mr Laal,Ram,India", invitation.getCardLableLastNameFirst(person));
    }
}
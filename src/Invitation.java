public class Invitation {
    public String getCardLableFirstNameFirst(Guest guest, String country) {
        if(guest.isResidentOf(country))
            return String.format("%s,%s", guest.guestInfo().get("-fl"), guest.guestInfo().get("country"));
    }

//    public String getCardLableLastNameFirst(Guest guest) {
//        return String.format("%s,%s", guest.guestInfo().get("-lf"), guest.guestInfo().get("country"));
//    }

    public String getCardLabelWithCountry(Guest guest){


    }
}
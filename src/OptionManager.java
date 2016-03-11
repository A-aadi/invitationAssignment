
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class OptionManager {

    public List<String> giveGuestList(HashMap<String, Object> optionMapper, List<String> fileData) {
        List<String> finalList = new LinkedList<String>();
        for (String guestInfo : fileData) {
            String[] personInfo = guestInfo.split(",");
            Guest guest;
            String city = personInfo[4];
            String state = personInfo[5];
            String country = personInfo[6];
            if (personInfo[2].contains("Male")) {
                guest = new Guest(new Name(personInfo[0], personInfo[1]), Gender.Male, personInfo[3], new Address(city, state, country));

            } else {
                guest = new Guest(new Name(personInfo[0], personInfo[1]), Gender.Female, personInfo[3], new Address(city, state, country));

            }

            if (optionMapper.containsKey("country") && guest.isResidentOf((String) optionMapper.get("country")))
                    finalList.add(guest.guestInfo().get(optionMapper.get("option")) + ", " + guest.guestInfo().get("country"));

            else if(optionMapper.containsKey("age") && guest.isGreater((Integer) optionMapper.get("age")))
                finalList.add(guest.guestInfo().get(optionMapper.get("option"))+", "+guest.guestInfo().get("age"));

            else if(optionMapper.get("country") == null && optionMapper.get("age") == null)
                finalList.add((String) guest.guestInfo().get(optionMapper.get("option")));

            }
            return finalList;
    }
}


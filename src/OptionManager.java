
import java.util.HashMap;
import java.util.List;

public class OptionManager {

    public List<String> giveGuestList(HashMap optionMapper, List<String> fileData) {
        List<String> finalList = null;
        for (String guestInfo : fileData) {
            String[] personInfo = guestInfo.split(",");
            Guest guest;
            String city = personInfo[4];
            String state = personInfo[5];
            String country = personInfo[6];
//            System.out.println(personInfo[2]);
            if (personInfo[2].contains("Male")) {
                guest = new Guest(new Name(personInfo[0], personInfo[1]), Gender.Male, personInfo[3], new Address(city, state, country));

            } else {
                guest = new Guest(new Name(personInfo[0], personInfo[1]), Gender.Female, personInfo[3], new Address(city, state, country));

            }
//            System.out.println(optionMapper.get("option"));
            if (optionMapper.get("option").equals("-fl")) {
                System.out.println("kkkk");
                System.out.println(guest.getFirstNameFirst());
                finalList.add(guest.getFirstNameFirst());
            }
            if (optionMapper.get("option") == "-lf") {
                finalList.add(guest.getLastNameFirst());
            }
        }
//        System.out.println(finalList.size());
        return finalList;
    }
}

//    private List convertToList(List fileData) {
//        for (Object data : fileData) {
//
//
//        }
//        System.out.println(data.length+"[[[");
//        LinkedList ll = new LinkedList();
//        for (int i = 0; i < data.length ; i++) {
//            ll.add(data[i]);
//
//        }
//        return ll;
//    }
//}

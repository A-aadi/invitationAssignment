
import java.util.HashMap;

public class Guest {
    private Name name;
    private Gender gender;
    private Integer age;
    private Address address;

    public Guest(Name name, Gender gender, String age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = Integer.parseInt(age);
        this.address = address;
    }

    public String getFirstNameFirst() {
        return String.format("%s %s", gender.getPrefix(), name.firstLastFormat());
    }
    public String getLastNameFirst() {
        return String.format("%s %s", gender.getPrefix(), name.lastFirstFormat());
    }
//    public HashMap nameFormat(){
//        return  name.nameFormat();
//    }

//    public String getAge(){
//        return this.age = ;
//    }
    public HashMap guestInfo(){
        HashMap<String, Object> formatMapper= new HashMap<String, Object>();
        formatMapper.put("-fl", this.getFirstNameFirst());
        formatMapper.put("-lf", this.getLastNameFirst());
        formatMapper.put("country", address.getCountry());
        formatMapper.put("age", this.age);
        return formatMapper;

//        name.nameFormat().put("country",address.getCountry());
//        name.nameFormat().put("age", this.age);
//        return  name.nameFormat();
    }

    public Boolean isResidentOf(String country) {
        return address.getCountry().equals(country);
    }

    public Boolean isGreater(int age){
        return this.age > age;
    }


}

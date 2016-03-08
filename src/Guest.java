public class Guest {
    private Name name;
    private Gender gender;
    private String age;
    private Address address;

    public Guest(Name name, Gender gender, String age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getFirstNameFirst() {
        return String.format("%s %s", gender.getPrefix(), name.firstLastFormat());
    }
    public String getLastNameFirst() {
        return String.format("%s %s", gender.getPrefix(), name.lastFirstFormat());
    }

    public String getCountry() {
        return address.getCountry();
    }
}

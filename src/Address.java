/**
 * Created by adarshasa on 07/03/16.
 */
public class Address {
    public String city;
    public String state;
    public String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String  getFullAddress() {
        return String.format("City - %s, State - %s, Country - %s", city, state, country);
    }

    public String getCountry() {
        return this.country;
    }

}

/**
 * Created by adarshasa on 07/03/16.
 */
public enum Gender {
    Male("Mr"),
    Female("Ms");

    private final String prefix;

    Gender(String prefix) {
        this.prefix = prefix;
    }
    public String getPrefix() {
        return prefix;
    }
}

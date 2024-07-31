package punto1;

import java.util.LinkedList;
import java.util.List;

public final class Immutable {
    private final String name ;
    private final String lastName;
    private final List<String> emails;

    public Immutable(String name, String lastName, List<String> emails) {
        this.name = name;
        this.lastName = lastName;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public final List<String> getEmails() {
        return new LinkedList<>(emails);
    }
}

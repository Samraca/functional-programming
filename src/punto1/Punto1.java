package punto1;

import java.util.LinkedList;
import java.util.List;

public class Punto1 {
    public static void main(String[] args) {
        List<String> genericEmail = new LinkedList<>();
        genericEmail.add("generic@email.com");

        Mutable generic = new Mutable();
        generic.setEmails(genericEmail);
        generic.setName("Jon");
        generic.setLastName("Doe");

        System.out.println("Mutable Class\nBefore attack: "+generic.getName()+generic.getLastName()+generic.getEmails());
        badFunction(generic);
        System.out.println("After attack: "+generic.getName()+generic.getLastName()+generic.getEmails());

        //Immutable Class
        List<String> uniqueEmail = new LinkedList<>();
        uniqueEmail.add("unique@email.com");
        Immutable unique = new Immutable("Jon","Doe", uniqueEmail);
        System.out.println("\nImmutable class:\nBefore attack: "+unique.getName()+unique.getLastName()+unique.getEmails());
        ultraBadFunction(unique);
        System.out.println("After attack: "+unique.getName()+unique.getLastName()+unique.getEmails());
    }

    static void badFunction(Mutable mutable){
        List<String> badEmails = new LinkedList<>();
        badEmails.add("imnotbad@email.com");
        mutable.setEmails(badEmails);
    }

    static void ultraBadFunction(Immutable immutable){
        List<String > emails = immutable.getEmails();
        emails.clear();
        emails.add("imbackbabythebadguy@email.com");
    }
}

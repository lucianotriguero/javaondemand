package modul06;

import java.util.Comparator;

public class ExtJfrPerson implements Comparator<Person> {

    public int compare(Person a, Person b) {
        return a.surname.compareTo(b.surname);
    }
}

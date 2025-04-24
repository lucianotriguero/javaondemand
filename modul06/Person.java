package modul06;

public class Person implements Comparable<Person> {

    public String name;
    public String surname;
    public String epost;

    Person() {};

    Person(String nm, String snm, String email) {
        this.name = nm;
        this.surname = snm;
        this.epost = email; 
    } 

    @Override
    public String toString() {
        String strout = String.format("%12s\t%10s\t%30s\n",this.name,this.surname,this.epost);
        return strout;
    }

    @Override
    public int compareTo(Person that) {
        return this.name.compareTo(that.name);
    }
}

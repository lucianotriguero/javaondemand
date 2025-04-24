package modul06;

public class Student implements Comparable<Student> {

    public String name;
    public String surname;
    public String epost;

    Student() {};

    Student(String nm, String snm, String email) {
        this.name = nm;
        this.surname = snm;
        this.epost = email;
    } 

    @Override
    public String toString() {
        String strout = String.format("%12s\t%10s\t%35s\n",this.name,this.surname,this.epost);
        return strout;
    }

    @Override
    public int compareTo(Student that) {
        return this.name.compareTo(that.name);
    }
    
}

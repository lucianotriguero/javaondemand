package modulbackup;

public class Student {

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
}

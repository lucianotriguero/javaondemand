package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class Person {

    //Attribut (Instansvariabler)
    private String name;
    private String surname;
    private int birthday;      //ÅÅÅÅMMDD
    private int length;        //[cm]
    private int weight;        //[kg] 

    //Instansmetoder
    //Defaultkonstruktor
    public Person() {};

    //Kopieringskonstruktor
    public Person(Person p) {
        this.setName(p.name);
        this.setSurName(p.surname);
        this.setBirthDay(p.birthday);
        this.setLength(p.length);
        this.setWeight(p.weight);;
    } 

    //Value constructor
    public Person(String name, String surname, int birthday, 
                  int length, int weight) {
        this.setName(name);
        this.setSurName(surname);
        this.setBirthDay(birthday);
        this.setLength(length);
        this.setWeight(weight);
    }

    //Setter 
    //Läxa: Förbättra metoden SetName med någon kontroll
    public void setName(String name) {
        this.name = name;
    }

    //Läxa: Förbättra metoden SetSurName med någon kontroll
    public void setSurName(String surname) {
        this.surname = surname;
    }

    public void setBirthDay(int birthday) {
        int ndigits = (int)(Math.log10(birthday)+1);
        if (ndigits != 8) {
            throw new ArithmeticException("Birthday format is: ÅÅÅÅMMDD");
        }
        else { 
            this.birthday=birthday;
        }
    }

   public void setLength(int length) {
        if (length >= 0 ) {
            this.length = length;
        }
        else { 
            throw new ArithmeticException("Negativ length");
        }
    }
    
    public void setWeight(int weight) {
        if (weight >= 0 ) {
            this.weight = weight;
        }
        else { 
            throw new ArithmeticException("Negativ weight");
        }
   }

    //Getters
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getBirthday() {
        return this.birthday;
    }


    //Läxa: Skapa alla andra getter!

    // //Metod: toString
    // public String toString() {
    //     String strout = "Name: " +this.name + "\n" 
    //     + "Surname: " +this.surname + "\n" 
    //     + "Birthday: " +this.birthday + "\n" 
    //     + "Length: " +this.length + " cm" + "\n"
    //     + "Weigth: " +this.weight + " kg";
    //     return strout;
    // }

    //Metod: toString
    public String toString() {
         String strout = String.format("%s:%s:%d:%d:%d",
                        this.name,this.surname,
                        this.birthday,this.length,this.weight);
         return strout;
    }

    public boolean equals(Person p) {
        if ( this.name == p.name && 
             this.surname == p.surname &&
             this.birthday == p.birthday &&
             this.length == p.length &&
             this.weight == p.weight ) {
                return true;
             } else {
                return false;
             }
    }




    //Programmeringsuppgift 3.2.2 a)
    //Alternativ 1
    public static double CalcBMI(Person p) {
        double y = (double) p.length; 
        double BMI = (p.weight/y/y)*1.0e4;
        return BMI;
    }

    //Alternativ 2
    public double CalcBMI() {
        double y = (double) this.length; 
        double BMI = (this.weight/y/y)*1.0e4;
        return BMI;
    }

}

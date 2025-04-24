package modul03;

/**
     * Course: Javaprogrammering
     * Modul 3
     * Purpose: Material till lektioner
     * (c) Luciano Triguero, 2023 
     */

public class Tentand {
    
    //Instansvariabler
    private String namn;
    private String efternamn;
    private String klassnamn;
    private String tentamensamne;
    private String betyg;

    //Defaultkonstruktor
    public Tentand() {};

    //Value Contructor
    public Tentand(String namn, String efternamn, String klassnamn, String tentamensamne, String betyg ) {
        this.namn = namn;
        this.efternamn = efternamn;
        this.klassnamn = klassnamn;
        this.tentamensamne = tentamensamne;
        this.betyg = betyg;
    }

    //Kopikonstruktor
    public Tentand(Tentand t) {
        this.namn = t.namn;
        this.efternamn = t.efternamn;
        this.klassnamn = t.klassnamn;
        this.tentamensamne = t.tentamensamne;
        this.betyg =t.betyg;
    }

    //Setter
    public void setNamn(String namn) { this.namn = namn;}
    public void setEfternamn(String efternamn) { this.efternamn = efternamn;}
    public void setKlassNamn(String klassnamn) { this.klassnamn = klassnamn;}
    public void setTentamensAnmne(String tentamentsamne) {this.tentamensamne = tentamentsamne;};
    public void setBetyg(String betyg) { this.betyg = betyg;}

    //Getters
    public String getNamn() {return namn;}
    public String getEfternamn() {return efternamn;}
    public String getKlassnamn() {return klassnamn;}
    public String getTentamensamne() {return tentamensamne;}
    public String getBetyg() {return betyg;}

    @Override
    public String toString() {
        return "Tentand [namn=" + namn + ", efternamn=" + efternamn + ", klassnamn=" + klassnamn + ", tentamensamne="
                + tentamensamne + ", betyg=" + betyg + "]";
    } 

}

package modul06;

/*
 * Modul 6
 * Purpose: A user-difined class to stores cards whith a code 
 * and an animal'sname
 * It is part of an application to show the use of Collections.binarysearch. 
 */

public class AnimalsCode {
    
    private int kod;
    private String djur;

    AnimalsCode() {};

    AnimalsCode(int k, String djurname) {
        this.setKod(k);
        this.setDjur(djurname);
    }

    public Integer getKod() {
        return Integer.valueOf(kod);
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getDjur() {
        return djur;
    }

    public void setDjur(String djur) {
        this.djur = djur;
    } 
}

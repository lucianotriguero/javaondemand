package modul06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import javax.swing.JFileChooser;


public class LPExempel614App {

    public LinkedList<Student> laut22 = new LinkedList<Student>();
    public LinkedList<Student> ljvg22 = new LinkedList<Student>();
    public LinkedList<Student> lvvs22 = new LinkedList<Student>();
    public LinkedList<Student> ljava22 = new LinkedList<Student>(); 
    public static enum Program { AUT22, JVG22, VVS22, JAVA22 }; 

    public static String readFile() {
        String aktuellMapp = System.getProperty("user.dir");
        JFileChooser fc = new JFileChooser(aktuellMapp);
        int resultat = fc.showOpenDialog(null);
        if (resultat != JFileChooser.APPROVE_OPTION) {
            System.out.println("Ingen fil valdes");
            System.exit(0);
        } 
        String filnamn = fc.getSelectedFile().getAbsolutePath();
        return filnamn;
    }

    //Default contructor
    LPExempel614App() {};

    //Parametrized constructor
    LPExempel614App(String fil) throws FileNotFoundException, IOException {

        try (BufferedReader istream = new BufferedReader
                                 (new FileReader(fil))) {                      
            String[] s = new String[100];                        
            while ( true ) {
                String rad = istream.readLine();
                if (rad == null) //är filen slut?
                break;  
                s = rad.split("\\s");
                Program flag = Program.valueOf(s[3]);
                switch(flag) {
                    case AUT22:
                        laut22.add(new Student(s[0],s[1],s[2]));    
                        break;
                    case JVG22:
                        ljvg22.add(new Student(s[0],s[1],s[2]));    
                        break;            
                    case VVS22:
                        lvvs22.add(new Student(s[0],s[1],s[2]));
                        break;
                    case JAVA22:
                        ljava22.add(new Student(s[0],s[1],s[2]));
                        break;
                    default:
                        System.out.println("Klassnamnet finns inte listan");
                        break;
                }
            }
            Collections.sort(laut22);
            Collections.sort(ljava22);
            Collections.sort(lvvs22);
            Collections.sort(ljvg22);
        }
    }

    public LinkedList<Student> getAUT22() {
        return laut22;
    }

    public LinkedList<Student> getJAVA22() {
        return ljava22;
    }

    public LinkedList<Student> getVVS22() {
        return lvvs22;
    }
    
    public LinkedList<Student> getJVG22() {
        return ljvg22;
    }

    public static void main(String[] args) throws IOException {

        String filnamn = readFile();
        LPExempel614App studdatabas = new LPExempel614App(filnamn);

        Map<String,LinkedList<Student>> tabell = new TreeMap<String,LinkedList<Student>>();
        tabell.put("AUT22", studdatabas.laut22);
        tabell.put("JVG22", studdatabas.ljvg22);
        tabell.put("VVS22", studdatabas.lvvs22);
        tabell.put("JAVA22",studdatabas.ljava22);

        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Alternativ: ");
            System.out.println("1 Lägger till en ny student i ett program");
            System.out.println("2 Raderar en student från ett program");
            System.out.println("3 Söker för en student i ett program");
            System.out.println("4 Skriver ut klasslistan för ett program");
            System.out.println("5 Skriver ut samtliga klasslistor sorterade efter program");
            System.out.println("6 Skapar en statistisk sammanställning");
            System.out.println("7 Avslutar");
            System.out.print("Choose one: ");
            choice = scan.nextInt();
            scan.nextLine();
            
            //Lägger in en ny student
            if (choice == 1) {
                System.out.println("Meny: Lägger till en ny student i ett program");
                System.out.print("Studentens namn: ");
                String studnamn = scan.next();
                studnamn = studnamn.toUpperCase();
                System.out.print("Studentens efternamn: ");
                String studefternamn = scan.next();
                studefternamn = studefternamn.toUpperCase();
                System.out.print("Studentens program: ");
                String program = scan.next();
                String epost = studnamn.toLowerCase()+"."+studefternamn.toLowerCase()+"@stud.sti.se";
                Program flag = Program.valueOf(program);
                switch(flag) {
                    case AUT22:
                        System.out.print("IN AUT22");
                        studdatabas.laut22.add(new Student(studnamn,studefternamn,epost)); 
                        tabell.put("AUT22", studdatabas.laut22); 
                        System.out.println(studdatabas.laut22);    
                        break;
                    case JVG22:
                        System.out.print("IN JVG22");
                        studdatabas.ljvg22.add(new Student(studnamn,studefternamn,epost)); 
                        tabell.put("JVG22", studdatabas.ljvg22);      
                        break;            
                    case VVS22:
                        System.out.print("IN VVS22");
                        studdatabas.lvvs22.add(new Student(studnamn,studefternamn,epost)); 
                        tabell.put("VVS22", studdatabas.lvvs22);
                        break;
                    case JAVA22:
                        System.out.print("IN JAVA22");
                        studdatabas.ljava22.add(new Student(studnamn,studefternamn,epost)); 
                        tabell.put("JAVA22", studdatabas.ljava22);  
                        break;
                    default:
                        System.out.println("Klassnamnet finns inte listan");
                        break;
                }
            }

            //Raderar en student från ett program
            if (choice == 2) {
                System.out.println("Meny: Raderar en student fr\u00E5n ett program");
                System.out.print("Studentens program: ");
                String program = scan.next();
                System.out.print("Studentens namn: ");
                String studnamn = scan.next();
                studnamn = studnamn.toUpperCase();
                Program flag = Program.valueOf(program);
                switch(flag) {
                    case AUT22:
                        System.out.print("IN AUT22");
                        Collections.sort(studdatabas.laut22);
                        int index = Collections.binarySearch(studdatabas.getAUT22(), new Student(studnamn,null,null));
                        if ( index >= 0 ) {
                            studdatabas.laut22.remove(index);
                        }
                        else {
                            System.out.println(" Studenten finns inte i listan");
                        }                           
                        tabell.put("AUT22", studdatabas.laut22);
                        //System.out.println(studdatabas.laut22);    
                        break;
                    case JVG22:
                        System.out.print("IN JVG22");
                        Collections.sort(studdatabas.ljvg22);
                        index = Collections.binarySearch(studdatabas.getJVG22(), new Student(studnamn,null,null));
                        if ( index >= 0 ) {
                            studdatabas.ljvg22.remove(index);
                        }
                        else {
                            System.out.println(" Studenten finns inte i listan");
                        }                           
                        tabell.put("JVG22", studdatabas.ljvg22);  
                        break;            
                    case VVS22:
                        System.out.print("IN VVS22");
                        Collections.sort(studdatabas.lvvs22);
                        index = Collections.binarySearch(studdatabas.getVVS22(), new Student(studnamn,null,null));
                        if ( index >= 0 ) {
                            studdatabas.lvvs22.remove(index);
                        }
                        else {
                            System.out.println(" Studenten finns inte i listan");
                        }                           
                        tabell.put("VVS22", studdatabas.lvvs22);  
                        break;
                    case JAVA22:
                        System.out.print("IN JAVA22");
                        Collections.sort(studdatabas.ljava22);
                        index = Collections.binarySearch(studdatabas.getJAVA22(), new Student(studnamn,null,null));
                        if ( index >= 0 ) {
                            studdatabas.ljava22.remove(index);
                        }
                        else {
                            System.out.println(" Studenten finns inte i listan");
                        }                           
                        tabell.put("JAVA22", studdatabas.ljava22);  
                        break;
                    default:
                        System.out.println("Programmet finns inte. Tillbaka till meny!");
                        break;
                }
            }

            //Söker efter en student 
            if (choice == 3) {
                System.out.println("Meny: Söker för en student i ett program");
                System.out.print("Studentens program: ");
                String program = scan.next();
                System.out.print("Studentens namn: ");
                String studnamn = scan.next();
                studnamn = studnamn.toUpperCase();
                Program flag = Program.valueOf(program);
                switch(flag) {
                    case AUT22:
                        System.out.print("Sökning i AUT22: ");
                        Collections.sort(studdatabas.getAUT22());
                        int index = Collections.binarySearch(studdatabas.getAUT22(), new Student(studnamn,null,null));
                        if ( index >= 0 ) {
                            System.out.print(studdatabas.laut22.get(index));
                        }
                        else {
                            System.out.println(" Studenten finns inte i listan");
                        }  
                        break;
                    case JVG22:
                        System.out.print("Sökning: JVG22");
                        Collections.sort(studdatabas.getJVG22());
                        index = Collections.binarySearch(studdatabas.getJVG22(), new Student(studnamn,null,null));
                        if ( index >= 0 ) {
                            System.out.print(studdatabas.ljvg22.get(index));
                        }
                        else {
                            System.out.println(" Studenten finns inte i listan");
                        }  
                        break;            
                    case VVS22:
                        System.out.print("Sökning: VVS22");
                        Collections.sort(studdatabas.getVVS22());
                        index = Collections.binarySearch(studdatabas.getVVS22(), new Student(studnamn,null,null));
                        if ( index >= 0 ) {
                            System.out.print(studdatabas.lvvs22.get(index));
                        }
                        else {
                            System.out.println(" Studenten finns inte i listan");
                        }  
                        break;
                    case JAVA22:
                        System.out.print("IN JAVA22");
                        Collections.sort(studdatabas.getJAVA22());
                        index = Collections.binarySearch(studdatabas.getJAVA22(), new Student(studnamn,null,null));
                        if ( index >= 0 ) {
                            System.out.print(studdatabas.ljava22.get(index));
                        }
                        else {
                            System.out.println(" Studenten finns inte i listan");
                        }  
                        break;
                    default:
                        System.out.println("Progammet finns inte databasen");
                        break;
                }
            }

            //Skriver ut klasslistan för ett program"
            if (choice == 4) {
                System.out.println("Alternativ: Skriver ut klasslistan f\u00F6r ett program");
                System.out.print("Vilket program: ");
                String program = scan.nextLine();
                System.out.println(program);
                System.out.println("Klasslistan för programmet: " + program);
                System.out.println(tabell.get(program));
            }

            //Skriver ut samtliga klasslistor sorterade efter program. Skriver ut TreeMap
            if (choice == 5) {
                System.out.println("Alternativ: Skriver ut samtliga klasslistor sorterade efter program");  
                Set<Entry<String, LinkedList<Student>>> setitr = tabell.entrySet(); 
                for ( Entry<String, LinkedList<Student>> elementk : setitr ) {
                    System.out.println(elementk.getKey() + " " + elementk.getValue());
                }
                System.out.println();     
            }

            //Skapar en statistisk sammanställning
            if (choice == 6) {
                System.out.println("Alternativ: Skapar en statistisk sammanst\u00E4llning");  
                Set<Entry<String, LinkedList<Student>>> setitr = tabell.entrySet(); 
                for(int i=0; i<55; i++) { System.out.print("=");}
                System.out.println();
                System.out.format("%10s\t%10s\t%10s\n","Program","Antal","Procent av totalen");
                for(int i=0; i<55; i++) { System.out.print("=");}
                System.out.println();
                int totalstud = studdatabas.laut22.size() + studdatabas.ljvg22.size() + 
                                studdatabas.lvvs22.size() + studdatabas.ljava22.size(); 
                for ( Entry<String, LinkedList<Student>> elementk : setitr ) {
                    Program flag = Program.valueOf(elementk.getKey());
                    switch(flag) {
                    case AUT22:
                        double procent = 100.0*studdatabas.laut22.size()/totalstud;
                        System.out.format("%10s\t%10d\t%10.1f\n",elementk.getKey(),studdatabas.laut22.size(),procent);
                        break;
                    case JVG22:
                        procent = 100.0*studdatabas.ljvg22.size()/totalstud;
                        System.out.format("%10s\t%10d\t%10.1f\n",elementk.getKey(),studdatabas.ljvg22.size(),procent);
                        break;            
                    case VVS22:
                        procent = 100.0*studdatabas.lvvs22.size()/totalstud;
                        System.out.format("%10s\t%10d\t%10.1f\n",elementk.getKey(),studdatabas.lvvs22.size(),procent);
                        break;
                    case JAVA22:
                        procent = 100.0*studdatabas.ljava22.size()/totalstud;
                        System.out.format("%10s\t%10d\t%10.1f\n",elementk.getKey(),studdatabas.ljava22.size(),procent);
                        break;
                    }
                }
                for(int i=0; i<55; i++) { System.out.print("=");}
                System.out.println();
            }

        } while(choice != 7 );
        scan.close();
    }
}
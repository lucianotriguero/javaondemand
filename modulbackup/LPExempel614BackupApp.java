package modulbackup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import javax.swing.JFileChooser;


public class LPExempel614BackupApp {

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

    public static Map<String,LinkedList<Student>> getTreeMap(String fil) throws IOException {

        Map<String,LinkedList<Student>> lstudents = new TreeMap<String,LinkedList<Student>>();
        enum Program { AUT22, JVG22, VVS22, JAVA22 };
        
        try (BufferedReader istream = new BufferedReader
                                 (new FileReader(fil))) {
            LinkedList<Student> laut22 = new LinkedList<Student>();
            LinkedList<Student> ljvg22 = new LinkedList<Student>();
            LinkedList<Student> lvvs22 = new LinkedList<Student>();
            LinkedList<Student> ljava22 = new LinkedList<Student>();                        
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
        lstudents.put("AUT22",laut22);
        lstudents.put("JVG22",ljvg22);
        lstudents.put("VVS22",lvvs22);
        lstudents.put("JAVA22",ljava22);    
        return lstudents;
        }  
    }

    public static void main(String[] args) throws IOException {

        String filnamn = readFile();
        Map<String,LinkedList<Student>> t = new TreeMap<String,LinkedList<Student>>();
        t = getTreeMap(filnamn);
        if (t.isEmpty()) {
           System.out.println("Fel med filläsningen. Programmet avslutar.");
           System.exit(0);
        } else {
           System.out.println("Databasen lagras i minnen. Välj från meny");
           System.out.println();
        }

        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Alternativ: ");
            System.out.println("1. Lägger in en ny student");
            System.out.println("2. Sök för en student");
            System.out.println("3. Skriver ut ett program");
            System.out.println("4. Skriver ut alla program");
            System.out.println("5. Avsluta");
            System.out.print("Choose one: ");
            choice = scan.nextInt();
            scan.nextLine();
            
            if (choice == 1) {
                System.out.print("Studentens namn: ");
                String studnamn = scan.nextLine();
                System.out.print("Studentens efternamn: ");
                String studefternamn = scan.nextLine();
                System.out.print("Studentens program: ");
                String program = scan.nextLine();
                String epost = studnamn+"."+studefternamn+"@stud.sti.se";
                LinkedList<Student> newstud = new LinkedList<Student>();
                newstud.add(new Student(studnamn,studefternamn,epost)); 
                //Working
                t.putIfAbsent(program,newstud);          
            }
            if (choice == 2) {
                System.out.println("Sök för en student");
                //System.out.print("Studentens namn: ");
                //String studnamn = scan.nextLine();
                System.out.print("Studentens program: ");
                String program = scan.nextLine();
                Student searchstud = new Student("CHRISTOPHER","null","null");
                Set<Entry<String, LinkedList<Student>>> setitr = t.entrySet(); 
                for ( Entry<String, LinkedList<Student>> elementf : setitr ) {
                    if ( elementf.getKey().equals(program) ) {
                        System.out.println(elementf.getValue() );
                        System.out.println(elementf.getValue().contains((Object) searchstud));
                        if ( elementf.getValue().contains((Student) searchstud) ) {
                             System.out.println("Studenten hittats");
                             System.out.println(elementf.getValue() );
                        }
                        else {
                            System.out.println("Studentens finns inte i databasen");
                        }
                    }
                }
            }
            if (choice == 3) {
                System.out.print("Vilket program: ");
                String program = scan.nextLine();
                System.out.println(program);
                System.out.println(t.get(program));
            }
            if (choice == 4) {
                //Skriver ut TreeMap
                System.out.println("Samtliga program");  
                Set<Entry<String, LinkedList<Student>>> setitr = t.entrySet(); 
                for ( Entry<String, LinkedList<Student>> elementk : setitr ) {
                    if ( elementk.getKey().equals("AUT22")) {
                        System.out.println(elementk.getKey());
                        for ( Entry<String, LinkedList<Student>> elementv : setitr ) { 
                            System.out.println(elementv.getValue());  
                        }            
                    } 
                    if ( elementk.getKey().equals("JVG22")) {
                        System.out.println(elementk.getKey());
                        for ( Entry<String, LinkedList<Student>> elementv : setitr ) { 
                            System.out.println(elementv.getValue());  
                        }            
                    } 
                }
                System.out.println();     
            }

        } while(choice != 5 );
        scan.close();

        /* String filnamn = readFile();
        TreeMap<String,LinkedList<Student>> t = new TreeMap<String,LinkedList<Student>>();
        t = getTreeMap(filnamn);
       
        //Skriver ut TreeMap
        Set<Entry<String, LinkedList<Student>>> setitr = t.entrySet(); 
        for ( Entry<String, LinkedList<Student>> elementf : setitr ) {
            System.out.println( elementf.getKey() + " " +elementf.getValue() );
        }
        System.out.println(); */

    }
}

 /* public static LinkedList<Student> getLista(String fil) throws IOException {
        LinkedList<Student> lstudents = new LinkedList<Student>();
        String[] s = new String[100];
        try (BufferedReader istream = new BufferedReader
                                 (new FileReader(fil))) {
            while ( true ) {
                String rad = istream.readLine();
                if (rad == null) //är filen slut?
                break;  
                s = rad.split("\\s");
                lstudents.add(new Student(s[0],s[1],s[2],s[3]));
            }
        return lstudents;
        }  
    } */
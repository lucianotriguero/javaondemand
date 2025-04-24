package modulnetworking;

//Demonstrate URLConections
import java.net.*;
import java.util.Date;

public class UCDemo {

    public static void main(String[] args) throws Exception {

        URL hp = URI.create("http://www.google.com").toURL();
        URLConnection hpCon = hp.openConnection();

        //get date
        long d = hpCon.getDate();
        if (d==0) 
            System.out.println("No date information");
        else
            System.out.println("Date: " + new Date(d));

        //get content type
        System.out.println("Cintent type: " + hpCon.getContentType());
        
        //get last-modified date
        d = hpCon.getLastModified();
        if (d==0) 
            System.out.println("No last-modified information");
        else
            System.out.println("Last modified: " + new Date(d));
        
    }
}

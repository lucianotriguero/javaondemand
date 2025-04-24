package modulthreads;

//Exempel: Controlling the main Thread
//Chapter 11 page 251
public class CurrentThreadDemon {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t);

        //Change the name of the Thread
        t.setName("My Thread");
        System.out.println("Afer the name change: " + t);

        try {
            for ( int n = 5; n> 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}

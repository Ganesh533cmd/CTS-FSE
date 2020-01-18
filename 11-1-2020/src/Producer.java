
public class Producer extends Thread {
    private Cubbyhole cubbyhole;
    private int number;

    public Producer(Cubbyhole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            cubbyhole.put(i);
            System.out.println("Producer #" + this.number
                               + " put: " + i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e){}
         
        }}
    
	
public static void main(String[] args) {
        
        Cubbyhole c = new Cubbyhole();
        
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);

        p1.start();
        c1.start();
    }
}
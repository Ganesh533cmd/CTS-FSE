
public class Consumer  extends Thread {
    private Cubbyhole cubbyhole;
    private int number;

    public Consumer(Cubbyhole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = Cubbyhole.get();
            System.out.println("Consumer #" + this.number
                               + " got: " + value);
        }
    }

	
}

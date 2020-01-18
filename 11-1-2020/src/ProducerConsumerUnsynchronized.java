
public class ProducerConsumerUnsynchronized {
	
public static void main(String[] args) {
        
        Cubbyhole c = new Cubbyhole();
        
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new onsumer(c, 1);

        p1.start();
        c1.start();
    }

}

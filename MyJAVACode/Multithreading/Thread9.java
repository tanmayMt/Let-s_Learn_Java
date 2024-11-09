import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int BUFFER_SIZE = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (buffer) {
                // Wait if the buffer is full
                while (buffer.size() == BUFFER_SIZE) {
                    buffer.wait();
                }
                System.out.println("Producer produced: " + value);
                buffer.add(value++);
                buffer.notify(); // Notify the consumer that an item is available
                Thread.sleep(1000); // Simulate production time
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (buffer) {
                // Wait if the buffer is empty
                while (buffer.isEmpty()) {
                    buffer.wait();
                }
                int value = buffer.poll();
                System.out.println("Consumer consumed: " + value);
                buffer.notify(); // Notify the producer that a slot is available
                Thread.sleep(10); // Simulate consumption time
            }
        }
    }
}

public class Thread9 {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

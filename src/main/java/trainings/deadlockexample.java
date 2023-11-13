package trainings;

public class deadlockexample {
    public static void main(String[] args) {
        // Two resources
        final Object resource1 = new Object();
        final Object resource2 = new Object();

        // Thread 1
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Acquired resource1 lock");

                // Intentional delay to create a deadlock
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: Waiting for resource2 lock");
                synchronized (resource2) {
                    System.out.println("Thread 1: Acquired resource2 lock");
                }
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Acquired resource2 lock");

                // Intentional delay to create a deadlock
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: Waiting for resource1 lock");
                synchronized (resource1) {
                    System.out.println("Thread 2: Acquired resource1 lock");
                }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

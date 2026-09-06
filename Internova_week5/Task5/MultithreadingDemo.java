class NumberThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1 - Number: " + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted.");
            }
        }
    }
}

class MessageThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 2 - Learning Java Multithreading");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted.");
            }
        }
    }
}

public class MultithreadingDemo {

    public static void main(String[] args) {

        // Create two thread objects
        NumberThread thread1 = new NumberThread();
        MessageThread thread2 = new MessageThread();

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
package MultiThreading;

class Odd implements Runnable {

    static int number = 1;
    static final Object lock = new Object();

    void printOdd(int n) {

        while (number < n) {

            synchronized (lock) {

                while (number % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (number < n) {
                    System.out.println("Odd: " + number);
                    number++;

                    lock.notify();
                }
            }
        }
    }

    @Override
    public void run() {
        printOdd(20);
    }
}


class Even extends Thread {

    void printEven(int n) {

        while (Odd.number < n) {

            synchronized (Odd.lock) {

                while (Odd.number % 2 != 0) {
                    try {
                        Odd.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (Odd.number < n) {
                    System.out.println("Even: " + Odd.number);
                    Odd.number++;

                    Odd.lock.notify();
                }
            }
        }
    }

    @Override
    public void run() {
        printEven(20);
    }
}


public class Assignment2 {

    public static void main(String[] args) {

        Odd obj1 = new Odd();
        Even obj2 = new Even();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
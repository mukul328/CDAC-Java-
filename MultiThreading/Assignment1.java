package MultiThreading;


class ThreadExample implements Runnable{
    public void run(){
         System.out.println("Thread is running...N");
    }
}


public class Assignment1 {
    public static void main(String[] args) {
        ThreadExample obj = new ThreadExample();
        // System.out.println("Befor running thread");
        // obj.run();
        // System.out.println("After thread is running");
        // No new thread is created Main thread is being executed; 

        

        Thread t = new Thread(obj);
    // thread .start() method will register the new thread on the OS with JVM 
        // t.start () creates a new thread and then invokes the run method on the new thread 


    System.out.println(t.getName());// gets you the name of the thread //o-p Thread-0

    t.setName("Mukul's new thread");
    System.out.println(t.getName());//Mukul's new thread

    System.out.println(t.getPriority());//5
    System.out.println(t.isAlive());//false
       t.setPriority(Thread.MAX_PRIORITY);

    System.out.println("Thread State: " + t.getState());
    System.out.println("Is Daemon Thread: " + t.isDaemon());



    t.start();
    }
    
}

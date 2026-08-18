package MultiThreading;
// 3. Create three classes message1 ,message2 and message3 and call their methods one after
// another and display message .

class message1 implements Runnable{
    void display1(){
        System.out.println("The first message is : hello !!!");
    }
    public void run(){
        display1();
        System.out.println("message 1 is running ");
    }
}
class message2 implements Runnable{

    void display2(){
        
        System.out.println("The second message is : My name is Mukul");
    }
     public void run(){
        display2();
        System.out.println("message 2 is running ");
    }
}

class message3 implements Runnable{
    void display3(){
        System.out.println("The third Message is  And This is My github");
    }
    public void run(){
        display3();
        System.out.println("message 3 is running ");
    }

}
class message4{

}


public class Assignment4 {
     public static void main(String [] args) throws InterruptedException{
        message1 m1 = new message1();
        message2 m2 = new message2();
        message3 m3 = new message3();


        Thread  t1 = new Thread(m1);
        Thread  t2 = new Thread(m2);
        Thread  t3 = new Thread(m3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

     }
    
}

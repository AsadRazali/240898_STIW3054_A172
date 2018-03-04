

public class MyTest extends MyThread {

    public static void main(String[] args) {
        MyTest t1= new MyTest();
        t1.start();
        MyThreadThread t2= new MyThreadThread();
        t2.start();
       
        //new Thread(new MyTest()).start();
    }


   
    

}

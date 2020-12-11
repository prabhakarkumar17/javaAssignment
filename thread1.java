
class demoThread extends Thread{
    //Thread t;
    String name;

    demoThread(String threadName){
        name = threadName;
    }

    public void run(){
        try {
            for(int i=0; i<10; i++){
                System.out.println(name +": "+i);
                Thread.sleep(500);
            }
            System.out.println(name+ " Exiting");
        } catch (InterruptedException e) {
            System.out.println("Exception Occured");
            //TODO: handle exception
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        try {
            demoThread d1 = new demoThread("Thread One");
            demoThread d2 = new demoThread("Thread Two");
            demoThread d3 = new demoThread("Thread Three");

            d1.start();
            d2.start();
            d3.start();
        } catch (Exception e) {
            System.out.println("Problem Occured");
            //TODO: handle exception
        }
    }
        
}




import java.util.concurrent.*;
import java.util.concurrent.ThreadFactory;

class SimpleThreadFactory {
    public static void main(String args[]) {
        
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        /* */
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool(threadFactory);
    
        
        for (int i = 0; i < 5; i++) {
            threadPoolExecutor. execute(new Runnabledemo(i));
        }
        threadPoolExecutor.shutdown();
    }
}

class Runnabledemo implements Runnable {

    private int count;
    public Runnabledemo(int count) {
        this.count=count;
    }

    public void run()
    {   /*for (int i = 0; i < 5; i++) {
        Thread.currentThread().setName(i);
    } */
      // String str= (String) Thread.currentThread();
      //  System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName()+ " : "+ count);
        try {
            Thread.sleep(10);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}









/*class SimpleThreadFactory implements ThreadFactory {

    public Thread newThread(Runnable) {
        return new Thread(r);
    }
}
Executors.defaultThreadFactory()
Thread.getName()*/
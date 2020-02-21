package SingleThreadExecution.extend;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
/**
 * 应用了计数信号量
 * */
public class Main {
    public static void main(String[] args) {
        BoundResource boundResource=new BoundResource(4);
        for (int i = 0; i <10 ; i++) {
            new UserThread(boundResource).start();
        }
    }

}
class Log{
    public static void println(String s){
        System.out.println(Thread.currentThread().getName()+": "+s);
    }
}
class BoundResource{
    private final Semaphore semaphore;
    private final int permits;
    private final static Random random=new Random(300000);

    public BoundResource( int permits) {
        this.semaphore = new Semaphore(permits);
        this.permits = permits;
    }
    public void  use() throws InterruptedException {
        semaphore.acquire();
        try {
            doUse();
        }finally {

        semaphore.release();
        }
    }
    protected void doUse() throws InterruptedException {
        /**
         * semaphore.availablePermits() 返回当前可用的许可数
         */
        Log.println("begin: USED=  "+(semaphore.availablePermits()));
        Thread.sleep(random.nextInt(500));
        Log.println("end: USED=  "+(semaphore.availablePermits()));
    }
}
class UserThread extends Thread{
    private final Random random=new Random(10000);
    private final BoundResource boundResource;

    public UserThread(BoundResource boundResource) {
        this.boundResource = boundResource;
    }
    @Override
    public void run(){
        try {
            while (true){
                boundResource.use();
                Thread.sleep(random.nextInt(3000));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
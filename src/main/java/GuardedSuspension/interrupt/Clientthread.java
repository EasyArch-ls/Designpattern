package GuardedSuspension.interrupt;

import GuardedSuspension.interrupt.Requst;
import GuardedSuspension.interrupt.RequstQueue;

import java.util.Random;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-21
 */
public class Clientthread extends Thread {
    private final Random random;
    private final RequstQueue requstQueue;

    public Clientthread(RequstQueue requstQueue, String name, long seed) {
        super(name);
        this.random = new Random(seed);
        this.requstQueue = requstQueue;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
            if (!Thread.currentThread().isInterrupted()) {
                Requst requst = new Requst("NO." + i + Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName() + "  requst  " + requst);
                requstQueue.putRequst(requst);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();

                }
            } else {
                System.out.println("退出");
                break;

            }


        }

    }

}

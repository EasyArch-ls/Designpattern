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
public class ServerThread extends Thread {
    private final Random random;
    private final RequstQueue queue;

    public ServerThread(RequstQueue queue, String name, Long seek) {
        super(name);
        this.random = new Random(seek);
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (!Thread.currentThread().isInterrupted()) {

                Requst requst = queue.getRequst();
                System.out.println(Thread.currentThread().getName() + "  handles  " + requst);
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


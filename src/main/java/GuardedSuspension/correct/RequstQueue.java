package GuardedSuspension.correct;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-21
 */
public class RequstQueue {
    private final Queue<Requst> queue = new LinkedList<Requst>();

    public Requst getRequst() {
        synchronized (this) {
            /**
             * while语句时守护条件
             * queue是被守护对象
             * wait() 会释放锁 开始运行时会再次检查守护条件
             * 如果while换成if 就会出现java.util.NoSuchElementException异常
             * 想用if可以将notifyAll换成notify（唤醒一个线程）但程序大的时候这样的复用性会很低
             * */
            while (queue.peek() == null) {
                try {
                    System.out.println(Thread.currentThread().getName()+": wait  begin");
                    wait();
                    System.out.println(Thread.currentThread().getName()+": wait  end");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return queue.remove();
        }
    }

    public synchronized void putRequst(Requst requst) {
        queue.add(requst);
        notifyAll();

    }

}


package GuardedSuspension.correct;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-21
 */
public class Main {
    public static void main(String[] args) {
        RequstQueue queue= new RequstQueue();
        new Clientthread(queue,"aaa",3141592L).start();
        new Clientthread(queue,"ccc",3141592L).start();
        new ServerThread(queue,"bbb",3141592L).start();
        new ServerThread(queue,"ddd",3141592L).start();
    }
}

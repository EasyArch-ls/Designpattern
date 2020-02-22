package GuardedSuspension.interrupt;


/**
 * Demo class
 *
 * @author ls
 * @date 20-2-22
 */
public class Main {
    public static void main(String[] args) {
        RequstQueue queue= new RequstQueue();
        Thread aaa=new Clientthread(queue,"aaa",3141592L);
        Thread bbb=new ServerThread(queue,"bbb",3141592L);
        aaa.start();
        bbb.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("*********  call interrupt  ********");
        aaa.interrupt();
        bbb.interrupt();
    }
}

package SingleThreadExecution.deadlock;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-21
 */
public class EaterThread extends Thread {
    private String name;
    private final Tool left;
    private final Tool right;


    public EaterThread(String name, Tool left, Tool right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        while (true) {
            eat();
        }
    }

    private void eat() {
        synchronized (left) {
            System.out.println(name + "  takes up " + left + " (left). ");
            synchronized (right) {
                System.out.println(name + "  takes up " + right + " (right). ");
                System.out.println(name + "  is eating now");
                System.out.println(name + "  puts down " + right + " (right). ");
            }
            System.out.println(name + "  puts down " + left + " (left). ");
        }
    }

}

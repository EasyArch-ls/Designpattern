package SingleThreadExecution.deadlock;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-21
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("begin");
        Tool spoon=new Tool("spoon");
        Tool fork=new Tool("fork");
        new EaterThread("aaa",spoon,fork).start();
        new EaterThread("bbb",fork,spoon).start();

        /*Pair pair=new Pair(spoon,fork);
        new EaterThread1("aaa",pair).start();
        new EaterThread1("bbb",pair).start();*/

    }
}

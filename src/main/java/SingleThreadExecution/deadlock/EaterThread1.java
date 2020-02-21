package SingleThreadExecution.deadlock;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-21
 */
public class EaterThread1 extends Thread {
    private String name;
    private final Pair pair;

    public EaterThread1(String name, Pair pair) {
        this.name = name;
        this.pair = pair;
    }

    @Override
    public void run(){
        while (true){
            eat();
        }
    }

    private void eat(){
        synchronized (pair){
            System.out.println(name+"  takes up "+pair+" . ");
            System.out.println(name+"  is eating now");
            System.out.println(name+"  puts down "+pair+" . ");
        }

    }
}

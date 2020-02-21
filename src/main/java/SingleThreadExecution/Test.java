package SingleThreadExecution;


import SingleThreadExecution.correct.Gate;
import SingleThreadExecution.correct.UserThread;


/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
/**
* 一次只能通过一个
 *
* */
public class Test {
    public static void main(String[] args) {
        System.out.println("Testing ");
        Gate gate=new Gate();
        new UserThread(gate,"aa","aa-").start();
        new UserThread(gate,"bb","bb-").start();
        new UserThread(gate,"cc","cc-").start();
    }
}

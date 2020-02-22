package GuardedSuspension.deadlock;

import GuardedSuspension.correct.Requst;
import GuardedSuspension.correct.RequstQueue;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-21
 */
public class TalkThread extends Thread {
    private final RequstQueue input;
    private final RequstQueue output;

    public TalkThread(RequstQueue input, RequstQueue output,String name) {
        super(name);
        this.input = input;
        this.output = output;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"  BEGIN:");
        for (int i = 0; i <20 ; i++) {
            Requst requst=input.getRequst();
            System.out.println(Thread.currentThread().getName()+" gets  "+requst);
            Requst requst1=new Requst(requst.getName()+"!");
            System.out.println(Thread.currentThread().getName()+" puts  "+requst1);
            output.putRequst(requst1);
        }
        System.out.println(Thread.currentThread().getName()+"  END");
    }

}

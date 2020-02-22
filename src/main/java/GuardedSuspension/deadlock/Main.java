package GuardedSuspension.deadlock;

import GuardedSuspension.correct.Requst;
import GuardedSuspension.correct.RequstQueue;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-21
 */
/**
 * input和output 都处于wait状态
 * */
public class Main {
    public static void main(String[] args) {
        RequstQueue input=new RequstQueue();
        RequstQueue output=new RequstQueue();
       // input.putRequst(new Requst("hello"));
        new TalkThread(input,output,"aaa").start();
        new TalkThread(output,input,"bbb").start();

    }
}

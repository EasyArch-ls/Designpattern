package Immutable.MyList.correct.Collection;

import java.util.List;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
public class WirteThread extends Thread{
    private final List<Integer> list;
    public WirteThread(List<Integer> list) {
       super("WirterThread");
       this.list=list;
    }
    @Override
    public void run(){
        for (int i = 0; i<100 ; i++) {
            System.out.println("+++++++++++++++++++++++++++++");
            list.add(i);
            //list.remove(0);
            System.out.println(list.remove(0)+"##############################");

        }
    }
}

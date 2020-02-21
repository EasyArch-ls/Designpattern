package Immutable.MyList.error;

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
        for (int i = 0; true ; i++) {
            list.add(i);
            //list.remove(0);

        }
    }
}

package Immutable.MyList.correct.MyCopyWirteArrayList;

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
            System.out.println("+++++++++++++++++++++++++++++");
            list.add(i);
            System.out.println(list.remove(0)+"##############################");

        }
    }
}

package Immutable.MyList.error;


import Immutable.MyList.error.ReadThread;
import Immutable.MyList.error.WirteThread;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        new WirteThread(list).start();
        new ReadThread(list).start();
    }
}

package Immutable.MyList.correct.Collection;


import Immutable.MyList.correct.Collection.ReadThread;
import Immutable.MyList.correct.Collection.WirteThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */

/**
 *  Collections.synchronizedList之后list ->   SynchronizedRandomAccessList 线程安全
 * 出现跳跃值是因为在读之前 写不断改写了值
* */
public class Main {
    public static void main(String[] args) {
        final List<Integer> list= Collections.synchronizedList(new ArrayList<Integer>());
        System.out.println(list.getClass());
       /* new WirteThread(list).start();
        new WirteThread(list).start();
        new ReadThread(list).start();*/
    }
}

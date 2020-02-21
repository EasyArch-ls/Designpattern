package Immutable.MyList.correct.MyCopyWirteArrayList;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
/**
 * 写时复制 当对集合进行写操作时，内部已确定安全的数组就会被整体复制
 * 出现跳跃值是因为在读之前 写不断改写了值
* */
public class Main {
    public static void main(String[] args) {
        final List<Integer> list=new CopyOnWriteArrayList<Integer>();
        new WirteThread(list).start();
        new ReadThread(list).start();
    }
}

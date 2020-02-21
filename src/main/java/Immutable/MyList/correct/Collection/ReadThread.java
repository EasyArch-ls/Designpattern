package Immutable.MyList.correct.Collection;

import java.util.List;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
public class ReadThread extends Thread{
    private final List<Integer> list;
    public ReadThread(List<Integer> list) {
        super("ReaderThread");
        this.list=list;
    }

    @Override
    public void run(){

            while (true){
                synchronized (list){
                for (int  i:list){
                    System.out.println("---------------------------------");
                    System.out.println(i);
                }
            }
        }


    }
}

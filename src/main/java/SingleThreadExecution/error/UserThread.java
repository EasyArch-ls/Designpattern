package SingleThreadExecution.error;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
public class UserThread extends Thread{
    private final Gate gate;
    private final String name;
    private final String adress;

    public UserThread(Gate gate,String name,String adress) {
        this.gate=gate;
        this.name=name;
        this.adress=adress;
    }


    @Override
    public void run() {
        System.out.println(name+"  begin ");
        while (true){
            gate.pass(name,adress);
        }

    }
}

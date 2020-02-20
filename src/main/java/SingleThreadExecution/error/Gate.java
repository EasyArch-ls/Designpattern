package SingleThreadExecution.error;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
public class Gate {
    private int counter=0;
    private String name="NoBody";
    private String adress="NoWhere";

    public void pass(String name, String adress) {
        this.counter++;
        this.name = name;
        this.adress = adress;
        check();
    }

    @Override
    public String toString() {
        return "Gate{" +
                "counter=" + counter +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    private void check() {
        if (name.charAt(0)!= adress.charAt(0)){
            System.out.println("****BROKEN**** "+toString());
        }
    }
}

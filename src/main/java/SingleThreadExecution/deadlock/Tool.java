package SingleThreadExecution.deadlock;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-21
 */
public class Tool {
    private final String name;

    public Tool(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "name='" + name + '\'' +
                '}';
    }
}

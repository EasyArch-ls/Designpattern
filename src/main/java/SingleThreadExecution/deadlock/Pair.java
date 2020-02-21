package SingleThreadExecution.deadlock;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-21
 */
public class Pair {
    private final Tool left;
    private final Tool right;

    public Pair(Tool left, Tool right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

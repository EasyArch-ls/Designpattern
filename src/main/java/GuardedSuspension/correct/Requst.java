package GuardedSuspension.correct;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-21
 */
public class Requst {

    private final String name;

    public String getName() {
        return name;
    }

    public Requst(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Requst{" +
                "name='" + name + '\'' +
                '}';
    }
}

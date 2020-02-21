package Immutable.Test.test2;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
/**
 *public ImmutablePerson(MutablePerson person) 中调用了MutablePerson的get方法
 * 这俩个调用必须放在临界区中 因为在调用getname之后 调用getaddress之前可能有线程调用
 * 正在调用setperson来修改addressd的值 所以要使用 synchronized (person){
 *
 *
 *             this.name=person.getName();
 *             this.address=person.getAddress();
 *          }
 *  来将MutablePerson的实例上锁
 *
* */
public final class ImmutablePerson {
    private final String name;
    private final String address;

    public ImmutablePerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ImmutablePerson(MutablePerson person){
        synchronized (person){


            this.name=person.getName();
            this.address=person.getAddress();
         }

    }

    public MutablePerson getMutablePerson(){
        return new MutablePerson(this);
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

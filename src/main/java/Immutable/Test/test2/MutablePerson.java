package Immutable.Test.test2;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
public final class MutablePerson {
    private String name;
    private String address;

    public MutablePerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public MutablePerson(ImmutablePerson immutablePerson) {
        this.address=immutablePerson.getAddress();
        this.name=immutablePerson.getName();
    }

    public synchronized void setPerson(String name,String addsress){
        this.name=name;
        this.address=addsress;

    }

    @Override
    public synchronized String toString() {
        return "MutablePerson{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public synchronized  ImmutablePerson getImmutablePerson(){
        return new ImmutablePerson(this);
    }

    public  String getName() {
        return name;
    }

    public  String getAddress() {
        return address;
    }
}

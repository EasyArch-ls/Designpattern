package Immutable.correct;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
/**
 * 成员变量的属性都是final的 且没有setter方法 (就是immutable（不可变的）) 所以不存在多个线程
 * 同时对实例操作会引起对实例的破坏 但不一定 比如将String 改为Stringbuff
 * 外部就可调用Strinbuff的replace来修改值
 * 只会是read-read模式
 *
 */
/**
 *Immutable：String，BigInteger,Pattern(表示正则表达式的模式)，
 *          boolean,byte,char,double(Jvm做了Immutable),float,int,long,short,void
 *          Color
 */
public final class Person {
    private  final String name;
    private final String address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';

    }
}

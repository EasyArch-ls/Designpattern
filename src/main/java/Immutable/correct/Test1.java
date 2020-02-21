package Immutable.correct;

import Immutable.correct.Person;
import Immutable.correct.PersonThread;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
public class Test1 {
    public static void main(String[] args) {
        Person person=new Person("aaa","bbb");
        new PersonThread(person).start();
        new PersonThread(person).start();
        new PersonThread(person).start();
    }
}

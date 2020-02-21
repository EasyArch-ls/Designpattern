package Immutable.correct;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
public class PersonThread extends Thread{
    private Person person;
    public PersonThread(Person person){
        this.person=person;
    }
    @Override
    public void run(){
        while (true){
            System.out.println(Thread.currentThread().getName()+" person: "+person);
        }

    }

}

package Immutable.Test.test2;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
public class Main {
    public static void main(String[] args) {
        MutablePerson mutablePerson=new MutablePerson("aaa","aaa");
        new CrackerThread(mutablePerson).start();
        new CrackerThread(mutablePerson).start();
        new CrackerThread(mutablePerson).start();
        for (int i = 0; true; i++) {
            mutablePerson.setPerson(""+i,""+i);
        }

    }
}
class CrackerThread extends Thread{
    private MutablePerson person;
    public CrackerThread(MutablePerson person){
        this.person=person;
    }

    @Override
    public void run(){
        while (true){
            ImmutablePerson immutablePerson=new ImmutablePerson(person);
            if(!immutablePerson.getName().equals(immutablePerson.getAddress())){
                System.out.println(currentThread().getName()+"***** Broken *****"+immutablePerson);
            }
        }

    }
}
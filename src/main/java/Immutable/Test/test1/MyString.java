package Immutable.Test.test1;

/**
 * Demo class
 *
 * @author ls
 * @date 20-2-20
 */
/**
 * 说明String 是Immutable
 * */
public class MyString {
    public static void main(String[] args) {
        String s="aacd";
        String t=s.replace("a","x");
        System.out.println(s);
        System.out.println(t);
        System.out.println(s.equals(t));
    }
}

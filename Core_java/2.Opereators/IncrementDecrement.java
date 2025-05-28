
public class IncrementDecrement {

    public void showOperators(int num) {

        System.out.println("Original value: " + num);
        //post increment
        System.out.println("post-Increment:" + (num++));
        System.out.println("After post-increment: " + num);
        // pre increment
        System.out.println("pre-Increment:" + (++num));
        System.out.println("After pre-increment: " + num);
        //post decrement
        System.out.println("post-Decrement:" + (num--));
        System.out.println("After post-decrement: " + num);
        //pre decrement
        System.out.println("pre-decrement:" + (--num));
        System.out.println("After post-decrement: " + num);
    }

    public static void main(String[] args) {
        IncrementDecrement obj = new IncrementDecrement();
        obj.showOperators(10);
    }
}

import java.util.*;

public class Fifo {
    public static void main(String[] args) {
        LinkedList<Integer> fifo = new LinkedList<Integer>();

        fifo.add(68);
        fifo.add(128);
        fifo.add(5);
        fifo.add(3);
        System.out.println(fifo);
        System.out.println(fifo.poll());
        System.out.println(fifo);
        System.out.println(fifo.poll());
        System.out.println(fifo);
    }
}

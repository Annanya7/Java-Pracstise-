import java.lang.*;
public class Q8_INFINITE {
    public static void main(String[] args) {
        int x = 1;
        // Since there is no stop condition ,its an infinite loop. It makes the user perplexed.Hence should be avoided
        for (; ; ) {
            System.out.println(x);
            x++;
        }
    }

}

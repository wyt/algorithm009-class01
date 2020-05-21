import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wangyongtao
 * @date 2020/5/21
 */
public class DequeTest {

  public static void main(String[] args) {

    Deque<String> deque = new LinkedList<>();

    deque.push("a");
    deque.push("b");
    deque.push("c");
    deque.push("d");
    System.out.println(deque);

    System.out.println(deque.pop());
    System.out.println(deque);

    System.out.println(deque.peek());
    System.out.println(deque);
  }
}

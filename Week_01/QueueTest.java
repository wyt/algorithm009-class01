import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wangyongtao
 * @date 2020/5/21
 */
public class QueueTest {

  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.offer("a");
    queue.offer("b");
    queue.offer("c");
    queue.offer("d");
    System.out.println(queue);

    System.out.println(queue.poll());
    System.out.println(queue);

    System.out.println(queue.peek());
    System.out.println(queue);
  }
}

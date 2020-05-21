import java.util.Stack;

/**
 * @author wangyongtao
 * @date 2020/5/21
 */
public class StackTest {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    stack.push("a"); // 4
    stack.push("b"); // 3
    stack.push("c"); // 2
    stack.push("d"); // 1

    System.out.println(stack);
    System.out.println(stack.search("a"));

    System.out.println(stack.pop()); // pop弹出栈顶元素,栈顶元素会被删除
    System.out.println(stack);

    System.out.println(stack.peek()); // 返回栈顶元素不删除
    System.out.println(stack);
  }
}

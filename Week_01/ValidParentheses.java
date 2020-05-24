import java.util.Stack;

/**
 * 有效括号 https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @author wangyongtao
 * @date 2020/5/24
 */
public class ValidParentheses {

    public boolean isValid(String s) {

        if (s.isEmpty())
            return true;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.empty() || c != stack.pop())
                return false;
        }

        if (stack.empty())
            return true;

        return false;
    }
}

// 0. 相反的字符入栈
// 1. pop后比较
// 2. 最后栈为空，全都匹配上
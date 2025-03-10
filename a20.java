import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class a20 {
    class Solution {
        public boolean isValid(String s) {

            char[] chars=s.toCharArray();

            Deque<Character> deque=new ArrayDeque<>();
            deque.push('s');
            if(chars.length%2==1)
            {
                return false;
            }
            for(char aa:chars)
            {
                //如果是左括号入栈
                if(aa =='{' || aa == '(' || aa == '[')
                {
                    deque.push(aa);
                }
                //如果是右括号而且栈顶是左括号则出栈
                if( aa =='}')
                {
                    if(deque.peek() == '{')
                    {
                        deque.pop();
                    }else{
                        return false;
                    }
                }

                if( aa ==')')
                {
                    if(deque.peek() == '(')
                    {
                        deque.pop();
                    }else{
                        return false;
                    }
                }

                if( aa ==']')
                {
                    if(deque.peek() == '[')
                    {
                        deque.pop();
                    }else{
                        return false;
                    }
                }
            }
            if(deque.peek()=='s')
            {
                return true;
            }
            return false;

        }
    }
}

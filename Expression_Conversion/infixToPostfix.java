package Expression_Conversion;

import java.util.Stack;

public class infixToPostfix {

    public static int prece(char op) {
        switch (op) {
            case '^':
                return 4;
            case '%':
            case '/':
            case '*':
                return 3;
            case '+':
            case '-':
                return 2;
            default:
                return 1;
        }
    }

    public static String infix2Postfix(String exp) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        for (int i = 0; i < exp.length(); i++) {
            char currentChar = exp.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                ans += currentChar + " ";
            } else if (currentChar == '(') {
                stack.push(currentChar);
            } else if (currentChar == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans += stack.pop();
                }
                stack.pop();

            } else {
                while (!stack.isEmpty() && prece(stack.peek()) >= prece(currentChar)) {
                    ans += stack.pop();
                }
                stack.push(currentChar);
            }
        }
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        String exp = "(((2+3))-(2*3))";
        System.out.println(infix2Postfix(exp));
    }
}

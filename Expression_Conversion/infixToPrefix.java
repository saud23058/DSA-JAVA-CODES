package Expression_Conversion;

import java.util.Stack;

public class infixToPrefix {
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

    public static String infix2Prefix(String exp){
        Stack<Character> stack = new Stack<>();
        String reverseString ="";
        String ans ="";
        for (int i = exp.length()-1; i >=0 ; i--) {
            reverseString+=exp.charAt(i);
        }
        for (int i = 0; i < reverseString.length(); i++) {
            char currentChar = reverseString.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                ans += currentChar + " ";
            } else if (currentChar == ')') {
                stack.push(currentChar);
            } else if (currentChar == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
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

        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        String newStr = "";
        for (int i = ans.length()-1; i >=0 ; i--) {
            newStr += ans.charAt(i);
        }
       return newStr;
    } 

    public static void main(String[] args) {
        String exp = "(((2+3))-(2*3))";
        System.out.println(infix2Prefix(exp));
    }
}

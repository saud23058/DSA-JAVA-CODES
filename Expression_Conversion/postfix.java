package Expression_Conversion;

import java.util.Stack;

public class postfix {
    public static double postEvl(String exp){
        Stack<Double> _postfix = new Stack<>();
        String ex[] = exp.split(" ");
        for (int i = 0; i < ex.length; i++) {
            if (Character.isDigit(ex[i].charAt(0))) {
                _postfix.push(Double.parseDouble(ex[i]));
            } else {
                switch (ex[i]) {
                    case "+":
                        double op1 = _postfix.pop();
                        double op2 = _postfix.pop();
                        _postfix.push(op1 + op2);
                        break;
                    case "-":
                        op1 = _postfix.pop();
                        op2 = _postfix.pop();
                        _postfix.push(op2 - op1);
                        break;
                    case "*":
                        op1 = _postfix.pop();
                        op2 = _postfix.pop();
                        _postfix.push(op1 * op2);
                        break;
                    default:
                        System.out.println("Invalid operator");
                        break;
                }
            }
        }

        return _postfix.pop();
    }
    public static void main(String[] args) {
   

        String exp = "2 13 + 4 *";
        System.out.println("Result :"+postEvl(exp));
        
    }

}

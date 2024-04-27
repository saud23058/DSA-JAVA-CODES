package Expression_Conversion;

import java.util.Stack;

public class prefix {
    public static Double preEvl(String exp) {
        Stack<Double> _prefix = new Stack<>();
        String str[] = exp.split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i].length() > 1 && Character.isDigit(str[i].charAt(1))) {

                _prefix.push(Double.parseDouble(str[i]));
            } else if (Character.isDigit(str[i].charAt(0))) {
                _prefix.push(Double.parseDouble(str[i]));
            } else {
                double op1;
                double op2;
                switch (str[i]) {
                    case "+":
                        op1 = _prefix.pop();
                        op2 = _prefix.pop();
                        _prefix.push(op1 + op2);
                        break;
                    case "-":
                        op1 = _prefix.pop();
                        op2 = _prefix.pop();
                        _prefix.push(op2 - op1);
                        break;
                    case "*":
                        op1 = _prefix.pop();
                        op2 = _prefix.pop();
                        _prefix.push(op1 * op2);
                        break;
                    default:
                        System.out.println("Invalid operator");
                        break;
                }
            }
        }

        return _prefix.pop();
    }

    public static void main(String[] args) {

        String exp = "+ 2 * 13 4";
        System.out.println("Result :" + preEvl(exp));

    }

}

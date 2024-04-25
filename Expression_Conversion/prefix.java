package Expression_Conversion;

public class prefix<T> {
    class Node {
        T data;
        Node next;

    }

    Node start = null;

    private boolean isEmpty() {
        return (start == null);
    }

    public void push(T value) {
        Node n = new Node();
        n.data = value;
        n.next = null;

        if (isEmpty()) {
            start = n;
        } else {
            n.next = start;
            start = n;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            T value = start.data;
          start = start.next;
          return value;
        }
    }


    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }else{
            Node t = start;
            while (t != null) {
                System.out.print(t.data + "  ");
                t=t.next;
            }
        }
    }

    public static void main(String[] args) {
        prefix<Double> _prefix = new prefix<>();
    
        String exp = "-+4*237";
    
        for (int i = exp.length() - 1; i >= 0; i--) {
            char currentChar = exp.charAt(i);
            if (Character.isDigit(currentChar)) {
                double num = Double.parseDouble("" + currentChar);
                _prefix.push(num);
            } else {
                switch (currentChar) {
                    case '+':
                        double op1 = _prefix.pop();
                        double op2 = _prefix.pop();
                        _prefix.push(op1 + op2);
                        break;
                    case '-':
                        op1 = _prefix.pop();
                        op2 = _prefix.pop();
                        _prefix.push(op1 - op2);
                        break;
                    case '*':
                        op1 = _prefix.pop();
                        op2 = _prefix.pop();
                        _prefix.push(op1 * op2);
                        break;
                    default:
                        System.out.println("Other signs");
                        break;
                }
            }
        }
        
    
        System.out.println("Result :" + _prefix.pop());
    }
    

}

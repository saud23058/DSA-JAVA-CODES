package Stacks;
class Stacks<T> {
    T[] array = (T[]) new Object[10];
    int top;

    private boolean isFull(){
        if(top>=array.length-1)
        return true;
        return false;
    }

    private boolean isEmpty(){
        if(top <=-1) 
        return true;
        return false;

    }

    public void push(T value){
        if(isFull())
        System.out.println("Stack overflow");
        else{
            top++;
            array[top]= value; 
        }
    }

    public T pop(){
        if(isEmpty()) {
            System.out.println("Stack underflow");
            return null; 
        }
     
            T value =array[top];
            top--;
         return value;
        
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return null; 
        }
        return array[top];
    }

    public int size(){
        return top+1;
    }

    public static void main(String[] args) {
        Stacks<Integer> stacks = new Stacks<Integer>();
        stacks.push(4);
        stacks.push(5);
        System.out.println(stacks.pop());
        System.out.println(stacks.peek());
    }
}
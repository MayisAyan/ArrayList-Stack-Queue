class Stack<T>{
    private Array<T> stack;
    private int topIndex = -1;
    public Stack(int size){
        stack = new Array(size);
    }

    public void push(T element){
        stack.add(element);
        ++topIndex;
    }
    public void pop(){
        stack.remove(topIndex--);
    }
    public T top(){
        return stack.get(topIndex);
    }

    public boolean isEmpty(){
        return topIndex < 0;
    }

    public int size(){
        return topIndex + 1;
    }

    public void print(){
        stack.print();
    }
}
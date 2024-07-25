public class Queue<T>{
    private Array<T> queue;
    private int topIndex = 0;
    private int lastIndex = -1;
    public Queue(int size){
        queue = new Array(size);
    }
    public void enqueue(T element){
        queue.add(element);
        ++lastIndex;
    }
    public void dequeue(){
        if(topIndex <= lastIndex) {
            queue.remove(topIndex);
            ++topIndex;
        }

    }
    public T peek(){
        return queue.get(topIndex);
    }
    public boolean isEmpty(){
        return lastIndex < 0;
    }
    public int size(){
        return queue.getSize();
    }

    public void print(){
        queue.print();
    }
}

class Array<T>{
    private T[] array;
    private int size = 0;

    public Array(int size){
        array = (T[]) new Object[size];
    }

    public void add(T element) {
        if(size == array.length){
            resize();
        }
        array[size++] = element;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insert(int index, T element) {
        if (size == array.length) {
            resize();
        }
        if(index <= array.length) {
            for (int i = size - 1; i >= index; --i) {
                array[i + 1] = array[i];
            }
            array[index] = element;
            ++size;
        }else{
            throw new ArrayIndexOutOfBoundsException ("There is no such an index");
        }
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such an index");
        }
        for (int i = index; i < size - 1; ++i) {
            array[i] = array[i + 1];
        }
        --size;
    }

    public T get(int index){
        if(index >= size || index < 0){
            throw new ArrayIndexOutOfBoundsException("There is no such an index");
        }
        return array[index];
    }

    public void clear(){
        for(int i = 0; i < array.length; ++i ){
            array[i] = null;
        }
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public void print(){
        for(int i = 0; i < size; ++i){
            System.out.print("[ " + array[i] + " ]");
        }
    }
    private void resize(){
        T[] newArr = (T[]) new Object[(int) (array.length * 1.5)];
        for (int i = 0; i < size; ++i){
            newArr[i] = array[i];
        }
        array = newArr;
    }

}
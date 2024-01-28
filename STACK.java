package PROLAB3_1;
public class STACK<T> {
    private final CiftLinkedList<T> stack;
    private int boyut;
    private static final int DEFAULT_CAPACITY = 10;
    public STACK() {
        this.stack=new CiftLinkedList<>();
        this.boyut = 0;
    }

    public void koy(T element) {
        stack.ekle(element);
        boyut++;

    }
    public T al() {
        if (boyut == 0) {
            return null;
        }
        T element = stack.get(boyut - 1);
        stack.get(boyut - 1);
        boyut--;
        return element;
    }
    public boolean bosmu() {
        return boyut == 0;
    }

}

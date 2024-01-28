package PROLAB3_1;


class Listt<T> {
    private CiftLinkedList<T> items;

    public Listt(){
        this.items= new CiftLinkedList<>();
    }

    public Listt(T[] args) {
        this.items = new CiftLinkedList<>();
        for (T arg : args) {
            items.ekle(arg);
        }
    }

    public void add(T item) {
        this.items.ekle(item);
    }

    public T get(int index) {
        return this.items.get(index);
    }

    public int boyut() {
        return this.items.boyut();
    }
    public boolean icerir(T item) {
        int boyut = this.items.boyut();
        for (int i = 0; i < boyut; i++) {
            if (item.equals(this.items.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.items.toString();
    }
}

import java.util.Iterator;
import java.util.List;

public class ToyIterator<T> implements Iterator<T> {

    private List<T> toys;
    private int index = 0;

    public ToyIterator(List<T> toys) {
        this.toys = toys;
    }

    @Override
    public boolean hasNext() {
        return index < toys.size();
    }

    @Override
    public T next() {
        return toys.get(index++);
    }
}
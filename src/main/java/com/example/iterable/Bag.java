package com.example.iterable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag <T> implements Container<T> {
    private List<T> items;

    public Bag() {
        this.items = new ArrayList<>();

    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(T item) {
         items.add(item);
    }

    // Extra Credit: Implement the forEach method from Iterable
    @Override
    public void forEach(Consumer<? super T> action) {
       items.forEach(action);
    }

    // Extra Credit: Implement the spliterator method from Iterable
    @Override
    public Spliterator<T> spliterator() {
        return items.spliterator();
    }

    @Override
    public Iterator<T> iterator() {
             return items.iterator();
    }
}
package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> extends ArrayList<E> {

    public void push(E e) {

        delegate.add(e);
    }
    private ArrayList<E> delegate;

    public MyStack(){
        this.delegate = new ArrayList<>();
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E e = delegate.get(delegate.size() - 1);
        delegate.remove(size() - 1);
        return e;
    }
    public int size() {
        return delegate.size();
    }

    public boolean isEmpty() {
        return delegate.isEmpty();
    }
}

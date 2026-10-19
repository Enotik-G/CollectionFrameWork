package org.example.collection;

public interface OhArrayList<T> {
    void add(T el);
    void add(T el, int index);
    T get(int index);
    void set(T ell, int index);
    T remove(int index);
    void clear();
    boolean isEmpty();
    boolean contains(Object o);
    Object[] grow();
}

package collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private List<E>[] buckets;
    private int size = 0;
    private int capacity;

    public MyHashSetV3() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[this.capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hashIndex(E value) {
        int hashCode = value.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    @Override
    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        List<E> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    @Override
    public boolean contains(E value) {
        int hashIndex = hashIndex(value);
        List<E> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }

    @Override
    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        List<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);
        if (result) {
            size--;
        }
        return result;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyHashSetV3<?> that = (MyHashSetV3<?>) object;
        return size == that.size && capacity == that.capacity && Objects.deepEquals(buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(buckets), size, capacity);
    }
}

package collection.set;

import java.util.*;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private List<Integer>[] buckets;
    private int size = 0;
    private int capacity;

    public MyHashSetV1() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[this.capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        List<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int value) {
        int hashIndex = hashIndex(value);
        List<Integer> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        List<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value));
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
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                '}';
    }
}

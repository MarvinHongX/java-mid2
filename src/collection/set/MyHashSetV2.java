package collection.set;

import java.util.*;

public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private List<Object>[] buckets;
    private int size = 0;
    private int capacity;

    public MyHashSetV2() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[this.capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hashIndex(Object value) {
        int hashCode = value.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        List<Object> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object value) {
        int hashIndex = hashIndex(value);
        List<Object> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        List<Object> bucket = buckets[hashIndex];
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
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyHashSetV2 that = (MyHashSetV2) object;
        return Objects.deepEquals(buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(buckets);
    }
}

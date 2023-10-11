package question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyHashMap<K, V> {
    private List[] buckets;
    private int capacity;
    private int size;

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new List[capacity];
        this.size = 0;
    }


    // to realize that the key is an index.
    // hashCode is used to make sure we always get a unique key.
    private int getIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % capacity;
    }


// adds a key_value to our hashmap
    public void put(K key, V value) {
        // finds out whether the key has been used yet
        int index = getIndex(key);
        // if the branch was empty, add a new list to it
        if (buckets[index] == null) {
            buckets[index] = new ArrayList<>();
        }
// saves the array in a list of key-value pairs
        List<Key_ValuePair<K, V>> bucket = buckets[index];
// for each pair if the key was used already, its value will be replaced by the new value automatically
        for (Key_ValuePair<K, V> pair : bucket) {
            if (pair.getKey().equals(key)) {
                pair = new Key_ValuePair<>(key, value);
                return;
            }
        }
        // the new key_value pair will be added to the Hashmap
        bucket.add(new Key_ValuePair<>(key, value));
        size++;

        }
//gets the key and returns the value
    public V get(K key) {
        int index = getIndex(key);
        if (buckets[index] != null) {
            // saves the array in a list of key-value pairs
            List<Key_ValuePair<K, V>> bucket = buckets[index];
            for (Key_ValuePair<K, V> pair : bucket) {
                if (pair.getKey().equals(key)) {
                    return pair.getValue();
                }
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "" + Arrays.toString(buckets) ;
    }

    public V replace(K key, V newValue) {
        int index = getIndex(key);

        if (buckets[index] != null) {
            List<Key_ValuePair<K, V>> bucket = buckets[index];

            for (int i = 0; i < bucket.size(); i++) {
                Key_ValuePair<K, V> pair = bucket.get(i);

                if (pair.getKey().equals(key)) {
                    V oldValue = pair.getValue();
                    pair.setValue(newValue);
                    return oldValue;
                }

            }

        }


        return null;
    }

    public V remove(K key) {

        int index = getIndex(key);


        if (buckets[index] != null) {

            List<Key_ValuePair<K, V>> bucket = buckets[index];

            for (int i = 0; i < bucket.size(); i++) {

                Key_ValuePair<K, V> pair = bucket.get(i);

                if (pair.getKey().equals(key)) {

                    V value = pair.getValue();

                    bucket.remove(i);

                    size--;

                    return value;
                }
            }
        }
        return null;
    }

    public int size() {
        return size;
    }


    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}



package Hash.HashMap;
import java.util.*;
import java.util.LinkedList;
import java.util.Objects;

public class Custom_HashMap_creation {

    // Custom HashMap Implementation - Understanding the internals
    public static void main(String[] args) {

        SimpleHashMap<String, Integer> map = new SimpleHashMap<>();
        SimpleHashMap<Integer, String> maps = new SimpleHashMap<>();

        // Adding some key-value pairs
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        map.put("grape", 4);
        map.put("kiwi", 5);

        maps.put(1,"orange");
        maps.put(2,"grape");
        maps.put(3,"kiwi");

        for (int i = 6; i <= 20; i++) {
            maps.put(i,"item" + i);
        }

        // Retrieving values
        System.out.println("Get apple: " + map.get("apple"));
        System.out.println("Get banana: " + map.get("banana"));
        System.out.println("Get mango (not present): " + map.get("mango"));
        System.out.println("Get 5 " + maps.get(5));
        System.out.println("Get 1 " + maps.get(1));
        System.out.println("Get 2 " + maps.get(2));

        // Checking if keys exist
        System.out.println("Contains key 'orange': " + map.containsKey("orange"));
        System.out.println("Contains key 'mango': " + map.containsKey("mango"));

        // Displaying internal structure
        map.displayStructure();

        // Adding more elements to trigger resize
        for (int i = 6; i <= 20; i++) {
            map.put("item" + i, i);
        }

        // Displaying structure after resizing
        map.displayStructure();
    }


    static class SimpleHashMap<K, V> {
        // THINKING: Need to define the underlying structure
        // - Array of buckets (LinkedLists to handle collisions)
        // - Load factor to decide when to resize
        // - Hash function to convert keys to indices

        private static final int DEFAULT_CAPACITY = 16;
        private static final double LOAD_FACTOR = 0.75;

        private LinkedList<Entry<K, V>>[] buckets;
        private int size;
        private int capacity;

        // Entry class to store key-value pairs
        static class Entry<K, V> {
            K key;
            V value;

            Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }

            @Override
            public String toString() {
                return key + "=" + value;
            }
        }

        @SuppressWarnings("unchecked")
        public SimpleHashMap() {
            this.capacity = DEFAULT_CAPACITY;
            this.size = 0;
            // THINKING: Create array of LinkedLists
            // Each bucket is a LinkedList to handle collisions
            this.buckets = new LinkedList[capacity];
            for (int i = 0; i < capacity; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hash(K key) {
            // THINKING: Hash function design
            // 1. Handle null keys (put them in bucket 0)
            // 2. Use Java's hashCode() but ensure positive value
            // 3. Use modulo to fit within array bounds
            if (key == null) return 0;

            int hashCode = key.hashCode();
            // Ensure positive value (handle Integer.MIN_VALUE edge case)
            hashCode = hashCode < 0 ? -hashCode : hashCode;
            return hashCode % capacity;
        }

        public void put(K key, V value) {
            // THINKING: Insertion process
            // 1. Calculate bucket index using hash function
            // 2. Check if key already exists in that bucket
            // 3. If exists, update value; if not, add new entry
            // 4. Check if resize is needed

            int index = hash(key);
            LinkedList<Entry<K, V>> bucket = buckets[index];

            // Check if key already exists
            for (Entry<K, V> entry : bucket) {
                if (Objects.equals(entry.key, key)) {
                    entry.value = value; // Update existing
                    return;
                }
            }

            // Add new entry
            bucket.add(new Entry<>(key, value));
            size++;

            System.out.println("PUT: " + key + " -> " + value + " (bucket " + index + ")");

            // Check if resize needed
            if (size > capacity * LOAD_FACTOR) {
                resize();
            }
        }

        public V get(K key) {
            // THINKING: Retrieval process
            // 1. Calculate bucket index
            // 2. Search through the bucket's LinkedList
            // 3. Return value if found, null if not found

            int index = hash(key);
            LinkedList<Entry<K, V>> bucket = buckets[index];

            for (Entry<K, V> entry : bucket) {
                if (Objects.equals(entry.key, key)) {
                    return entry.value;
                }
            }
            return null; // Not found
        }

        public boolean containsKey(K key) {
            return get(key) != null;
        }

        @SuppressWarnings("unchecked")
        private void resize() {
            // THINKING: When load factor exceeded, double the capacity
            // 1. Save old buckets
            // 2. Create new larger array
            // 3. Rehash all existing entries into new buckets

            System.out.println("RESIZING: " + capacity + " -> " + (capacity * 2));

            LinkedList<Entry<K, V>>[] oldBuckets = buckets;
            capacity *= 2;
            buckets = new LinkedList[capacity];
            size = 0;

            // Initialize new buckets
            for (int i = 0; i < capacity; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Rehash all entries
            for (LinkedList<Entry<K, V>> bucket : oldBuckets) {
                for (Entry<K, V> entry : bucket) {
                    put(entry.key, entry.value);
                }
            }
        }

        public void displayStructure() {
            System.out.println("\nHashMap Internal Structure:");
            for (int i = 0; i < capacity; i++) {
                if (!buckets[i].isEmpty()) {
                    System.out.println("Bucket " + i + ": " + buckets[i]);
                }
            }
            System.out.println("Size: " + size + ", Capacity: " + capacity);
        }
    }
}

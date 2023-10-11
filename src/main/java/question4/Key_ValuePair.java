package question4;

public class Key_ValuePair <K,V> {
        private final K key;
        private V value;

        public Key_ValuePair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "" +key +
                    ", " + value ;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }


import java.util.HashMap;
import java.util.Map;

public class KeyValueStore {

/*
 asked by Google.

Implement a key value store, where keys and values are integers, with the following methods:

update(key, vl): updates the value at key to val, or sets it if doesn't exist
get(key): returns the value with key, or None if no such value exists
max_key(val): returns the largest key with value val, or None if no key with that value exists
For example, if we ran the following calls:

kv.update(1, 1)
kv.update(2, 1)
And then called kv.max_key(1), it should return 2, since it's the largest key with value 1.
*/

    private Map<Integer, Integer> store;

    public KeyValueStore() {
        this.store = new HashMap<>();
    }

    public void update(int key, int val) {
        store.put(key, val);
    }

    public Integer get(int key) {
        return store.getOrDefault(key, null);
    }

    public Integer max_key(int val) {
        Integer maxKey = null;
        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            if (entry.getValue().equals(val)) {
                if (maxKey == null || entry.getKey() > maxKey) {
                    maxKey = entry.getKey();
                }
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        KeyValueStore kv = new KeyValueStore();

        kv.update(1, 1);
        kv.update(2, 1);

        System.out.println(kv.get(1)); // 1 değerini döndürmelidir
        System.out.println(kv.get(3)); // null döndürmelidir çünkü 3 anahtarı depoda yok
        System.out.println(kv.max_key(1)); // 2 döndürmelidir çünkü 1 değerine sahip en büyük anahtar 2
    }
}

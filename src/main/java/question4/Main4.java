package question4;

public class Main4 {
    public static void main(String[] args) {
        MyHashMap<Integer,Integer> hashMap = new MyHashMap<>(10);
        hashMap.put(1,2);
        hashMap.put(0,10);
        System.out.println(hashMap.get(1));
        hashMap.replace(1,4);
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.isEmpty());

    }
}

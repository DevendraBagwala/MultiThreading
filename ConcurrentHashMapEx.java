package MultiThreading;
import java.util.concurrent.ConcurrentHashMap;
/* 
 * This class has a method concurrenthashMap for efficient map
 */
public class ConcurrentHashMapEx {

	public static void main(String[] args) {

        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();

        map.put(1, 1000);
        map.put(2, 1000);
        map.put(3, 1000);

        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}

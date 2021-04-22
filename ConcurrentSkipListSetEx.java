package MultiThreading;

import java.util.concurrent.ConcurrentSkipListSet;
/*  
 * This class has a method concurrentskipListset for efficient set
 */
public class ConcurrentSkipListSetEx {
    public static void main(String[] args) {

        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

        System.out.println(set.add("indore"));
        System.out.println(set.add("bhopal"));
        System.out.println(set.add("dewas"));
        System.out.println(set);
        System.out.println(set.add("pune"));
        System.out.println(set.add("indore"));
        System.out.println(set);

    }
}
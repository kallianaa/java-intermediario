

package curso.java;

import curso.java.carro.Carro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        List<String> list = new ArrayList<>();
        list.add("Nala");
        list.add("Nala");
        list.add("Kalli");
        list.add("Kalli");
        list.add("Thainá");
        list.add("Katy");
        list.add("Pablo");

        System.out.println("Lista: " + list);

        Set<String> setStrings = new HashSet<>();
        setStrings.add("Nala");
        setStrings.add("Kalli");
        setStrings.add("Nala");
        setStrings.add("Kalli");
        setStrings.add("Thainá");
        setStrings.add("Katy");
        setStrings.add("Pablo");

        System.out.println("setStrings: " + setStrings);
        System.out.println("setStrings: " + setStrings.contains("Nala"));

        Map<String, String> map = new HashMap<>();
        map.put("Nala", "Cachorro");
        map.put("Kalli", "Cachorro");
        map.put("Thainá", "Gato");
        map.put("Katy", "Gato");
        map.put("Pablo", "Cachorro");

        System.out.println(map.get("Nala"));

        Queue<String> queue = new LinkedList<>();
        queue.add("Nala");
        queue.add("Kalli");
        queue.add("Thainá");

        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue.peek());
        System.out.println("Queue: " + queue.remove());
        System.out.println("Queue: " + queue);

    }
}

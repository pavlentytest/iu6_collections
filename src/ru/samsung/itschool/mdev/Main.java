package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        Лаб. раб. 6
       Collection (Коллекции)

       Списки (интерфейс List)
       Реализации:
       ArrayList, LinkedList, Stack
       (упорядоченно, у каждого элемента есть свой номер)

       Множества (интерфейс Set)
       Реализации:
       TreeSet, HashSet
       (неупорядочены, уникальные)


       Словари (интерфейс Map)
        Реализации:
        TreeMap, HashMap, ?Hashtable?
        (пары: ключ - значение)

        По сложности:
        https://habr.com/ru/post/188010/

         */

        //List<String> list = new List<String>();

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("Olga");
        names.add("Maria");
        names.add("Alex");
        names.add("Alex");
        // перебор циклом for

        Collections.sort(names);

        class Car implements Comparable<Car> {
            public String name;
            public int power;

            public Car(String name, int power) {
                this.name = name;
                this.power = power;
            }

            @Override
            public int compareTo(Car o) {
                return 0;
            }
        }

        ArrayList<Car> car = new ArrayList<>();
        car.add(new Car("dfgdf",56));
        car.add(new Car("ttgdf",11));
        car.add(new Car("wwf",6));
        car.add(new Car("sdfg",64));
        car.add(new Car("34534",122));

        //получение по index: car.get(0);

        Comparator<Car> rule = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                // <0 >0 ==0
                return o1.name.compareTo(o2.name);
                        //o1.power-o2.power;
            }
        };

        Collections.sort(car,rule);
        for(Car c: car) System.out.println("name:"+c.name+"; power:"+c.power);


        // LinkedList - двухсвязный список

        int x[] = {3456,45,5,545,666};
        ArrayList<Integer> c = new ArrayList<>();
        for(int i=0;i<x.length;i++) c.add(x[i]);

        List<Integer> d = new ArrayList<>();
        Collections.addAll(d,456,45,6456,456,56756,5678);

        /*
        ArrayList<Integer> pp = new ArrayList<Integer>() {{
            add(1);
            add(2);
        }};
         */

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Moscow");
        treeSet.add("Berlin");
        treeSet.add("Paris");
        treeSet.add("Moscow");


        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<String>  names_tree= new TreeSet<>(names);


        // Hashtable - хэш-таблица
        // null  нельзя
        // все методы synchronized


        // HashMap
        // null можно
        // потоконебезопасный (методы не synchronized)


        Hashtable phonebook = new Hashtable();
        phonebook.put("Ivan","345345");
        phonebook.put("Petr","245345");
        phonebook.put("Oleg","456456");

        Enumeration keys = phonebook.keys();
        while(keys.hasMoreElements()) {
            String key = (String)keys.nextElement();
            System.out.println(phonebook.get(key));
        }

        HashMap<String,String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");

        HashMap<String,String> map2 = new HashMap<>();
        map2.put("key4","value4");
        map2.put("key5","value5");
        map2.put("key6","value6");

        map.putAll(map2);

        String exists = map.containsKey("key2") ? "found" : "not found";

        // перебор
        Set<Map.Entry<String,String>> set = map.entrySet();
        for(Map.Entry<String,String> s: set) {
            System.out.println("key: "+s.getKey() +"; value: "+s.getValue());
        }

        // LinkedHashMap - упорядоченная реализация Hashmap
        // в которой есть связи

        // TreeMap - сортируется по ключам - Natural Ordering
        // Comparator
        



    }
}

package Collection;

import java.util.LinkedList;

//public class LinkedlistDemo {
//    public static void main(String[] args) {
//        LinkedList l1=new LinkedList();
//        l1.add(10);
//        l1.add('A');
//        l1.add("hello");
//        l1.add(20.56);
//        l1.add(10);
//        System.out.println(l1);
//        System.out.println(l1.get(1));
//        System.out.println(l1);
//        System.out.println(l1.poll());
//        System.out.println(l1);
//        System.out.println(l1.peek());
//        System.out.println(l1);
//
//    }
//}

public class LinkedlistDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(Integer.valueOf(3));
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}

package Collection;

import java.util.ArrayList;

//public class ArrayListDemo {
//    public static void main(String[] args) {
//        ArrayList<String> people=new ArrayList<>();
//        people.add("raksha");
//        people.add("abc");
//        people.add("rakshitha");
//        people.add("SharuRakshu");
//        System.out.println(people);
//
//        ArrayList<Integer> num=new ArrayList<>();
//        num.add(10);
//        num.add(20);
//        num.add(30);
//        num.add(40);
//        num.add(50);
//        System.out.println(num);
//
//        people.remove("abc");
//        people.remove(2);
//        System.out.println(people);
//    }
//}

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
        ArrayList l2=new ArrayList();
        l2.add("A");
        l2.add("B");
        l2.add("C");
        l2.add("D");
        l2.add("E");
        System.out.println(l2);
        l1.addAll(l2);
        System.out.println(l1);
    }
}
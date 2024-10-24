package LeetCode;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joinnames= new StringJoiner(",");
        joinnames.add("Raksha");
        joinnames.add("Sharu");
        joinnames.add("sharurakshu");
        joinnames.add("SR");
        System.out.println(joinnames);
    }
}
package tests;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tamara
 */


//Different realization of String reverse
public class ReverseString {

    public static void main(String[] args) {

        System.out.println("My string is:  i love programing in java ");
        System.out.println("\n\n");

        //First method
        System.out.println("------------First method---------------");
        stringReverse(" i love programing in java ");
        System.out.println("\n\n");

        //Second method
        System.out.println("------------Second method---------------");
        stringReverse2("i love programing in java");
        System.out.println("\n\n");

        //Third method
        System.out.println("------------Third method---------------");
        stringReverse3("i love programing in java");
        System.out.println("\n\n");

        //Forth method
        System.out.println("------------Forth method---------------");
        stringReverse4("i love programing in java");
        System.out.println("\n\n");
        
         //Fifth method
        System.out.println("------------Fifth method---------------");
        stringReverse5("i love programing in java");
        System.out.println("\n\n");
    }

    static void stringReverse(String s) {
        char ch[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

    static void stringReverse2(String s) {

        char[] array = s.toCharArray();
        for (int j = 0, k = array.length - 1; j <= array.length / 2 && k >= array.length / 2; j++, k--) {
            char tmp = s.charAt(j);
            array[j] = array[k];
            array[k] = tmp;
        }
        String news = "";
        for (int j = 0; j < array.length; j++) {
            news += array[j];
        }

        System.out.println(news);
    }

    static void stringReverse3(String s) {

        char[] array = s.toCharArray();
        int k = array.length - 1;
        for (int j = 0; j < array.length / 2; j++) {
            char tmp = s.charAt(j);
            array[j] = array[k];
            array[k] = tmp;
            k--;
        }
        String news = "";
        for (int j = 0; j < array.length; j++) {
            news += array[j];
        }
        System.out.println(news);
    }

    static void stringReverse4(String s) {

        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        System.out.println(s);
    }

    //hardcore with collections
    static void stringReverse5(String s) {

        List<Character> list = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            list.add(ch);
        }

        Collections.reverse(list);
        Iterator iter = list.iterator();

        StringBuilder sb = new StringBuilder();

        while (iter.hasNext()) {
            sb.append(iter.next());
        }
        System.out.println(sb.toString());
    }

}

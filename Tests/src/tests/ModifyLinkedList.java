/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Tamara
 */

/*
 Given a Linked List of integers, write a function to modify the linked list 
 in-place such that all odd numbers appear before all the even numbers in the 
 modified linked list. The relative order of even and odd numbers 
 should remain the same. 
 – http://www.geeksforgeeks.org/segregate-even-and-odd-elements-in-a-linked-list/*/


public class ModifyLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList();
        l.add(4);
        l.add(8);
        l.add(9);
        l.add(1);
        l.add(2);
        l.add(10);
        l.add(7);
        l.add(19);
        l.add(22);
        l.add(43);
        l.add(47);

        Iterator iter = l.iterator();

        System.out.println("FIRST EXAMPLE\n");
        
        System.out.print("Input: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + "->");
        }

        System.out.println("");
        System.out.print("Output: ");
        LinkedList<Integer> ln = modifyList(l);
        iter = ln.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + "->");
        }
        System.out.println("");
        System.out.println("\n SECOND EXAMPLE \n");
        l.clear();
        l.add(17);
        l.add(15);
        l.add(8);
        l.add(12);
        l.add(10);
        l.add(5);
        l.add(4);
        l.add(1);
        l.add(7);
        l.add(6);
       
        
        iter = l.iterator();
        
           System.out.print("Input: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + "->");
        }

        System.out.println("");
        System.out.print("Output: ");
        ln = modifyList(l);
        iter = ln.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + "->");
        }

        System.out.println("");
        System.out.println("\n THIRD EXAMPLE \n");
        
    }

    public static LinkedList<Integer> modifyList(LinkedList<Integer> list) {

        int odd = 0;
        int even = 0;
        Integer[] array = new Integer[list.size()];
        Integer[] arrayEven = new Integer[list.size()];
        for (Integer i : list) {
           
            if (i % 2 == 0) {
                array[odd] = i;
                odd++;
            }
            if (i % 2 == 1) {
                arrayEven[even] = i;
                even++;
            }
            
        }
        int k = 0;
        for (int i = odd; i < array.length; i++) {
            array[i] = arrayEven[k];
            k++;

        }

        LinkedList<Integer> l = new LinkedList<>(Arrays.asList(array));
        return l;

    }
}

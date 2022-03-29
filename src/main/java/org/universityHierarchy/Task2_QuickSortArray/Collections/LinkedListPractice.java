package org.universityHierarchy.Task2_QuickSortArray.Collections;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        // Create a linked list.
        LinkedList<String> myLinkedList = new LinkedList<String>();
// Add elements to the linked list.
        myLinkedList.add("cucaracha");
        myLinkedList.add("mosquito");
        myLinkedList.add("grillo");
        myLinkedList.add("saltamontes");
        myLinkedList.add("mariposa");
        myLinkedList.addLast("zancudo");
        myLinkedList.addFirst("mosca");
        myLinkedList.add(1, "alacran");
        System.out.println("Original contents of myLinkedList: " + myLinkedList);
// Remove elements from the linked list.
        myLinkedList.remove("grillo");
        myLinkedList.remove(2);
        System.out.println("Contents of myLinkedList after deletion: "
                + myLinkedList);
// Remove first and last elements.
        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        System.out.println("myLinkedList after deleting first and last: "
                + myLinkedList);
// Get and set a value.
        String val = myLinkedList.get(2);
        myLinkedList.set(2, val + " Changed");
        System.out.println("myLinkedList after change: " + myLinkedList + "\n");

        String ger = myLinkedList.get(3);
        myLinkedList.set(1, ger + " Este es mi nuevo valor! ja");
        System.out.println(myLinkedList);
    }
}

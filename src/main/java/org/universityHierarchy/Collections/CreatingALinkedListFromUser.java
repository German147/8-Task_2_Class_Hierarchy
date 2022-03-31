package org.universityHierarchy.Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class CreatingALinkedListFromUser {
    public static void main(String[] args) {

        ListyMy listyMy = new ListyMy();
        listyMy.crateLinkedList();

    }

   public static class ListyMy{
      public LinkedList<String> crateLinkedList(){
            LinkedList<String> list = new LinkedList<>();//declare your list
            Scanner scan = new Scanner(System.in);//create a scanner

            System.out.print("Enter the Nbr of element : ");
            int nbr = scan.nextInt();//read the number of element
            scan.nextLine();
            do {
                list.add(scan.nextLine());//read and insert into your list in one shot
                nbr--;//decrement the index
            } while (nbr > 0);//repeat until the index will be 0

            scan.close();//close your scanner
            System.out.println(list);//print your list
            return list;
        }
    }
}

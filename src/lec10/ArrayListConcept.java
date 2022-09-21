/*
    ArrayList is an Inbuilt class in Java created to be used in place of Vector for Dynamic sized arrays in Java.
    ArrayList is a generic class, it only works with Objects.

    ArrayList<Integer> list = new ArrayList<>();

    Internally when we create an object of arrayList in Java, an array of capacity 10 is created, we can change this
    initial value by passing the initial capacity in the constructor.

    Ex: ArrayList<Integer> list = new ArrayList<>(20);

    Very important point is that in an ArrayList we always have to insert data sequentially.

    If we created a list of 4 size
        then we can enter the data from 0 - 3rd index without issue, but we can not enter the data at 4th index without
        having the data at 3rd index. This is the required thing in ArrayList.

    Even if the initial size of ArrayList is 10, you can not insert data at 5th index without inserting data at previous
     index.

    NOW
        If we add an element after the array has reached its final index (size = capacity) then the new array size comes
         to be, newSize = oldSize + oldSize/2 + 1

        All the elements in the previous array are shifted to new array and then the new element is added.

        ADD-ELEMENT     SIZE     NO-OF-OPERATION
           ADD 1         1          1
           ADD 2         2          1 + 1
           ADD 3         4          2 + 1
           ADD 4         4          1
           ADD 5         7          4 + 1
           ------------------------------
        TOTAL ITEMS : 5
        TOTAL OPERATIONS : 12

        OPERATION PER ELEMENT is 12 / 5 -> 2
        THUS IT TAKES CONSTANT TIME TO ADD AN ELEMENT DESPITE THE GROWING SIZE.

 */
package lec10;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {
  public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();

      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      // adding element at backside of the array.

      list.add(0, 50);
      // adding element at a given index in the array.

      System.out.println(list.get(0));
      // to get the data at the first index.

      list.remove(0);
      // removes the data at the first index.

      list.set(1, -9);
      // updates the data at the second index by -9.
      // returns the data present previously at that index.

      Collections.sort(list);
      // Sorts the list.

      // using for each loop also called enhanced for loop reads content, internally it maintains an index,
      // but it reads and sends the content only.
      for (int val : list) System.out.println(val + " ");

      /*
        size and capacity :
            Capacity : Total amount of data that can be stored inside the Container.
            Size : The current holding of data that is present inside the Container.

            int the list.add() method, the range of index will be 0 to size.

       */


  }
}

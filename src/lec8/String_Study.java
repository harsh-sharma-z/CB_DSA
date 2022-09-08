/*
    A class in Java, and is stored in Data Structures.
    String : A non-primitive type of data.

    String s = "Hello";
    Making a string using literals, this string will be formed inside the string pool, without using new keyword.

    String s1 = new String("Hello");
    Making a string using the new keyword will make the string in the heap area.

    In the String pool, we can not have duplicate values but in the heap area we can have duplicate values.

    hashCode is not address. [ keep this in mind ].

    While having
        * user input
        * using '+' operator
        * using concat function
        * using new keyword
        -> the string will always be formed in the heap area.

    String s1 = "Hello";
    String s2 = new String("Hello");
    String s3 = "Hello";

    s1 == s2 : will return false as both of them have different address.
    s1 == s3 : will return true as both of them have the same address as both of them in are in the String pool.


    String q = "Hello" + "bye";
    String r = "Hello" + "bye";

    s1 = s1 + "bye";

    q == r : is true because even while using operator they both are hardcoded values, thus it will be stored in pool.
    s1 == q : is false because s1 because now when we used s1 with '+' operator, it will operate on new string in the
        heap and thus, they are un-equal.

    The Concept of "IMMUTABILITY".
        String will be changed, but content at same location will never be changed.

    Reading a String
        * sc.next() : reads the contiguous stream of characters until the first whitespace character.
        * sc.nextLine() : reads the complete stream of character until a new line.

    * String is internally stored as byte[] due to faster operations.
    * Here the str.length() is a method.

 */

package lec8;

public class String_Study {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.hashCode() + " " + s3.hashCode());

        String q = "Hello" + "bye";
        String r = "Hello" + "bye";

        s1 = s1 + "bye";

        System.out.println(q == r);
        System.out.println(s1 == q);
    }
}

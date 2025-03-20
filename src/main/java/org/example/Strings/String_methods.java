package org.example.Strings;

import java.util.Arrays;

//String Literal ("Hello")	---String Constant Pool (SCP)	--- 	String s1 = "Hello";
//Using new Keyword	--Heap Memory ---	String s1 = new String("Hello");

public class String_methods {

    // The String class in Java is an immutable sequence of characters stored in a char array internally.
    public static void main(String[] args) {


        String str = "DsaUsingJava";


        //length()	Returns the number of characters in the string.
        System.out.println(str.length());

        //charAt(index)	Returns the character at the specified index.
        System.out.println(str.charAt(1));
        // Output: 'e'
        //isEmpty()	Returns true if the string is empty (""), otherwise false.

        System.out.println(str.isEmpty());
         // Output: false
        //toCharArray()	Converts the string into a character array. Useful for sorting and frequency counting.
        System.out.println(Arrays.toString(str.toCharArray()));

        // Output: [h, e, l, l, o]


        // string comparison methods


        String s1 = "hello";
        String s2 = "Hello";

        //equals(str2)	Compares two strings (case-sensitive).
        System.out.println(s1.equals(s2));

        //equalsIgnoreCase(str2)	Compares two strings (case-insensitive).
        System.out.println(s1.equalsIgnoreCase(s2)); // Output: true

        //compareTo(str2)	Lexicographically compares two strings. Returns negative if first is smaller, positive if greater, and 0 if equal.
        System.out.println(s1.compareTo("world"));   // Output: Negative value (because "h" < "w")

        //compareToIgnoreCase(str2)	Same as compareTo() but ignores case.





        String s = "algorithm";

        //contains(str)	Checks if the string contains the given substring.
        System.out.println(s.contains("go"));

        //indexOf(ch/str)	Returns the first index of the character or substring// Output: true
        System.out.println(s.indexOf('o'));

        //lastIndexOf(ch/str)	Returns the last index of the character or substring.// Output: 1
        System.out.println(s.lastIndexOf('o'));

        //startsWith(prefix)	Checks if the string starts with the given prefix.// Output: 6
        System.out.println(s.startsWith("algo"));

        //endsWith(suffix)	Checks if the string ends with the given suffix.// Output: true
        System.out.println(s.endsWith("ithm"));

        //substring(start, end)	Extracts a substring from start to end-1. // Output: true
        System.out.println(s.substring(2, 6));








        // toUpperCase()	Converts all characters to uppercase.
        System.out.println(s.toUpperCase());  // Output: "JAVA"

        //  toLowerCase()	Converts all characters to lowercase.
        System.out.println(s.toLowerCase());  // Output: "java"


        //stringbuilder

        StringBuilder sb = new StringBuilder("data");

        sb.append("structure");

        System.out.println(sb);  // Output: "datastructures"

        sb.insert(4, "-");
        System.out.println(sb);  // Output: "data-structure"

        sb.delete(4, 5);
        System.out.println(sb);  // Output: "datastructures"

        sb.reverse();
        System.out.println(sb);  // Output: "erutcurtsatad"

























    }





}

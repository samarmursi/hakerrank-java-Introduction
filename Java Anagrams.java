/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
*/

//==================================== answer =================================

import java.io.*;
import java.util.*;

public class Solution {
static boolean isAnagram(String a, String b) {
        // Complete the function
           boolean flag = false;
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aList = a.toCharArray();
        Arrays.sort(aList);
        char[] bList = b.toCharArray();
        Arrays.sort(bList);
        String x = new String(aList);
        String y = new String(bList);
        
       
        if(x.equals(y)){
           flag = true; 
        }
       return flag; 
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          // Complete the function
          Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

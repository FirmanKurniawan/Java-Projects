/*
Given a palindromic string of lowercase English letters palindrome, 
replace exactly one character with any lowercase English letter so that the resulting string is not a palindrome 
and that it is the lexicographically smallest one possible.

Return the resulting string. If there is no way to replace a character to make it not a palindrome, return an empty string.
*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String palindrome = sc.nextLine();
	    char[] ch = palindrome.toCharArray();
        if(ch.length==1){
            System.out.println("");
            System.exit(0);
        }
        int i=0;
        while(i<ch.length/2 && ch[i]=='a'){
            i++;
        }
        if(i==(ch.length/2)){
            ch[ch.length-1]='b';
        }
        else
            ch[i]='a';
        palindrome = new String(ch);
        System.out.println(palindrome);
    }

}

class Palindrome {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x); //converts the integer to string
      
        StringBuilder isPalInt = new StringBuilder(s);
      
        String s_reverse = isPalInt.reverse().toString(); // reverse method reverses the stringbuilder and toString() converts the stringbuilder class to string 
        if(s_reverse.equals(s)) return true;
        return false;
    }
}

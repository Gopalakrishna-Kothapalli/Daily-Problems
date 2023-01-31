class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
       String lastWord = s.substring(s.lastIndexOf(" ")+1);
       int x= lastWord.length();
       return x;
}
}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str =new StringBuilder(20);
        int i=0;
        int j=0;
        int k=word2.length();
        while(i<word1.length() || j<word2.length()){
                if(i<word1.length()){
                    str=str.append(word1.charAt(i));
                    i=i+1;
                }
                  if( j<word2.length()){
                    str=str.append(word2.charAt(j));
                    j=j+1;
                }
        }
        return str.toString();
        
    }
}

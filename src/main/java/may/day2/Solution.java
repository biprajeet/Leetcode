package may.day2;

import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set=new HashSet<Character>();  
        
        for(int i=0; i<J.length(); i++){
            set.add(J.charAt(i));
        }
        
        int res = 0;
        
        for(int i=0; i<S.length(); i++){
            if(set.contains(S.charAt(i))) res ++;
        }
        
        return res;
    }
    
    public int numJewelsInStones1(String J, String S) {
       int freq[] = new int[58]; 
       int res = 0;
       
       for(int i=0; i<J.length(); i++){
    	   freq[J.charAt(i)-'A']++;
       }
       
       for(int i=0; i<S.length(); i++){
    	   if(freq[S.charAt(i)-'A'] > 0) res ++;
       }
       
       return res;
    }
    
    public static void main(String[] args) {
		System.out.println('z' - 'A');
    	//System.out.println(new Solution().numJewelsInStones("aA", "aAAbbbb"));
	}
}
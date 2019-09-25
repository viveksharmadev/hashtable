// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
class find-words-that-can-be-formed-by-characters {
    // tc -> n, sc-> O(26)
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        int res = 0;
        
        for(int i=0; i<chars.length(); i++)
            count[chars.charAt(i)-'a']++;
        
        for(String word : words){
            int[] ctn = Arrays.copyOf(count, count.length);
            boolean match = true;
            for(int i=0; i<word.length(); i++){
                ctn[word.charAt(i)-'a']--;
                if(ctn[word.charAt(i)-'a']<0){
                    match = false;
                    break;
                }
            }
            if(match)                
            res += word.length();
        }
        return res;
    }
}

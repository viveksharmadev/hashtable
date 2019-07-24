// https://leetcode.com/problems/find-common-characters/
class find-common-characters {
    // tc -> n, sc-> 1
    public List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<>();
        int[] map = new int[26];
        Arrays.fill(map, Integer.MAX_VALUE);
        for(String word : A){
            int[] count = new int[26];
            for(int i=0; i<word.length(); i++) count[word.charAt(i)-'a']++;
            for(int i=0; i<26; i++)
                map[i] = Math.min(map[i], count[i]);
        }
        
        for(char c='a'; c<='z'; c++){
            while(map[c-'a']-- >0) res.add(""+c);
        }
        return res;
    }
}

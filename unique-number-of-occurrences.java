// https://leetcode.com/problems/unique-number-of-occurrences/
class unique-number-of-occurrences {
    // tc -> n, sc-> n
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int a : arr) countMap.put(a, countMap.getOrDefault(a, 0)+1);
        Set<Integer> set = new HashSet<>();
        for(int c : countMap.keySet()){
            int val = countMap.get(c);
            if(!set.contains(val)) set.add(val);
            else return false;
        }
        return true;
    }
}

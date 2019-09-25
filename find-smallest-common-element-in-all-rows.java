https://leetcode.com/problems/find-smallest-common-element-in-all-rows/
class find-smallest-common-element-in-all-rows {
    // tc -> mn, sc-> O(10000)
    public int smallestCommonElement(int[][] A) {
        int[] count = new int[10001];
        int m = A.length, n = A[0].length;
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (++count[A[i][j]] == m)
                    return A[i][j];
        return -1;
    }
    
    // tc -> mn, sc-> O(mn)
    public int smallestCommonElement(int[][] A) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int m = A.length, n = A[0].length;
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j){
                int key = A[i][j];
                freqMap.put(key, freqMap.getOrDefault(key,0)+1);
                if(freqMap.get(key)==m) return key;    
            }
        return -1;
    }
}


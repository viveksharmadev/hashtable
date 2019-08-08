// https://leetcode.com/problems/largest-unique-number/

class largest-unique-number {
    // tc -> n, sc -> n
    public int largestUniqueNumber(int[] A) {
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0; i<A.length; i++){
            freqMap.put(A[i], freqMap.getOrDefault(A[i],0)+1);
        }
        
        for(int key : freqMap.keySet()){
            if(freqMap.get(key)==1)
            max = Math.max(key, max);
        }
        
        return max==Integer.MIN_VALUE ? -1 : max;
    }
}

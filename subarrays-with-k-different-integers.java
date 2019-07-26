// https://leetcode.com/problems/subarrays-with-k-different-integers/
class subarrays-with-k-different-integers {
    // tc -> n, sc-> n
    public int subarraysWithKDistinct(int[] A, int K) {
        return exactK(A, K) - exactK(A,K-1); 
    }
    
    private int exactK(int[] A, int k){
        int start = 0, end = 0;
        int total = 0;
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        while(end < A.length){
            freqMap.put(A[end], freqMap.getOrDefault(A[end],0)+1);
            if(freqMap.get(A[end])==1) count++;
            end++;
            while(count>k){
                if(freqMap.get(A[start])==1) count--;
                freqMap.put(A[start], freqMap.get(A[start])-1);
                start++;
            }
            total += end-start;
        }
        return total;
    }
}

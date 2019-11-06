// https://leetcode.com/problems/intersection-of-three-sorted-arrays/

class intersection-of-three-sorted-arrays {
    // tc -> n, sc-> n
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> res = new LinkedList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i : arr1) 
        freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        for(int i : arr2) 
        freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        for(int i : arr3) 
        freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        
        for(int key : freqMap.keySet()){
            if(freqMap.get(key)==3){
                res.add(key);
            }
        }
        return res;
    }
}

class intersection-of-three-sorted-arrays {
    // tc -> n, sc-> 1
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> res = new LinkedList<>();
        //Map<Integer, Integer> freqMap = new HashMap<>();
        int[] map = new int[2001];
        for(int i : arr1) map[i]++;
        //freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        for(int i : arr2) map[i]++;
        //freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        for(int i : arr3) map[i]++;
        //freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        
        // for(int key : freqMap.keySet()){
        //     if(freqMap.get(key)==3){
        //         res.add(key);
        //     }
        // }
        for(int i=0; i<2001; i++){
            if(map[i]==3) res.add(i);
        }
        return res;
    }
}

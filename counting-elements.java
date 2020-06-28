// https://leetcode.com/problems/counting-elements/
class Solution {
    // tc -> n, sc-> n
    public int countElements(int[] arr) {
        int res = 0;
        if(arr==null || arr.length==0) return res;
        
        Map<Integer, Integer> freqMap 
            = new HashMap<>();
        for(int a : arr){
            freqMap.put(a, freqMap.getOrDefault(a,0)+1);
        }
        
        for(int key : freqMap.keySet()){
            if(freqMap.containsKey(key+1)){
                res += freqMap.get(key);
            }
        }
        
        return res;
    }
    
    //tc -> nlogn, sc-> n
    public int countElements(int[] arr) {
        Arrays.sort(arr);
        
        int prev = 1;
        int res = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                prev++;
            }else{
                if(arr[i]==arr[i-1]+1)
                res += prev;
                prev = 1;
            }            
        }
        
        return res;
    }
}

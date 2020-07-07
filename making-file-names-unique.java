// https://leetcode.com/problems/making-file-names-unique/
class making-file-names-unique {
    // tc -> n, sc-> n
    public String[] getFolderNames(String[] names) {
        int n = names.length;
        String[] res = new String[n];
        if(names==null || names.length==0)
            return res;
        
        Map<String, Integer> freqMap = new HashMap<>();
        
        for(int i=0; i<names.length; i++){
            if(freqMap.containsKey(names[i])){
                int k = freqMap.get(names[i]);
                StringBuilder sb = new StringBuilder(names[i]);
                sb.append("(").append(k).append(")");
                while(freqMap.containsKey(sb.toString())){
                    sb = new StringBuilder(names[i]);
                    sb.append("(").append(++k).append(")");
                }
                res[i] = sb.toString();
                freqMap.put(names[i], k+1);
                freqMap.put(sb.toString(), 1);                
            }else{
                res[i] = names[i];
                freqMap.put(names[i], 1);
            }
        }
        return res;
    }
}

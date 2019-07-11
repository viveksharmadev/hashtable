//https://leetcode.com/problems/high-five/

class high-five {
    // Time complexity - Nlog5, space complexity - N where N is items size
    public int[][] highFive(int[][] items) {
        List<int[]> res = new ArrayList<>();
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int[] item : items){
            map.putIfAbsent(item[0], new PriorityQueue<>(
                new Comparator<Integer>(){
                    @Override
                    public int compare(Integer a, Integer b){
                        return b-a;
                    }
                }
            ));
            map.get(item[0]).offer(item[1]);            
        }
        
        for(int key : map.keySet()){
            PriorityQueue<Integer> pq = map.get(key);
             int avg = 0, count=0;
            while(pq!=null && !pq.isEmpty() && count < 5){
                avg += pq.poll();
                count++;
            }
            res.add(new int[]{key, avg/5});
        }
        return res.toArray(new int[][]{});
    }
}

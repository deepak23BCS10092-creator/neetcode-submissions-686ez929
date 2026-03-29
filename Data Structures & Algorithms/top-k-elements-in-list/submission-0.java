class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            // hm.getOrDefault(num,hm.get(num)+1);
            if(!hm.containsKey(num)){
                hm.put(num,0);
            }hm.put(num,hm.get(num)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(hm.get(b)-hm.get(a)));
        for(int nus : hm.keySet()){
            pq.add(nus);
        }

        int[] ans = new int[k];
        int idx =0;
        while(idx<k){
            ans[idx] = pq.poll();
            idx++;
        }
        return ans;
    }
}

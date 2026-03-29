class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> hm = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            String str = strs[i];
            int[] arr = charCountArr(str);
            String countStr = Arrays.toString(arr);
            if(!hm.containsKey(countStr)){
                hm.put(countStr , new ArrayList<>());
            }
            hm.get(countStr).add(str);
        }
        
        
        List<List<String>> ans = new ArrayList<List<String>>();
        for(List<String> fns : hm.values()){
            ans.add(fns);
        }
        return ans;
    }

    public int[] charCountArr(String S){
        int[] arr = new int[26];
        for(int i =0;i<S.length();i++){
            char ch = S.charAt(i);
            arr[ch-'a']++;
        }
        return arr;
    }
}

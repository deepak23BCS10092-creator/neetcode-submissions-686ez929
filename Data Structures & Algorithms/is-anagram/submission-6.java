class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Integer>
        int[] countS = new int[26];
        int[] countM = new int[26];

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int charVal = ch;
            countS[charVal-'a']++;
        }

        // System.out.println();

        for(int i =0;i<t.length();i++){
            char ch = t.charAt(i);
            int charVal = ch;
            // System.out.print(charVal-'a');
            countM[charVal-'a']++;
        }

        // for(int i : countS){
        //     System.out.print(i+" ");
        // }
        // for(int i : countM){
        //     System.out.print(i+" ");
        // }

        return Arrays.equals(countM,countS);
    }
}

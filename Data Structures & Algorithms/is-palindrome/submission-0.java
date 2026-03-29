class Solution {
    public boolean isPalindrome(String s) {
        int first=0;
        // s=s.toString();4
        String str ="";
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ch=Character.toLowerCase(ch);
                str+=ch;
            }
        }
        System.out.print(str);
        int last= str.length()-1;


        while(first<=last){
            char chf = str.charAt(first);
            char chl = str.charAt(last);

            if(chf != chl){
                return false;
            }
            first++;
            last--;
        }   
        return true;
    }
}

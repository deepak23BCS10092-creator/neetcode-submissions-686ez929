class Solution {

    public String encode(List<String> strs) {
        String fnl ="";
        for(String str : strs){
            fnl+=str+"-";
        }
        return fnl;
    }

    public List<String> decode(String str) {
        List<String> fnl = new ArrayList<>();
        String context ="";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                fnl.add(context);
                context="";
            }else{
                context+=str.charAt(i);
            }
        }
        return fnl;
    }
}

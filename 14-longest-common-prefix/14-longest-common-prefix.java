class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder ans = new StringBuilder();
        
        String temp;
        
        boolean flag = true;
        
        for(String word : strs){
            if(flag){
                ans.append(word);
                flag = false;
                continue;
            }
            
            temp = ans.toString();
            
            ans.setLength(0);
            
            for(int i = 0; i < word.length(); i++){
                try{
                    if(word.charAt(i) == temp.charAt(i)){
                        ans.append(word.charAt(i));
                    }else{
                        break;
                    }
                }catch(Exception ex){
                    break;
                }
            }
        }
        
        
        
        return ans.toString();
        
    }
}
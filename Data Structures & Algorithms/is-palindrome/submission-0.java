class Solution {
    public boolean isPalindrome(String s) {

        s=s.toLowerCase();
        char[]ch=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        char[]arr=sb.toString().toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    


        
    }
}

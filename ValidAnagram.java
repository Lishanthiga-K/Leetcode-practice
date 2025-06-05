class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        if(n!=m){
            return false;
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        for(int i=0;i<n;i++){
            if(a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }
}

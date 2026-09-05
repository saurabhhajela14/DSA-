class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        for(int i=0;i<=s2.length()-n;i++){
            char[] a=s1.toCharArray();
            char[] b=s2.substring(i,i+n).toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b))
            return true;
        }
        return false;
    }
}
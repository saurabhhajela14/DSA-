class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) {
            return false;
        }
        int[] count1=new int[26];
        int[] count2=new int[26];
        int i=0;
        while(i<s1.length()){
            count1[s1.charAt(i)-'a']++;
            count2[s2.charAt(i)-'a']++;
            i++;
        }
        int left=0;
        int right=s1.length();
        while(right<s2.length()){
            if(Arrays.equals(count1,count2)){
                return true;
            }
            count2[s2.charAt(left)-'a']--;
            left++;
            count2[s2.charAt(right)-'a']++;
            right++;
        }
        return Arrays.equals(count1,count2);
}
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int xstart =0;
        int a = 0;
        String newOne = "";
            while(xstart<t.length() && a<s.length()){
            if(s.charAt(a)==t.charAt(xstart)){
                newOne += s.charAt(a);
                a++;

            }
               xstart++;
            }
    return s.equals(newOne);
    }
}



//////brute force method
class Solution {
    public boolean isSubsequence(String s, String t) {
        int xstart =0;
        String newOne = "";
        for(int a=0;a<s.length();a++){
            while(xstart<t.length()){
            if(s.charAt(a)==t.charAt(xstart)){
                newOne += s.charAt(a);
                xstart++;
                break;
            }
                xstart++;
            }
        }
    return s.equals(newOne)  ;
    }
}

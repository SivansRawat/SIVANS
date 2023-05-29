class Solution {
    public String makeGood(String s) {
        
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int resLength = res.length();
            if (resLength!=0 && Math.abs(res.charAt(resLength-1) - ch) == 32) {
                res.deleteCharAt(resLength - 1);
            } else {
                res.append(ch);
            }
            

        }
        return res.toString();
    }
}